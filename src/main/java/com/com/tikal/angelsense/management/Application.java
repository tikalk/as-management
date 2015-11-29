package com.com.tikal.angelsense.management;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

import com.com.tikal.angelsense.management.domain.entity.Angel;
import com.com.tikal.angelsense.management.domain.entity.Device;
import com.com.tikal.angelsense.management.domain.entity.Guardian;
import com.com.tikal.angelsense.management.repository.jpa.AngelRepository;
import com.com.tikal.angelsense.management.repository.jpa.DeviceRepository;
import com.com.tikal.angelsense.management.repository.jpa.GuardianRepository;

@SpringBootApplication
@EnableCaching
public class Application {

	public static void main(final String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner init(final GuardianRepository guardianRepository,final AngelRepository angelRepository,final DeviceRepository deviceRepository) {
		return new CommandLineRunner() {
			@Override
			public void run(final String... args) throws Exception {
				final Angel a1 = angelRepository.save(new Angel("a1"));
				guardianRepository.save(new Guardian("g1", "g1").addAngel(a1));
				deviceRepository.save(new Device("863158020721652", a1));
				
			}
		};
	}
	
	
}
