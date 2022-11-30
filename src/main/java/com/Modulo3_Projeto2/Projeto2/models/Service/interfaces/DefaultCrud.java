package com.Modulo3_Projeto2.Projeto2.models.Service.interfaces;

import java.util.List;

public interface DefaultCrud <T>{
    T salvar(T object);
    T atualizar(T object);
    T buscar(Long id);
    List<T> listar();
    void deletar(Long id);
}
