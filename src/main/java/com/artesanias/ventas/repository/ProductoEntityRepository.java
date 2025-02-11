package com.artesanias.ventas.repository;

import com.artesanias.ventas.entity.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoEntityRepository extends JpaRepository<ProductoEntity, String> {
}