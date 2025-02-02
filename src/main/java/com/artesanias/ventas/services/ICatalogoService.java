package com.artesanias.ventas.services;

import com.artesanias.ventas.dto.CategoriaResponseDto;
import com.artesanias.ventas.dto.ProductoResponseDto;
import com.artesanias.ventas.exception.CategoriaNotFoundException;
import com.artesanias.ventas.exception.PageableNotValidException;
import com.artesanias.ventas.exception.ProductNotFoundException;

import java.util.List;

public interface ICatalogoService {
    List<ProductoResponseDto> getCatalogo(int page, int size)throws PageableNotValidException;
    ProductoResponseDto getProductoByNombre(String nombre)throws ProductNotFoundException;
    List<CategoriaResponseDto> getCategorias() throws CategoriaNotFoundException;
    List<ProductoResponseDto> getProductosByCategoria(Integer id,int page,int size) throws CategoriaNotFoundException,ProductNotFoundException;
}
