package com.example.EShopping.Exception;

public class EmailAndPhoneNumberAlreadyExistsException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public EmailAndPhoneNumberAlreadyExistsException(String exception) {
        super(exception);
    }
}