package com.com.tikal.angelsense.management.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.com.tikal.angelsense.management.domain.entity.Angel;
import com.com.tikal.angelsense.management.repository.jpa.AngelRepository;

@RestController
@Transactional
@RequestMapping("/api/v1/angels")
public class AngelService {

	@Autowired
	private AngelRepository angelRepository;

	@RequestMapping
	public List<Angel> findAll() {
		return angelRepository.findAll();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public int createAngel(@RequestBody final Angel angel) {
		return angelRepository.save(angel).getId();
	}

}
