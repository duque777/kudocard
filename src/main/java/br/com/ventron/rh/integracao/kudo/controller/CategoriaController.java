package br.com.ventron.rh.integracao.kudo.controller;

import br.com.ventron.rh.integracao.kudo.datasource.model.Categoria;
import br.com.ventron.rh.integracao.kudo.dto.CategoriaDTO;
import br.com.ventron.rh.integracao.kudo.service.CategoriaService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @ApiOperation(value = "Pegar todas categorias de KUDOCARD")
    @RequestMapping(path = "/buscarCategorias", method = RequestMethod.GET)
    public ResponseEntity<List<Categoria>> buscarTodasCategorias(){
        return new ResponseEntity<>(categoriaService.buscarTodasCategorias(), HttpStatus.OK);
    }

    @ApiOperation(value = "Pegar todas categorias Ativas de KUDOCARD")
    @RequestMapping(path = "/buscarCategoriasAtivas", method = RequestMethod.GET)
    public ResponseEntity<List<Categoria>> buscarTodasCategoriasAtivas(){
        return new ResponseEntity<>(categoriaService.buscarTodasCategoriasAtivas(), HttpStatus.OK);
    }

    @ApiOperation(value = "Pegar todas categorias Inativas de KUDOCARD")
    @RequestMapping(path = "/buscarCategoriasInativas", method = RequestMethod.GET)
    public ResponseEntity<List<Categoria>> buscarTodasCategoriasInativas(){
        return new ResponseEntity<>(categoriaService.buscarTodasCategoriasInativas(), HttpStatus.OK);
    }

    @ApiOperation(value = "Salvar Categoria")
    @RequestMapping(path = "/salvarCategoria", method = RequestMethod.POST)
    public ResponseEntity<Void> salvarCategoria(@RequestBody CategoriaDTO categoriaDTO){
        Categoria categoria = new Categoria(categoriaDTO);
        categoriaService.salvarCategoria(categoria);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @ApiOperation(value = "Ativar Categoria")
    @RequestMapping(path = "/ativarCategoria/{id}", method = RequestMethod.GET)
    public ResponseEntity<Void> ativarCategoria(@PathVariable Integer id){
        categoriaService.ativarCategoria(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @ApiOperation(value = "Inativar Categoria")
    @RequestMapping(path = "/inativarCategoria/{id}", method = RequestMethod.GET)
    public ResponseEntity<Void> inativarCategoria(@PathVariable Integer id){
        categoriaService.inativarCategoria(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
