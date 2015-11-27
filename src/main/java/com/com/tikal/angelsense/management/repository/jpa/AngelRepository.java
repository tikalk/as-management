package com.com.tikal.angelsense.management.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.com.tikal.angelsense.management.domain.entity.Angel;

public interface AngelRepository extends JpaRepository<Angel, Integer> {

}
