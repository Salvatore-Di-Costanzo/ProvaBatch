package com.example.batch.controller;

import com.example.batch.model.Utenti;
import com.example.batch.service.UtentiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UtentiController {

    private final UtentiService utentiService;

    @Autowired
    private UtentiController(UtentiService utentiService){
        this.utentiService = utentiService;
    }

    @GetMapping("/utenti")
    public List<Utenti> getAll(){
        return utentiService.getAllUtenti();
    }

    @GetMapping("/utenti/{id}")
    public Utenti getUtente(@PathVariable("id") int id){
        return utentiService.getUtenteById(id);
    }

}
