package com.example.batch.steppart;

import com.example.batch.model.Utenti;
import com.example.batch.service.UtentiService;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.annotation.Autowired;

public class ReaderItemReader implements ItemReader<Utenti> {
    @Autowired
    private UtentiService utentiService;

    @Override
    public Utenti read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        return utentiService.getUtenteById(1);

    }
}
