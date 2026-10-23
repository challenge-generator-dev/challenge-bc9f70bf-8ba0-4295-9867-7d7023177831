package com.pragma.payments.domain.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public record Payment(
    UUID id,
    String orderId,
    BigDecimal amount,
    String currency,
    String paymentMethod,
    String status,
    LocalDateTime createdAt,
    LocalDateTime updatedAt,
    String userId,
    String transactionReference
) {
    public Payment {
        if (id == null) {
            id = UUID.randomUUID();
        }
        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        if (currency == null || currency.isBlank()) {
            throw new IllegalArgumentException("Currency is required");
        }
        if (paymentMethod == null || paymentMethod.isBlank()) {
            throw new IllegalArgumentException("Payment method is required");
        }
        if (status == null || status.isBlank()) {
            status = "PENDING";
        }
        if (createdAt == null) {
            createdAt = LocalDateTime.now();
        }
        if (updatedAt == null) {
            updatedAt = LocalDateTime.now();
        }
        if (userId == null || userId.isBlank()) {
            throw new IllegalArgumentException("User ID is required");
        }
    }

    public Payment withStatus(String newStatus) {
        return new Payment(
            this.id,
            this.orderId,
            this.amount,
            this.currency,
            this.paymentMethod,
            newStatus,
            this.createdAt,
            LocalDateTime.now(),
            this.userId,
            this.transactionReference
        );
    }

    public Payment withTransactionReference(String reference) {
        return new Payment(
            this.id,
            this.orderId,
            this.amount,
            this.currency,
            this.paymentMethod,
            this.status,
            this.createdAt,
            LocalDateTime.now(),
            this.userId,
            reference
        );
    }
}