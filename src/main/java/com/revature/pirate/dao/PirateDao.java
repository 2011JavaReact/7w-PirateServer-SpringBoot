package com.revature.pirate.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.revature.pirate.model.Pirate;
import com.revature.pirate.model.Role;

@Repository
public class PirateDao {
	public List<Pirate> getPirates(){

		List<Pirate> pirates = new ArrayList<Pirate>();
		pirates.add(new Pirate(500,"Hook",new Role(1,"Captain"),100000.99));
		return pirates;
	}
}
