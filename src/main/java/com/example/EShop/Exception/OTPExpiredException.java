package com.example.EShop.Exception;

public class OTPExpiredException extends  RuntimeException {

    private static final long serialVersionUID = 1L;

    public OTPExpiredException(String exception) {
        super(exception);
    }
}