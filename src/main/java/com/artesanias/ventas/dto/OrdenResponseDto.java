package com.artesanias.ventas.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdenResponseDto {
    private String idOrden;
    private String fechaOrden;
    private String estadoOrde;
}
