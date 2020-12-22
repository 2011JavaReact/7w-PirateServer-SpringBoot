package com.revature.pirate.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.Validation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.pirate.model.Pirate;
import com.revature.pirate.service.PirateService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/pirate")
@Slf4j
public class PirateController {
	@Autowired
	private PirateService pirateService;

	
	@GetMapping("")
	public List<Pirate> getPirates(){
		log.info("GET Request to /pirate");
		return pirateService.getPirates();
	}

	@RequestMapping("/{name:\\D+}")
//	@GetMapping("/name/{name}")
	public List<Pirate> getPirateByName(@PathVariable String name){
		log.info("GET Request to /pirate/{name}");
		return pirateService.getPirateByName(name);
	}
	
	@PostMapping("")
	public Pirate createPirate(@Valid @RequestBody Pirate pirate) {		
		log.info("POST Request to /pirate");
		return pirateService.createPirate(pirate);
	}
	@RequestMapping("/{id:\\d+}")
//      or change the path
//	@GetMapping("/id/{id}")
	public Pirate getPirateById(@PathVariable int id) {
		log.info("GET Request to /pirate/{id}");
		return pirateService.getPirateById(id);
	}
}
