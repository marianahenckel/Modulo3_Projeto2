package com.Modulo3_Projeto2.Projeto2.api.dto.request;

import java.util.List;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaRequestDto {
    
    @NotNull
    private String nome;

    private List<CategoriaRequestDto> categorias;
}
