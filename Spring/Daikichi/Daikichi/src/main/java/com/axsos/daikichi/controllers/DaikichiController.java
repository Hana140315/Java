package com.axsos.daikichi.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	
	
	@RequestMapping("")
	public String Welcome() {
		
		return "Welecome Daikichi!";
	}

	@RequestMapping("/today")
	public String today() {
		
		return "Today you will find luck in all endeavors!";
	}
	
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		
		return "Tomorrow, an opportunity will arise, so be sure to open new ideas!";
	}
}
