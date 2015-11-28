package com.com.tikal.angelsense.management.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "devices")
public class Device {

	@Id
	@GeneratedValue
	private Integer id;

	@NaturalId
	@Column(columnDefinition = "char(15)")
	private String imei;
	
	@ManyToOne
	@JoinColumn(name="angel_id")
	private Angel angel;
	
	

	public Device() {
	}



	public Device(final String imei) {
		this.imei = imei;
	}

	


	public Device(final String imei, final Angel angel) {
		this.imei = imei;
		this.angel = angel;
	}



	public Integer getId() {
		return id;
	}



	public String getImei() {
		return imei;
	}

	public void setImei(final String imei) {
		this.imei = imei;
	}

	public Angel getAngel() {
		return angel;
	}

	public void setAngel(final Angel angel) {
		this.angel = angel;
	}
	
	

}
