package com.example;

import java.lang.invoke.MethodHandles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    // Disabling code coverage for the class logger, the run method, and the main method
    ///CLOVER:OFF
    public static void main(String[] args) { SpringApplication.run(Application.class, args); }
    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass().getSimpleName());

    @Override
    public void run(String... args) throws Exception {
        logger.info("Starting Application...");

        // TODO: Start Coding Here
        logger.info(this.getHelloWorld());

        logger.info("Application finished!");
    }
    ///CLOVER:ON

    protected String getHelloWorld() { return "Hello world!"; }

}
