package br.com.ventron.rh.integracao.kudo.datasource.repository;

import br.com.ventron.rh.integracao.kudo.datasource.model.Categoria;
import br.com.ventron.rh.integracao.kudo.datasource.model.KudoCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface KudoCardRepository extends JpaRepository<KudoCard, Integer> {

    @Query("select k from KudoCard k where data >= :data")
    public List<KudoCard> findAllKudoCardApartirData(@Param("data")Date data);
}
