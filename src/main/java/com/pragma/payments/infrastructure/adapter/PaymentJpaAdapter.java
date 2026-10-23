package com.pragma.payments.infrastructure.adapter;

import com.pragma.payments.domain.model.Payment;
import com.pragma.payments.domain.port.PaymentRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class PaymentJpaAdapter implements PaymentRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Payment save(Payment payment) {
        if (payment.id() == null) {
            return insertPayment(payment);
        } else {
            return updatePayment(payment);
        }
    }

    private Payment insertPayment(Payment payment) {
        Query query = entityManager.createNativeQuery(
            "INSERT INTO payments (id, user_id, order_id, amount, currency, status, transaction_reference, created_at) " +
            "VALUES (?, ?, ?, ?, ?, ?, ?, ?) RETURNING id, user_id, order_id, amount, currency, status, transaction_reference, created_at",
            Payment.class
        );
        query.setParameter(1, payment.id().toString());
        query.setParameter(2, payment.userId());
        query.setParameter(3, payment.orderId());
        query.setParameter(4, payment.amount());
        query.setParameter(5, payment.currency());
        query.setParameter(6, payment.status());
        query.setParameter(7, payment.transactionReference());
        query.setParameter(8, payment.createdAt().toString());
        
        return payment;
    }

    private Payment updatePayment(Payment payment) {
        Query query = entityManager.createNativeQuery(
            "UPDATE payments SET user_id = ?, order_id = ?, amount = ?, currency = ?, " +
            "status = ?, transaction_reference = ? WHERE id = ? " +
            "RETURNING id, user_id, order_id, amount, currency, status, transaction_reference, created_at",
            Payment.class
        );
        query.setParameter(1, payment.userId());
        query.setParameter(2, payment.orderId());
        query.setParameter(3, payment.amount());
        query.setParameter(4, payment.currency());
        query.setParameter(5, payment.status());
        query.setParameter(6, payment.transactionReference());
        query.setParameter(7, payment.id().toString());
        
        return payment;
    }

    @Override
    public Optional<Payment> findById(UUID id) {
        Query query = entityManager.createNativeQuery(
            "SELECT id, user_id, order_id, amount, currency, status, transaction_reference, created_at " +
            "FROM payments WHERE id = ?",
            Payment.class
        );
        query.setParameter(1, id.toString());
        
        try {
            Payment result = (Payment) query.getSingleResult();
            return Optional.of(result);
        } catch (jakarta.persistence.NoResultException e) {
            return Optional.empty();
        }
    }

    @Override
    public List<Payment> findByUserId(String userId) {
        Query query = entityManager.createNativeQuery(
            "SELECT id, user_id, order_id, amount, currency, status, transaction_reference, created_at " +
            "FROM payments WHERE user_id = ? ORDER BY created_at DESC",
            Payment.class
        );
        query.setParameter(1, userId);
        
        return query.getResultList();
    }

    @Override
    public List<Payment> findByStatus(String status) {
        Query query = entityManager.createNativeQuery(
            "SELECT id, user_id, order_id, amount, currency, status, transaction_reference, created_at " +
            "FROM payments WHERE status = ? ORDER BY created_at DESC",
            Payment.class
        );
        query.setParameter(1, status);
        
        return query.getResultList();
    }

    @Override
    public List<Payment> findByOrderId(String orderId) {
        Query query = entityManager.createNativeQuery(
            "SELECT id, user_id, order_id, amount, currency, status, transaction_reference, created_at " +
            "FROM payments WHERE order_id = ? ORDER BY created_at DESC",
            Payment.class
        );
        query.setParameter(1, orderId);
        
        return query.getResultList();
    }

    @Override
    public void deleteById(UUID id) {
        Query query = entityManager.createNativeQuery("DELETE FROM payments WHERE id = ?");
        query.setParameter(1, id.toString());
        query.executeUpdate();
    }
}