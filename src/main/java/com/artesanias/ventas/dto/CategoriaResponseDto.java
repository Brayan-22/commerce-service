package com.artesanias.ventas.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoriaResponseDto {
    private Integer id;
    private String nombre;
    private String descripcion;
}
