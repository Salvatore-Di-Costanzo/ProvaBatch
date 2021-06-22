package com.example.batch.steppart;

import com.example.batch.model.Utenti;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

@Slf4j
public class BatchWriter implements ItemWriter<Utenti>, StepExecutionListener {

    @Override
    public void write(List<? extends Utenti> list) throws Exception {
        list.forEach(System.out::println);
        System.out.println("__________________________________");
    }

    @Override
    public void beforeStep(StepExecution stepExecution) {

    }

    @Override
    public ExitStatus afterStep(StepExecution stepExecution) {
        log.info("Sto stampando dopo che il write non ha più elementi dal reader/processor");
        return ExitStatus.COMPLETED;
    }
}
