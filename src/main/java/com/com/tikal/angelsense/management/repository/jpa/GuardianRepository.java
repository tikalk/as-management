package com.com.tikal.angelsense.management.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.com.tikal.angelsense.management.domain.entity.Guardian;

public interface GuardianRepository extends JpaRepository<Guardian, Integer> {
	public Guardian findByUsername(String username);

	@Query("select g from Guardian g left join fetch g.angels where g.username = ?1")
	public Guardian findByUsernameWithAngels(String guardianName);

	@Query("select g.email from Guardian g join g.angels a where a.id = ?1")
	public String findEmailByAngelId(int angelId);
}
