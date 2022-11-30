package com.Modulo3_Projeto2.Projeto2.models.Service.interfaces;

import com.Modulo3_Projeto2.Projeto2.models.entity.Produto;

public interface ProdutoService extends DefaultCrud<Produto>{
    Produto buscarPorNome(String nome);
}
