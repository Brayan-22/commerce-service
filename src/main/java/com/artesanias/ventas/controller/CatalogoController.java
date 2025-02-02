package com.artesanias.ventas.controller;

import com.artesanias.ventas.services.ICatalogoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/catalogo")
@RequiredArgsConstructor
public class CatalogoController {

    private final ICatalogoService catalogoService;

    @GetMapping
    public ResponseEntity<?> getCatalogo(@RequestParam("page") int page,@RequestParam("size") int size) {
        return ResponseEntity.ok(catalogoService.getCatalogo(page, size));
    }


    @GetMapping("/producto")
    public ResponseEntity<?> getProductoByNombre(@RequestParam("nombre") String nombre) {
        return ResponseEntity.ok(catalogoService.getProductoByNombre(nombre));
    }

    @GetMapping("/categoria")
    public ResponseEntity<?> getCategorias() {
        return ResponseEntity.ok(catalogoService.getCategorias());
    }
    @GetMapping("/producto/{id_categoria}")
    public ResponseEntity<?> getProductosByCategoria(@PathVariable("id_categoria") Integer id_categoria,
                                                     @RequestParam("page") int page,@RequestParam("size") int size) {
        return ResponseEntity.ok(catalogoService.getProductosByCategoria(id_categoria,page,size));
    }
}

