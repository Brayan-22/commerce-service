package com.artesanias.ventas.services.impl;

import com.artesanias.ventas.dto.OrdenRequestDto;
import com.artesanias.ventas.dto.OrdenResponseDto;
import com.artesanias.ventas.exception.OrdenNotCreatedException;
import com.artesanias.ventas.services.IOrdenService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrdenService implements IOrdenService {


    @Override
    public OrdenResponseDto generarOrden(OrdenRequestDto ordenRequestDto) throws OrdenNotCreatedException {

    }
}
