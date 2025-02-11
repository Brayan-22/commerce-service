package com.artesanias.ventas.controller;

import com.artesanias.ventas.dto.OrdenRequestDto;
import com.artesanias.ventas.dto.OrdenResponseDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orden")
public class OrdenController {

    @PostMapping("/pedido")
    public ResponseEntity<OrdenResponseDto> generarOrder(@RequestBody@Valid OrdenRequestDto requestDto, BindingResult result){
        if (result.hasErrors()){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(new OrdenResponseDto());
    }
}
