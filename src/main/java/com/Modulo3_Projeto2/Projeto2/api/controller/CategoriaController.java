package com.Modulo3_Projeto2.Projeto2.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Modulo3_Projeto2.Projeto2.api.dto.request.CategoriaRequestDto;
import com.Modulo3_Projeto2.Projeto2.models.Service.CategoriaServiceImpl;
import com.Modulo3_Projeto2.Projeto2.models.entity.Categoria;

import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    
    @Autowired
    private CategoriaServiceImpl categoriaService;

    @PostMapping
    public ResponseEntity<Categoria> salvar(@RequestBody @Valid Categoria categoria) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(this.categoriaService.salvar(categoria));
    }

    @PutMapping
    public ResponseEntity<Categoria> atualizar(@RequestBody @Valid Categoria categoria) {
        return ResponseEntity.ok(this.categoriaService.atualizar(categoria));
    }
    @GetMapping
    public ResponseEntity<List<Categoria>> listar(){
        return ResponseEntity.ok(this.categoriaService.listar());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Categoria> buscar(@PathVariable Long id) {
        return ResponseEntity.ok(this.categoriaService.buscar(id));
    }

    @GetMapping("/buscar-por-nome") 
    public ResponseEntity<Categoria> buscarPorNome(@PathParam("nome") String nome) {
       return ResponseEntity.ok(this.categoriaService.buscarPorNome(nome));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        this.categoriaService.deletar(id);
        return ResponseEntity.ok().build();
    }

    
}
