package com.com.tikal.angelsense.management.domain.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "guardians")
public class Guardian {

	@Id
	@GeneratedValue
	private Integer id;

	@NaturalId
	private String username;

	@NotNull
	private String password;

	@ManyToMany
	private final Set<Angel> angels = new HashSet<>();

	public Guardian() {
	}

	public Guardian(final String username, final String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(final String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	public Integer getId() {
		return id;
	}
	
	public Guardian addAngel(final Angel angel){
		angels.add(angel);
		return this;
	}

}
