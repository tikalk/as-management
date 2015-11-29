package com.com.tikal.angelsense.management.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.com.tikal.angelsense.management.domain.entity.Guardian;
import com.com.tikal.angelsense.management.repository.jpa.GuardianRepository;

@RestController
@Transactional
@RequestMapping("/api/v1")
public class GuardianService {

	@Autowired
	private GuardianRepository guardianRepository;

	// http://localhost:3080/api/v1/guardians/1/angels
	@RequestMapping("/guardians")
	public Guardian findGuardianByUsernameWithAngels(@RequestParam final String username) {
		return guardianRepository.findByUsernameWithAngels(username);
	}

}
