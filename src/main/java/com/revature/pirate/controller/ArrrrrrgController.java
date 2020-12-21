package com.revature.pirate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/arg")
public class ArrrrrrgController {
	
	
	@GetMapping("")
//	@RequestMapping(method = RequestMethod.GET, path = "/")
	public String arggWorld() {
		return "arrrrrrgh!! World!!";
	}
}
