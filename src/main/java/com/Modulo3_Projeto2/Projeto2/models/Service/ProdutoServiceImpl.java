package com.Modulo3_Projeto2.Projeto2.models.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Modulo3_Projeto2.Projeto2.models.Service.interfaces.ProdutoService;
import com.Modulo3_Projeto2.Projeto2.models.entity.Produto;

@Service
public class ProdutoServiceImpl implements ProdutoService{

    @Override
    public Produto salvar(Produto object) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Produto atualizar(Produto object) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Produto buscar(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Produto> listar() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deletar(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Produto buscarPorNome(String nome) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
