package com.Modulo3_Projeto2.Projeto2.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Modulo3_Projeto2.Projeto2.models.entity.produto;

@Repository
public interface produtoRepository extends JpaRepository<produto, Long>{
    
}
