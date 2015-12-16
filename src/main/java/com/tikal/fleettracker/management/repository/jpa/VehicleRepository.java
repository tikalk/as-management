package com.tikal.fleettracker.management.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tikal.fleettracker.management.domain.entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

}
