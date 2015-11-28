package com.com.tikal.angelsense.management.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.com.tikal.angelsense.management.domain.entity.Device;

public interface DeviceRepository extends JpaRepository<Device, String> {

	@Query("select d.angel.id from Device d where d.imei = ?1")
	Integer findAngelIdByImei(String imei);

}
