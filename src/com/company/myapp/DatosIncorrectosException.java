package com.company.myapp;

public class DatosIncorrectosException extends RuntimeException{
    public DatosIncorrectosException(String message) {
        super(message);
    }
}