package com.Modulo3_Projeto2.Projeto2.models.Service.interfaces;

import com.Modulo3_Projeto2.Projeto2.models.entity.Categoria;

public interface CategoriaService extends DefaultCrud<Categoria> {
    Categoria buscarPorNome(String nome);

}