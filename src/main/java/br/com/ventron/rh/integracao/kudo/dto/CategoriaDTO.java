package br.com.ventron.rh.integracao.kudo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaDTO {

    private String nomeCategoria;
    private String urlImagemCategoria;
    private String tituloCategoria;
}
