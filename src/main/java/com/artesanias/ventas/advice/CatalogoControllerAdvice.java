package com.artesanias.ventas.advice;

import com.artesanias.ventas.exception.CategoriaNotFoundException;
import com.artesanias.ventas.exception.PageableNotValidException;
import com.artesanias.ventas.exception.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CatalogoControllerAdvice {

    @ExceptionHandler(PageableNotValidException.class)
    public ResponseEntity<?> handlePageableNotValidException(PageableNotValidException ex) {
        return ResponseEntity.badRequest().body(ex.getMessage());
    }

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<?> handleProductNotFoundException(ProductNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }

    @ExceptionHandler(CategoriaNotFoundException.class)
    public ResponseEntity<?> handleCategoriaNotFoundException(CategoriaNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }
}
