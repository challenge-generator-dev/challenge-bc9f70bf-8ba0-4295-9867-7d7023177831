package com.pragma.payments.application.service;

import com.pragma.payments.domain.model.Payment;
import com.pragma.payments.domain.port.PaymentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Transactional
    public Payment createPayment(String userId, String orderId, BigDecimal amount, String currency) {
        validatePaymentData(userId, orderId, amount);

        String transactionReference = generateTransactionReference();
        
        Payment payment = Payment.builder()
                .id(UUID.randomUUID())
                .userId(userId)
                .orderId(orderId)
                .amount(amount)
                .currency(currency)
                .status("PENDING")
                .transactionReference(transactionReference)
                .createdAt(LocalDateTime.now())
                .build();

        return paymentRepository.save(payment);
    }

    @Transactional
    public Payment processPayment(UUID paymentId) {
        Payment payment = paymentRepository.findById(paymentId)
                .orElseThrow(() -> new IllegalArgumentException("Payment not found: " + paymentId));

        if (!"PENDING".equals(payment.status())) {
            throw new IllegalStateException("Payment cannot be processed in status: " + payment.status());
        }

        String transactionReference = generateTransactionReference();
        Payment updatedPayment = payment
                .withStatus("PROCESSED")
                .withTransactionReference(transactionReference);

        return paymentRepository.save(updatedPayment);
    }

    @Transactional
    public Payment cancelPayment(UUID paymentId, String reason) {
        Payment payment = paymentRepository.findById(paymentId)
                .orElseThrow(() -> new IllegalArgumentException("Payment not found: " + paymentId));

        if ("PROCESSED".equals(payment.status()) || "COMPLETED".equals(payment.status())) {
            throw new IllegalStateException("Cannot cancel payment in status: " + payment.status());
        }

        Payment cancelledPayment = payment.withStatus("CANCELLED");
        return paymentRepository.save(cancelledPayment);
    }

    public Optional<Payment> getPaymentById(UUID paymentId) {
        return paymentRepository.findById(paymentId);
    }

    public List<Payment> getPaymentsByUser(String userId) {
        return paymentRepository.findByUserId(userId);
    }

    public List<Payment> getPaymentsByStatus(String status) {
        return paymentRepository.findByStatus(status);
    }

    public List<Payment> getPaymentsByOrder(String orderId) {
        return paymentRepository.findByOrderId(orderId);
    }

    @Transactional
    public void deletePayment(UUID paymentId) {
        Payment payment = paymentRepository.findById(paymentId)
                .orElseThrow(() -> new IllegalArgumentException("Payment not found: " + paymentId));
        
        paymentRepository.deleteById(paymentId);
    }

    private void validatePaymentData(String userId, String orderId, BigDecimal amount) {
        if (userId == null || userId.isBlank()) {
            throw new IllegalArgumentException("User ID is required");
        }
        if (orderId == null || orderId.isBlank()) {
            throw new IllegalArgumentException("Order ID is required");
        }
        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
    }

    private String generateTransactionReference() {
        return "TXN-" + UUID.randomUUID().toString().toUpperCase();
    }
}