package br.com.ventron.rh.integracao.kudo.datasource.model;


import br.com.ventron.rh.integracao.kudo.Utils.Util;
import br.com.ventron.rh.integracao.kudo.dto.KudoCardDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "kudocard")
public class KudoCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "categoria")
    private Categoria categoria;

    @Column(name = "data")
    private Date data;

    @Column(name = "autor")
    private String autor;

    @Column(name = "destinatario")
    private String destinatario;

    @Column(name = "texto")
    private String texto;

    public KudoCard(KudoCardDTO kudoCardDTO) {
        this.autor = kudoCardDTO.getAutor();
        this.categoria = kudoCardDTO.getCategoria();
        this.destinatario = kudoCardDTO.getDestinatario();
        this.texto = kudoCardDTO.getTexto();
        this.data = Util.getNewDate();
    }
}
