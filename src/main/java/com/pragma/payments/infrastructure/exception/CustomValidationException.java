package com.pragma.payments.infrastructure.exception;

import java.util.HashMap;
import java.util.Map;

public class CustomValidationException extends RuntimeException {
    private final Map<String, String> errors;

    public CustomValidationException(String message) {
        super(message);
        this.errors = new HashMap<>();
    }

    public CustomValidationException(String message, Map<String, String> errors) {
        super(message);
        this.errors = errors != null ? new HashMap<>(errors) : new HashMap<>();
    }

    public CustomValidationException(String message, String field, String errorMessage) {
        super(message);
        this.errors = new HashMap<>();
        this.errors.put(field, errorMessage);
    }

    public Map<String, String> getErrors() {
        return new HashMap<>(errors);
    }

    public void addError(String field, String errorMessage) {
        this.errors.put(field, errorMessage);
    }
}