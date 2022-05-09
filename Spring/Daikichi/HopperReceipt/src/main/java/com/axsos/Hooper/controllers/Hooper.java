package com.axsos.Hooper.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Hooper {

	@RequestMapping("/")
    public String index(Model model) {
        
        String name = "Grace Hopper";
        String itemName = "Copper wire";
        double price = 5.25;
        String description = "Metal strips, also an illustration of nanoseconds.";
        String vendor = "Little Things Corner Store";
    
    	model.addAttribute("hname", name);
    	model.addAttribute("hitemName", itemName);
    	model.addAttribute("hprice", price);
    	model.addAttribute("hdescription", description);
    	model.addAttribute("hvendor", vendor);
        // Your code here! Add values to the view model to be rendered
    
        return "Index.jsp";
    }
    //...
}
