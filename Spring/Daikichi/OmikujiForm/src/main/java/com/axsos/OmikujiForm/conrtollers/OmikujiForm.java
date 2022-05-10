package com.axsos.OmikujiForm.conrtollers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class OmikujiForm {
		@RequestMapping(value="/omikuji", method=RequestMethod.GET)
		public String index() {
			 
		return "index.jsp";}
	
	
	@RequestMapping(value="/enteromikuji", method=RequestMethod.POST)
	public String omikuji(HttpSession session,
	    @RequestParam(value="number") Integer number,
	    @RequestParam(value="city") String city, 
	    @RequestParam(value="person") String person,
	    @RequestParam(value="hobby") String hobby,
	    @RequestParam(value="living") String living,
	    @RequestParam(value="nice") String nice) {
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("living", living);
		session.setAttribute("nice", nice);
	    // Code here to get the product price,
	    // Call to payment API
	    // complete the transaction and charge CC
	    //System.out.printf("Charging credit, timestamp: %s", new Date());
	        
	    return "redirect:/show"; // <-- BAD
	    // Refresh the browser and it runs this method again :(
	}
	@RequestMapping("show")
	public String show(HttpSession session, Model model) {
		model.addAttribute("number",session.getAttribute("number"));
		model.addAttribute("city",session.getAttribute("city"));
		model.addAttribute("person",session.getAttribute("person"));
		model.addAttribute("hobby",session.getAttribute("hobby"));
		model.addAttribute("living",session.getAttribute("living"));
		model.addAttribute("nice",session.getAttribute("nice"));
		return "show.jsp";
				
	}

}
