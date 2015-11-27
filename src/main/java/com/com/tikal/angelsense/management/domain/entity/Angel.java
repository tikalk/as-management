package com.com.tikal.angelsense.management.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "angels")
public class Angel {

	@Id
	@GeneratedValue
	private Integer id;

	@NaturalId
	private String name;

	public Angel() {
	}

	public Angel(final String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

}
