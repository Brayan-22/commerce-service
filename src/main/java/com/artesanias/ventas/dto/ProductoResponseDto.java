package com.artesanias.ventas.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductoResponseDto {
    private String nombre;
    private Double precio;
    private String descripcion;
    private String urlImagen;
}
