package br.com.ventron.rh.integracao.kudo.datasource.repository;

import br.com.ventron.rh.integracao.kudo.datasource.model.Categoria;
import org.hibernate.validator.constraints.SafeHtml;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

    @Query("select c from Categoria c where c.ativo = :ativo")
    public List<Categoria> findAllAtivos(@Param("ativo") boolean ativo);
}
