package com.artesanias.ventas.services;


import com.artesanias.ventas.dto.OrdenRequestDto;
import com.artesanias.ventas.dto.OrdenResponseDto;
import com.artesanias.ventas.exception.OrdenNotCreatedException;

public interface IOrdenService {
    OrdenResponseDto generarOrden(OrdenRequestDto ordenRequestDto) throws OrdenNotCreatedException;
}
