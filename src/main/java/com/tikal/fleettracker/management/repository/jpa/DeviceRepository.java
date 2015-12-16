package com.tikal.fleettracker.management.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tikal.fleettracker.management.domain.entity.Device;

public interface DeviceRepository extends JpaRepository<Device, String> {

	@Query("select d.vehicle.id from Device d where d.imei = ?1")
	Integer findVehicleIdByImei(String imei);

}
