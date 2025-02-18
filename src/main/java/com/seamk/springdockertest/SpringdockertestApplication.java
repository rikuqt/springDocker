package com.seamk.springdockertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class for the Spring Boot Docker test application.
 */
@SpringBootApplication
public final class SpringdockertestApplication {

    /**
     * Private constructor to prevent instantiation of this utility class.
     */
    private SpringdockertestApplication() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * Main entry point for the Spring Boot application.
     *
     * @param args Command-line arguments.
     */
    public static void main(final String[] args) {
        SpringApplication.run(SpringdockertestApplication.class, args);
    }
}
