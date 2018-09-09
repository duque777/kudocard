package br.com.ventron.rh.integracao.kudo.service;

import br.com.ventron.rh.integracao.kudo.datasource.model.KudoCard;
import br.com.ventron.rh.integracao.kudo.datasource.repository.KudoCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class KudoCardService {

    @Autowired
    KudoCardRepository kudoCardRepository;

    public void salvarKudoCard(KudoCard kudoCard){
        kudoCardRepository.save(kudoCard);
    }

    public List<KudoCard> buscarTodosKudoCard(){
        return kudoCardRepository.findAll();
    }

    public List<KudoCard> buscarKudoCardApartirData(Date data){
        return kudoCardRepository.findAllKudoCardApartirData(data);
    }
}
