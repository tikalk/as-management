package com.tikal.fleettracker.management.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tikal.fleettracker.management.repository.jpa.DeviceRepository;

@RestController
@Transactional
@RequestMapping("/api/v1")
public class VehicleService {

	@Autowired
	private DeviceRepository deviceRepository;

	// http://localhost:3080/api/v1/devices/013950004346194/vehicles
	@RequestMapping("/devices/{imei}/vehicles")
	@Cacheable("imeiToVehicleId")
	public Integer findVehicleIdByDeviceImei(@PathVariable final String imei) {
		return deviceRepository.findVehicleIdByImei(imei);
	}

}
