package com.axsos.NinjaGold.controllers;

import java.util.ArrayList;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class NinjaGold {
	public ArrayList<String> activities= new ArrayList<String>();
	@GetMapping("")
	public String root(HttpSession session) {
		if(session.getAttribute("gold")==null) {
		session.setAttribute("gold",0);
		
		
			
		}
		
		return "Gold.jsp";
	}

			@PostMapping("")		
			public String Process(@RequestBody() String postData, HttpSession session) {
			String location= postData.substring(0, postData.indexOf("="));
			Random rand=new Random();
			int i=0;
			int gold= (int)session.getAttribute("gold");
			String text= "You entered a ";
			switch (location) {
			
			case "quest":
			i=rand.nextInt(50);
			break;
			
			case "farm":
			i=rand.nextInt(10)+10;
			break;
			

			case "cave":
			i=rand.nextInt(3)+2;
			break;

			case "house":
			i=rand.nextInt(5)+5;
			break;
			
			
			}
			text +=location + "  and earned gold" +gold;
			gold+=i;
			session.setAttribute("gold",gold);
			activities.add(text);
			return "redirect:/";
			
		}
	
	
	}
