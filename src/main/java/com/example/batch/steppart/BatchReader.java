package com.example.batch.steppart;

import com.example.batch.model.Utenti;
import com.example.batch.service.UtentiService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class BatchReader implements ItemReader<Utenti> {

    @Autowired
    private UtentiService utentiService;

    private List<Utenti> utenti = new ArrayList<>();

    private static int index = 0;

    @Override
    public Utenti read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {

        utenti = utentiService.getAllUtenti();

        if ( index == utenti.size() ) {
            index = 0;
            return null;
        }

        index++;

        return utentiService.getUtenteById(index);

    }
}
