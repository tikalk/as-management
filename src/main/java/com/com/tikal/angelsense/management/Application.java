package com.com.tikal.angelsense.management;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.com.tikal.angelsense.management.domain.entity.Guardian;
import com.com.tikal.angelsense.management.repository.jpa.GuardianRepository;

@SpringBootApplication
public class Application {

	public static void main(final String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	private CommandLineRunner init(final GuardianRepository guardianRepository) {
		return new CommandLineRunner() {
			@Override
			public void run(final String... args) throws Exception {
				guardianRepository.save(new Guardian("admin", "manager"));
			}
		};
	}
}
