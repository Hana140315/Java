package com.axsos.FruitLoop.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axsos.FruitLoop.models.item;

@Controller
public class Fruitcontroller {
	@RequestMapping("/")
	public String index(Model model) {
		ArrayList <item> fruits= new ArrayList<item>();
		
		fruits.add(new item("Kiwi", 1.5));
		fruits.add(new item("Mango", 2.0));
		fruits.add(new item("Guava", 0.75));
		fruits.add(new item("Apple", 1.25));
		
		model.addAttribute("Fruitcontroller", fruits);
		
	return "index.jsp";
		
	}
	

	
	

}
