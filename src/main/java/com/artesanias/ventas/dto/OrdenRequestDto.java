package com.artesanias.ventas.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrdenRequestDto {
    @NotNull
    private ClienteRequestDto cliente;
    @NotNull
    private List<ProductoRequestDto> productos;
}
