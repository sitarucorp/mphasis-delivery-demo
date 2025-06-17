package com.mphasis.delivery.demo.backend.exceptions;

public class UnknownAccessKeyException extends Exception implements DashboardException {
    public UnknownAccessKeyException(String message) {
        super(message);
    }
}
