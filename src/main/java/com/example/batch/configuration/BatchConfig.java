package com.example.batch.configuration;

import com.example.batch.model.Utenti;
import com.example.batch.service.UtentiService;
import com.example.batch.steppart.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@Slf4j
public class BatchConfig {

    private final JobBuilderFactory jobBuilderFactory;
    private final StepBuilderFactory stepBuilderFactory;
    private final UtentiService utentiService;

    @Autowired
    public BatchConfig(JobBuilderFactory jobBuilderFactory,StepBuilderFactory stepBuilderFactory,UtentiService utentiService){
        this.jobBuilderFactory = jobBuilderFactory;
        this.stepBuilderFactory = stepBuilderFactory;
        this.utentiService = utentiService;
    }

    @Bean
    public Job job1(){
        return this.jobBuilderFactory.get("Job")
                .start(step1())
                .next(step2())
                .build();
    }

    @Bean
    Step step1(){
        return this.stepBuilderFactory.get("Step1")
                .tasklet(itemReader()).build();
    }

    @Bean
    Step step2(){
        return this.stepBuilderFactory.get("Step2")
                .tasklet(itemProcessor()).build();
    }

    @Bean
    Step step3(){
        return this.stepBuilderFactory.get("Step3")
                .<Utenti,Utenti>chunk(10)
                .reader(itemReader2())
                .writer(itemWriter2())
                .build();
    }

    @Bean
    public ReaderItemReader itemReader2(){
        return new ReaderItemReader();
    }

    @Bean
    public WriterItemWriter itemWriter2(){
        return new WriterItemWriter();
    }

    @Bean
    public ProcessorItemProcessor processorItemProcessor2(){
        return new ProcessorItemProcessor();
    }

    @Bean
    public ReaderPart itemReader(){
        return new ReaderPart();
    }

    @Bean
    public ProcessPart itemProcessor() {return new ProcessPart();}

    @Bean
    public ExecutionContext executionContext(){
        return new ExecutionContext();
    }

}
