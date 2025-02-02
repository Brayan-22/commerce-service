package com.artesanias.ventas.exception;

public class CategoriaNotFoundException extends RuntimeException {
    public CategoriaNotFoundException(String message) {
        super(message);
    }
}
