package com.Modulo3_Projeto2.Projeto2.api.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Modulo3_Projeto2.Projeto2.models.Service.interfaces.ProdutoService;
import com.Modulo3_Projeto2.Projeto2.models.entity.Produto;

import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
//     Cadastro de produto:
// Não permitir cadastro duplicado
// Não permitir cadastro com campos inválidos
// Campos necessários:
// Identificador do produto: Único, autogerado
// Identificador da categoria: Utilizar categoria válida e já criada
// Nome do produto: Tipo texto, preenchimento obrigatório
// Valor do produto: Tipo numérico, preenchimento obrigatório
// Status do produto: Comprado ou não comprado
// Listar todos os produtos cadastrados com seus respectivos campos
// Deleção de produto:
// Deletar um produto por identificador

@Autowired
private ProdutoService produtoService;

@PostMapping
public ResponseEntity<List<Produto>> listar(){
    return ResponseEntity.ok(produtoService.listar());
}

@GetMapping("/id")
public ResponseEntity<Produto> buscar(@PathVariable Long id){
    return ResponseEntity.ok(this.produtoService.buscar(id));
}

@PutMapping
public ResponseEntity<Produto> atualizar(@RequestBody @Valid Produto produto) {
    return ResponseEntity.ok(this.produtoService.atualizar(produto));
}

@DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        this.produtoService.deletar(id);
        return ResponseEntity.ok().build();
    }

}
