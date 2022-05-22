package com.axsos.Login.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.axsos.Login.models.LoginUser;
import com.axsos.Login.models.User;
import com.axsos.Login.services.LoginService;

@Controller
public class LogRegController {

	
	    // Add once service is implemented:
	    @Autowired
	    private LoginService userServ;
	    
	    @GetMapping("/")
	    public String index(Model model) {
	    
	        // Bind empty User and LoginUser objects to the JSP
	        // to capture the form input
	        model.addAttribute("newUser", new User());
	        model.addAttribute("newLogin", new LoginUser());
	        return "LogReg.jsp";
	    }
	    
	    @PostMapping("/register")
	    public String register(@Valid @ModelAttribute("newUser") User newUser, 
	            BindingResult result, Model model, HttpSession session) {
	        
	        // TO-DO Later -- call a register method in the service 
	        // to do some extra validations and create a new user!
	    	User registerUser=userServ.register(newUser, result);
	        if(result.hasErrors()) {
	            // Be sure to send in the empty LoginUser before 
	            // re-rendering the page.
	            model.addAttribute("newLogin", new LoginUser());
	            return "LogReg.jsp";
	        }
	        
	        // No errors! 
	        // TO-DO Later: Store their ID from the DB in session, 
	        // in other words, log them in.
	        session.setAttribute("userId", registerUser.getId());
	        return "redirect:/sucess";
	    }
	    
	    @PostMapping("/login")
	    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
	            BindingResult result, Model model, HttpSession session) {
	        
	        // Add once service is implemented:
	        // User user = userServ.login(newLogin, result);
	    	User user=userServ.login(newLogin, result);
	        if(result.hasErrors()) {
	            model.addAttribute("newUser", new User());
	            return "LogReg.jsp";
	        }
	    
	        // No errors! 
	        // TO-DO Later: Store their ID from the DB in session, 
	        // in other words, log them in.
	        session.setAttribute("userId", user.getId());
	        return "redirect:/sucess";
	    }
	    @GetMapping("/sucess")
	    public String sucess(Model model, HttpSession session) {
	    	//session.setAttribute("user", session.getId());
	    	if(session.getAttribute("userId")!=null) {
	    		System.out.println("++++++++++++++++++++++++");
	    		Long userId=(Long)session.getAttribute("userId");
	    		User currenUser=userServ.findbyId(userId);
	    		model.addAttribute("currentUser", currenUser);
	    	 	return "redirect:/books";
	    	}
	    System.out.println("***********************");
	    	return "redirect:/login";
	    }
	    
	    @GetMapping("/logout")
	    	public String logout(HttpSession session){
	    		session.invalidate();
	    	return "redirect:/";
	    	}
	    }

