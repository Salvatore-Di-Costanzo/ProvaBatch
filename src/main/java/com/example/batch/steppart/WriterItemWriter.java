package com.example.batch.steppart;

import com.example.batch.model.Utenti;
import lombok.NoArgsConstructor;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

@NoArgsConstructor
public class WriterItemWriter implements ItemWriter<Utenti> {


    @Override
    public void write(List<? extends Utenti> list) throws Exception {
        System.out.println("Ciao");
    }
}
