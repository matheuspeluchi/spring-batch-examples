package com.mpr.cursobatch.jobs.job;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ScriptJob {

  // @Bean
  public Job script(JobRepository jobRepository, Step step) {
    return new JobBuilder("ScriptJob", jobRepository).start(step)
        .incrementer(new RunIdIncrementer()).build();
  }


}
