package com.example.batch.steppart;

import com.example.batch.model.Utenti;
import org.springframework.batch.item.ItemWriter;

import java.util.List;


public class BatchWriter implements ItemWriter<Utenti> {

    @Override
    public void write(List<? extends Utenti> list) throws Exception {
        list.forEach(System.out::println);
        System.out.println("__________________________________");
    }
}
