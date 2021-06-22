package com.example.batch.controller;

import com.example.batch.model.Utenti;
import com.example.batch.repository.UtentiRepository;
import com.example.batch.service.UtentiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class UtentiController {

    private final UtentiRepository utentiRepository;

    private final UtentiService utentiService;

    @Autowired
    private UtentiController(UtentiService utentiService,UtentiRepository utentiRepository){
        this.utentiService = utentiService;
        this.utentiRepository = utentiRepository;
    }

    @GetMapping("/utenti")
    public List<Utenti> getAll(){
        return utentiRepository.findAll();
    }

    @GetMapping("/utenti/{id}")
    public Utenti getUtente(@PathVariable int id){
        return utentiService.getUtenteById(id);
    }

}
