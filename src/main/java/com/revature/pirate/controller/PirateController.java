package com.revature.pirate.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.pirate.model.Pirate;
import com.revature.pirate.model.Role;
import com.revature.pirate.service.PirateService;

@RestController
@RequestMapping("/pirate")
public class PirateController {
	@Autowired
	private PirateService pirateService;
	
	@GetMapping("")
	public List<Pirate> getPirates(){
		return pirateService.getPirates();
	}
	
	@GetMapping("/{name}")
	public List<Pirate> getPirateByName(@PathVariable String name){
		return pirateService.getPirateByName(name);
	}
	
//	@GetMapping("/{id}")
//	public Pirate getPirateById(@PathVariable int id) {
//		return pirateService.
//	}
}
