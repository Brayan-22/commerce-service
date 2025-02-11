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
    private String id;
    private String nombre;
    private Double precio;
    private String descripcion;
    private String urlImagen;
    private Integer id_categoria;
}
