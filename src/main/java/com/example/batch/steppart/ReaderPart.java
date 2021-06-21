package com.example.batch.steppart;

import com.example.batch.model.Utenti;
import com.example.batch.service.UtentiService;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
public class ReaderPart implements Tasklet {
    @Autowired
    private ExecutionContext executionContext;
    @Autowired
    private UtentiService utentiService;

    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
        executionContext.putString("ciao","Hello Word");
        List<Utenti> utenti = utentiService.getAllUtenti();
        for(Utenti utente : utenti) {
            log.info("{}", utente.toString());
        }
        log.info("Ho eseguito lo step3");

        return RepeatStatus.FINISHED;
    }
}
