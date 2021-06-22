package com.example.batch.steppart;

import com.example.batch.model.Utenti;
import com.example.batch.service.UtentiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class ReaderItemReader implements ItemReader<Utenti> {
    @Autowired
    private UtentiService utentiService;

    public static boolean passo = true;
    @Override
    public Utenti read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        if (utentiService.getUtenteById(1) == null && passo) {
            passo = false;
            return new Utenti(1, "Marioa", "Rossi");
        }
        return null;
    }
}
