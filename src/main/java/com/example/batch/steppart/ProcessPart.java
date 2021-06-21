package com.example.batch.steppart;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class ProcessPart implements Tasklet {

    @Autowired
    private ExecutionContext executionContext;


    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
        executionContext.putString("ciao",executionContext.getString("ciao").toUpperCase());
        log.info("{}",executionContext.get("ciao"));
        return RepeatStatus.FINISHED;
    }
}
