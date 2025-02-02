package com.artesanias.ventas.services.impl;

import com.artesanias.ventas.dto.CategoriaResponseDto;
import com.artesanias.ventas.dto.ProductoResponseDto;
import com.artesanias.ventas.entity.CategoriaEntity;
import com.artesanias.ventas.entity.ProductoEntity;
import com.artesanias.ventas.exception.CategoriaNotFoundException;
import com.artesanias.ventas.exception.PageableNotValidException;
import com.artesanias.ventas.exception.ProductNotFoundException;
import com.artesanias.ventas.repository.CategoriaRepository;
import com.artesanias.ventas.repository.ProductoRepository;
import com.artesanias.ventas.services.ICatalogoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class CatalogoService implements ICatalogoService {

    private final ProductoRepository productoRepository;
    private final CategoriaRepository categoriaRepository;
    @Override
    public List<ProductoResponseDto> getCatalogo(int page, int size) throws PageableNotValidException {
        if (page < 0 || size < 0) throw new PageableNotValidException("Page and size must be greater than 0");
        Pageable pageable = Pageable.ofSize(size).withPage(page);
        return productoRepository.findAll(pageable).getContent().stream().map(
                pe -> ProductoResponseDto.builder()
                        .nombre(pe.getNombre())
                        .descripcion(pe.getDescripcion())
                        .precio(pe.getPrecio())
                        .build()
        ).collect(Collectors.toList());
    }

    @Override
    public ProductoResponseDto getProductoByNombre(String nombre) throws ProductNotFoundException {
        ProductoEntity productoEntity = productoRepository.findByNombre(nombre).orElseThrow(()-> new ProductNotFoundException("Product not found"));
        return ProductoResponseDto.builder()
                .nombre(productoEntity.getNombre())
                .descripcion(productoEntity.getDescripcion())
                .precio(productoEntity.getPrecio())
                .build();
    }

    @Override
    public List<CategoriaResponseDto> getCategorias() throws CategoriaNotFoundException {
        List<CategoriaEntity> categoriaEntities = categoriaRepository.findAll();
        if (categoriaEntities.isEmpty()) throw new CategoriaNotFoundException("No categories found");
        return categoriaEntities.stream().map(
                ce -> CategoriaResponseDto.builder()
                        .id(ce.getId())
                        .nombre(ce.getNombre())
                        .descripcion(ce.getDescripcion())
                        .build()
        ).collect(Collectors.toList());
    }

    @Override
    public List<ProductoResponseDto> getProductosByCategoria(Integer id, int page, int size) throws CategoriaNotFoundException, ProductNotFoundException {
        CategoriaEntity categoriaEntity = categoriaRepository.findById(id).orElseThrow(()-> new CategoriaNotFoundException("Category not found"));;
        List<ProductoResponseDto> productos = productoRepository.findProductoEntitiesByCategoria(categoriaEntity, PageRequest.of(page, size)).stream().map(
                pe -> ProductoResponseDto.builder()
                        .nombre(pe.getNombre())
                        .descripcion(pe.getDescripcion())
                        .precio(pe.getPrecio())
                        .build()
        ).toList();
        if (productos.isEmpty()) throw new ProductNotFoundException("No products found");
        return productos;
    }
}
