package com.artesanias.ventas.controller;

import com.artesanias.ventas.dto.CategoriaResponseDto;
import com.artesanias.ventas.dto.ProductoResponseDto;
import com.artesanias.ventas.services.ICatalogoService;

import io.swagger.v3.oas.annotations.Parameter;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/catalogo")
@RequiredArgsConstructor
public class CatalogoController {

    private final ICatalogoService catalogoService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ProductoResponseDto>> getCatalogo(@RequestParam int page,@RequestParam int size,
                                         @RequestParam(required = false) String sortbyprice) {
        return ResponseEntity.ok(catalogoService.getCatalogo(page, size, sortbyprice));
    }


    @GetMapping(value = "/producto",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ProductoResponseDto> getProductoByNombre(@RequestParam String nombre) {
        return ResponseEntity.ok(catalogoService.getProductoByNombre(nombre));
    }

    @GetMapping(value = "/categoria",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CategoriaResponseDto>> getCategorias() {
        return ResponseEntity.ok(catalogoService.getCategorias());
    }



    @GetMapping(value = "/producto/{idCategoria}",produces = MediaType.APPLICATION_JSON_VALUE,path = "/producto/{idCategoria}")
    public ResponseEntity<List<ProductoResponseDto>> getProductosByCategoria(@Parameter(description = "Id categoria",required = true)
                                                     @PathVariable Integer idCategoria,
                                                     @RequestParam int page,@RequestParam int size,
                                                     @RequestParam(required = false) String sortbyprice) {
        return ResponseEntity.ok(catalogoService.getProductosByCategoria(idCategoria,page,size,sortbyprice));
    }
}