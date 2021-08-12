package com.example.mobileappws.exceptions;

public class UserServiceException extends RuntimeException{
    private static final long serialVersionUID = 1366339493770725265L;

    public UserServiceException(String message) {
        super(message);
    }
}
