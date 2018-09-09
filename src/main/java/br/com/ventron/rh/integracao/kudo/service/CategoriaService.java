package br.com.ventron.rh.integracao.kudo.service;

import br.com.ventron.rh.integracao.kudo.datasource.model.Categoria;
import br.com.ventron.rh.integracao.kudo.datasource.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> buscarTodasCategorias(){
        List<Categoria> categorias = categoriaRepository.findAll();
        return categorias;
    }

    public List<Categoria> buscarTodasCategoriasAtivas(){
        List<Categoria> categorias = categoriaRepository.findAllAtivos(true);
        return categorias;
    }

    public List<Categoria> buscarTodasCategoriasInativas(){
        List<Categoria> categorias = categoriaRepository.findAllAtivos(false);
        return categorias;
    }

    public void salvarCategoria(Categoria categoria){
        categoriaRepository.save(categoria);
    }

    public Categoria buscarCategoriaPeloId(Integer id){
        return categoriaRepository.findById(id).get();
    }

    public void inativarCategoria(Integer id){
        Categoria categoria = buscarCategoriaPeloId(id);
        categoria.setAtivo(false);
        categoriaRepository.save(categoria);
    }

    public void ativarCategoria(Integer id){
        Categoria categoria = buscarCategoriaPeloId(id);
        categoria.setAtivo(true);
        categoriaRepository.save(categoria);
    }

}
