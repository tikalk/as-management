package com.com.tikal.angelsense.management.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.com.tikal.angelsense.management.repository.jpa.DeviceRepository;

@RestController
@Transactional
@RequestMapping("/api/v1")
public class AngelService {

	@Autowired
	private DeviceRepository deviceRepository;

	// http://localhost:3080/api/v1/devices/013949008057328/angels
	@RequestMapping("/devices/{imei}/angels")
	@Cacheable("imeiToAngelId")
	public Integer findAngelIdByDeviceImei(@PathVariable final String imei) {
		return deviceRepository.findAngelIdByImei(imei);
	}

}
