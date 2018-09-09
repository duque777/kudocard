package br.com.ventron.rh.integracao.kudo.dto;

import br.com.ventron.rh.integracao.kudo.datasource.model.Categoria;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class KudoCardDTO {

    private String autor;
    private String destinatario;
    private String texto;
    private Categoria categoria;

}
