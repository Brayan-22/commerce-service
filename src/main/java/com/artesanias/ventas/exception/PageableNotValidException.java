package com.artesanias.ventas.exception;

public class PageableNotValidException extends RuntimeException {
    public PageableNotValidException(String message) {
        super(message);
    }
}
