package com.pragma.payments.infrastructure.controller;

import com.pragma.payments.domain.model.Payment;
import com.pragma.payments.application.service.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/payments")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping
    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    public ResponseEntity<Payment> createPayment(@RequestBody PaymentRequest request) {
        Payment payment = new Payment(
                UUID.randomUUID().toString(),
                request.orderId(),
                request.userId(),
                request.amount(),
                request.currency(),
                "PENDING",
                null,
                null,
                null
        );
        Payment created = paymentService.createPayment(payment);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    public ResponseEntity<Payment> getPaymentById(@PathVariable String id) {
        return paymentService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<Payment>> getAllPayments(
            @RequestParam(required = false) String status,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "20") int size) {
        List<Payment> payments;
        if (status != null && !status.isEmpty()) {
            payments = paymentService.findByStatus(status);
        } else {
            payments = paymentService.getAllPayments();
        }
        return ResponseEntity.ok(payments);
    }

    @GetMapping("/user/{userId}")
    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    public ResponseEntity<List<Payment>> getPaymentsByUser(@PathVariable String userId) {
        List<Payment> payments = paymentService.findByUserId(userId);
        return ResponseEntity.ok(payments);
    }

    @GetMapping("/order/{orderId}")
    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    public ResponseEntity<List<Payment>> getPaymentsByOrder(@PathVariable String orderId) {
        List<Payment> payments = paymentService.findByOrderId(orderId);
        return ResponseEntity.ok(payments);
    }

    @PutMapping("/{id}/status")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Payment> updatePaymentStatus(
            @PathVariable String id,
            @RequestBody StatusUpdateRequest request) {
        return paymentService.findById(id)
                .map(payment -> {
                    Payment updated = paymentService.updatePaymentStatus(payment.id(), request.status());
                    return ResponseEntity.ok(updated);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}/complete")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Payment> completePayment(@PathVariable String id) {
        return paymentService.findById(id)
                .map(payment -> {
                    Payment completed = paymentService.completePayment(payment.id(), "TXN-" + UUID.randomUUID());
                    return ResponseEntity.ok(completed);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Void> deletePayment(@PathVariable String id) {
        if (paymentService.findById(id).isPresent()) {
            paymentService.deletePayment(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    public record PaymentRequest(
            String orderId,
            String userId,
            String amount,
            String currency
    ) {}

    public record StatusUpdateRequest(String status) {}
}