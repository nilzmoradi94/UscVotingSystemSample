package com.usc.VotingSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("com.usc.VotingSystem")
@SpringBootApplication
@EnableJpaRepositories
public class VotingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(VotingSystemApplication.class, args);
	}
}
