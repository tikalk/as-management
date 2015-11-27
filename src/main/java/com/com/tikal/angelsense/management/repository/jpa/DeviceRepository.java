package com.com.tikal.angelsense.management.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.com.tikal.angelsense.management.domain.entity.Device;

public interface DeviceRepository extends JpaRepository<Device, String> {

}
