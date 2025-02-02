package com.artesanias.ventas.repository;

import com.artesanias.ventas.entity.CategoriaEntity;
import com.artesanias.ventas.entity.ProductoEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoRepository extends JpaRepository<ProductoEntity,String> {
    Optional<ProductoEntity> findByNombre(String nombre);

    List<ProductoEntity> findProductoEntitiesByCategoria(CategoriaEntity categoria, Pageable pageable);
}
