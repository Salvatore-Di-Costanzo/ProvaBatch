package com.example.batch.steppart;

import com.example.batch.model.Utenti;
import org.springframework.batch.item.ItemProcessor;


public class ProcessorItemProcessor implements ItemProcessor<Utenti,Utenti> {


    @Override
    public Utenti process(Utenti o) throws Exception {
        o.setNome("Giovannone");
        return o;
    }
}
