package com.tikal.fleettracker.management;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

import com.tikal.fleettracker.management.domain.entity.Vehicle;
import com.tikal.fleettracker.management.domain.entity.Device;
import com.tikal.fleettracker.management.domain.entity.Guardian;
import com.tikal.fleettracker.management.repository.jpa.VehicleRepository;
import com.tikal.fleettracker.management.repository.jpa.DeviceRepository;
import com.tikal.fleettracker.management.repository.jpa.GuardianRepository;

@SpringBootApplication
@EnableCaching
public class Application {

	public static void main(final String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner init(final GuardianRepository guardianRepository,final VehicleRepository vehicleRepository,final DeviceRepository deviceRepository) {
		return new CommandLineRunner() {
			@Override
			public void run(final String... args) throws Exception {
				final Vehicle a1 = vehicleRepository.save(new Vehicle("111-aaa","Mazda3"));
				final Vehicle b1 = vehicleRepository.save(new Vehicle("111-bbb","Mazda6"));
				final Vehicle c1 = vehicleRepository.save(new Vehicle("111-ccc","Volvo"));
				guardianRepository.save(new Guardian("g1", "g1","yanaif@gmail.com").addVehicle(a1).addVehicle(b1).addVehicle(c1));
				deviceRepository.save(new Device("1131", a1));
				deviceRepository.save(new Device("1277", b1));
				deviceRepository.save(new Device("2237", c1));
				
				
//				final Vehicle a2 = vehicleRepository.save(new Vehicle("222-aaa","Honda Civic"));
//				guardianRepository.save(new Guardian("g2", "g2","yanaif@gmail.com").addVehicle(a2));
//				deviceRepository.save(new Device("863158021855913", a2));
//				
//				final Vehicle a3 = vehicleRepository.save(new Vehicle("333-aaa","Honda Civic"));
//				guardianRepository.save(new Guardian("g3", "g3","yanaif@gmail.com").addVehicle(a3));
//				deviceRepository.save(new Device("013950004334497", a3));
				
			}
		};
	}
	
	
}
