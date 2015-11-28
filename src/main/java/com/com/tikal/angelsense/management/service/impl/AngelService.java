package com.com.tikal.angelsense.management.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.com.tikal.angelsense.management.domain.entity.Angel;
import com.com.tikal.angelsense.management.repository.jpa.AngelRepository;
import com.com.tikal.angelsense.management.repository.jpa.DeviceRepository;

@RestController
@Transactional
@RequestMapping("/api/v1/angels")
public class AngelService {

	@Autowired
	private AngelRepository angelRepository;
	
	@Autowired
	private DeviceRepository deviceRepository;

	@RequestMapping
	public List<Angel> findAll() {
		return angelRepository.findAll();
	}
	
	//http://localhost:3080/api/v1/angels/devices?imei=013226008728624
	@RequestMapping("/devices")
	@Cacheable("imeiToAngelId")
	public Integer findAngelIdByDeviceImei(@RequestParam final String imei) {
		return deviceRepository.findAngelIdByImei(imei);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public int createAngel(@RequestBody final Angel angel) {
		return angelRepository.save(angel).getId();
	}

}
