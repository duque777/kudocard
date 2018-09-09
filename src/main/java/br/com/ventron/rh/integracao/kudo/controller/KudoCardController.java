package br.com.ventron.rh.integracao.kudo.controller;

import br.com.ventron.rh.integracao.kudo.datasource.model.KudoCard;
import br.com.ventron.rh.integracao.kudo.dto.KudoCardDTO;
import br.com.ventron.rh.integracao.kudo.service.KudoCardService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(path = "kudoCard")
public class KudoCardController {

    @Autowired
    KudoCardService kudoCardService;

    @ApiOperation(value = "Salvar Kudo Card")
    @RequestMapping(path = "/salvarKudoCard", method = RequestMethod.POST)
    public ResponseEntity<Void> salvarKudoCard(@RequestBody KudoCardDTO kudoCardDTO){
        KudoCard kudoCard = new KudoCard(kudoCardDTO);
        kudoCardService.salvarKudoCard(kudoCard);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @ApiOperation(value = "Buscar Todos Kudo Card")
    @RequestMapping(path = "/buscarTodosKudoCard", method = RequestMethod.GET)
    public ResponseEntity<List<KudoCard>> buscarTodosKudoCard(){
        return new ResponseEntity<>(kudoCardService.buscarTodosKudoCard(), HttpStatus.OK);
    }

    @ApiOperation(value = "Buscar Kudo Card A Partir de Uma DATA")
    @RequestMapping(path = "/buscarKudoCardData/{data}", method = RequestMethod.GET)
    public ResponseEntity<List<KudoCard>> buscarKudoCardApartirData(@PathVariable Date data){
        return new ResponseEntity<>(kudoCardService.buscarKudoCardApartirData(data), HttpStatus.OK);
    }

}
