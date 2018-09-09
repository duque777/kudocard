package br.com.ventron.rh.integracao.kudo.datasource.model;

import br.com.ventron.rh.integracao.kudo.dto.CategoriaDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "categoria")
@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "urlImagem")
    private String urlImagemCategoria;

    @Column(name = "ativo")
    private boolean ativo;

    public Categoria(CategoriaDTO categoriaDTO) {
        this.nome = categoriaDTO.getNomeCategoria();
        this.titulo = categoriaDTO.getTituloCategoria();
        this.urlImagemCategoria = categoriaDTO.getUrlImagemCategoria();
    }
}
