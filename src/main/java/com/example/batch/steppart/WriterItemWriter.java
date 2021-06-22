package com.example.batch.steppart;

import com.example.batch.model.Utenti;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

@NoArgsConstructor
@Slf4j
public class WriterItemWriter implements ItemWriter<Utenti> {
    @Override
    public void write(List<? extends Utenti> list) throws Exception {
        log.info("{}",list.get(0).getNome());
    }
}
