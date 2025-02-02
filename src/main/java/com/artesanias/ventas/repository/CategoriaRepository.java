package com.artesanias.ventas.repository;

import com.artesanias.ventas.entity.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CategoriaRepository extends JpaRepository<CategoriaEntity,Integer> {
    Optional<CategoriaEntity> findByNombre(String nombre);
    Optional<CategoriaEntity> findById(int id);
}