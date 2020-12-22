package com.revature.pirate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.pirate.dao.PirateDao;
import com.revature.pirate.model.Pirate;

@Service
public class PirateService {
	@Autowired
	private PirateDao pirateDao;
	
	public List<Pirate> getPirateByName(String name){
		return pirateDao.findByName(name);
	}
	
	public List<Pirate> getPirates(){
		return pirateDao.findAll();
	}
	
	public Pirate createPirate(Pirate pirate) {
		return pirateDao.save(pirate);
	}
	
	public Pirate getPirateById(int id) {
		return pirateDao.findById(id).get();
	}
}
