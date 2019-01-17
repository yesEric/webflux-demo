package com.example.webfluxtest.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;

import lombok.extern.slf4j.Slf4j;


@SpringBootApplication
@Configuration
@ComponentScan("com.example.webfluxtest.demo")
@EnableWebFlux
@Slf4j
public class DemoApplication {

	public static void main(String[] args) {
        log.debug("Server is Running");
		SpringApplication.run(DemoApplication.class, args);
	}

}

