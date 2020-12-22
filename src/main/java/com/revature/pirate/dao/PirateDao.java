package com.revature.pirate.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.pirate.model.Pirate;
import com.revature.pirate.model.Role;

public interface PirateDao extends JpaRepository<Pirate, Integer>{
	public List<Pirate> findByName(String name);
}
