package com.Modulo3_Projeto2.Projeto2.models.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Modulo3_Projeto2.Projeto2.models.Service.interfaces.CategoriaService;
import com.Modulo3_Projeto2.Projeto2.models.entity.Categoria;
import com.Modulo3_Projeto2.Projeto2.models.repository.categoriaRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class CategoriaServiceImpl implements CategoriaService{
    
    
    @Override
    public Categoria salvar(Categoria object) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Categoria atualizar(Categoria object) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Categoria buscar(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Categoria> listar() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deletar(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Categoria buscarPorNome(String nome) {
        // TODO Auto-generated method stub
        return null;
    }
    
    
}
