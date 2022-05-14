package com.axsos.Counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/your_server")
public class main {
	
	private String visit;
	@RequestMapping("")
	public String index(HttpSession session) {
		if (session.getAttribute("visit")==null) {
		session.setAttribute("visit", 0);
		
	}
		else {
			Integer visits= (Integer) session.getAttribute(visit);
			visits ++;
			session.setAttribute("visits", visit);
		}
	
return "index.jsp";

}
	@RequestMapping("/counter")
	public String counter(HttpSession session, Model model) {
		
		if (session.getAttribute("visit")==null) {
			session.setAttribute("visit", 0);
		}
		else {
			Integer visits= (Integer) session.getAttribute(visit);
			model.addAttribute("numberOfVisits", visits);
			
			
		}
		return "counter.jsp";
	}
}
	
	
	
