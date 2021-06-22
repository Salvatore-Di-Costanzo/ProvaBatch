package com.example.batch.steppart;

import com.example.batch.model.Utenti;
import org.springframework.batch.item.ItemProcessor;

public class BatchProcessor implements ItemProcessor<Utenti,Utenti > {
    @Override
    public Utenti process(Utenti utenti) throws Exception {
        if(utenti.getCognome().equals("Bird"))
            utenti.setCognome("Cera");
        else
            utenti.setCognome("Bird");
        return utenti;
    }
}
