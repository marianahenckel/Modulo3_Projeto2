package com.Modulo3_Projeto2.Projeto2.models.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Modulo3_Projeto2.Projeto2.models.entity.Categoria;


@Repository
public interface categoriaRepository extends JpaRepository<Categoria, Long> {
    
    boolean existsByNome(String nome);

    Optional<Categoria> findByNome(String nome);

}