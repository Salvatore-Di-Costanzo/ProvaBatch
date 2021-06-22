package com.example.batch.service;

import com.example.batch.model.Utenti;
import com.example.batch.repository.UtentiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtentiService {

    private final UtentiRepository utentiRepository;

    @Autowired
    private UtentiService(UtentiRepository utentiRepository){
        this.utentiRepository = utentiRepository;
    }

    public List<Utenti> getAllUtenti(){
        return utentiRepository.findAll();
    }

    public Utenti getUtenteById (int id){
        return utentiRepository.getUtentiById(id);
    }

}
