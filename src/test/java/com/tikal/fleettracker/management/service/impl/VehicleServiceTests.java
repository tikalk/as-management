package com.tikal.fleettracker.management.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tikal.fleettracker.management.Application;
import com.tikal.fleettracker.management.service.VehicleService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class VehicleServiceTests {

	@Autowired
	private VehicleService vehicleService;

	@Test
	public void testFindAll() {
	}

}
