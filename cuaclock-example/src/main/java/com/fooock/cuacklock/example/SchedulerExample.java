package com.fooock.cuacklock.example;

import io.quarkus.scheduler.Scheduled;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;

/**
 * Example class to show how scheduled tasks works
 */
@Slf4j
@ApplicationScoped
public class SchedulerExample {
    @ConfigProperty(name = "scheduler.delay")
    protected String delay;

    @Scheduled(every = "${scheduler.delay}")
    public void execute() {
        log.info("Executing method every {}", delay);
    }
}
