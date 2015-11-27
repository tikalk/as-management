package com.com.tikal.angelsense.management.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.com.tikal.angelsense.management.domain.entity.Guardian;

public interface GuardianRepository extends JpaRepository<Guardian, Integer> {
	public Guardian findByUsername(String username);
}
