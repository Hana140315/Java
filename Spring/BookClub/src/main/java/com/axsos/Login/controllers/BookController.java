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
import org.springframework.web.bind.annotation.RequestMapping;

import com.axsos.Login.models.Book;
import com.axsos.Login.models.LoginUser;
import com.axsos.Login.models.User;
import com.axsos.Login.services.BookService;
import com.axsos.Login.services.LoginService;

@Controller
@RequestMapping("/books")
public class BookController {
	
	private BookService bookServ;

	public BookController(BookService bookServ) {
		
		this.bookServ = bookServ;
	}

	
	@GetMapping ("")
	public String root(Model model) {
		model.addAttribute("books", bookServ.findAll());
		return "sucess.jsp";
	}
	
	@GetMapping ("/new")
	public String creat(Model model ,@ModelAttribute("newBook") Book newBook) {
		Book book=new Book();
		model.addAttribute("newBook", book);
		return "new.jsp";
	
	}

	
	    @PostMapping("/new")
	    public String create(@Valid @ModelAttribute("newBook") Book newBook, 
	            BindingResult result, Model model, HttpSession session) {
	        
	        // TO-DO Later -- call a register method in the service 
	        // to do some extra validations and create a new user!
	    	Long currentUserId=(Long) session.getAttribute("userId");
	    	User currentUser=Login
	    	Book createBook=bookServ.create(newBook);
	        if(result.hasErrors()) {
	            // Be sure to send in the empty LoginUser before 
	            // re-rendering the page.
//	            model.addAttribute("newLogin", new LoginUser());
//	            return "sucess.jsp";
	        }
	        
	        // No errors! 
	        // TO-DO Later: Store their ID from the DB in session, 
	        // in other words, log them in.
//	        session.setAttribute("userId", registerUser.getId());
	        return "redirect:/sucess";
	    }
}
//	    
//	    @PostMapping("/show/{book_id}")
//	    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
//	            BindingResult result, Model model, HttpSession session) {
//	        
//	        // Add once service is implemented:
//	        // User user = userServ.login(newLogin, result);
//	    	User user=userServ.login(newLogin, result);
//	        if(result.hasErrors()) {
//	            model.addAttribute("newUser", new User());
//	            return "LogReg.jsp";
//	        }
//	    
//	        // No errors! 
//	        // TO-DO Later: Store their ID from the DB in session, 
//	        // in other words, log them in.
//	        session.setAttribute("userId", user.getId());
//	        return "redirect:/sucess";
//	    }
//	    @GetMapping("/edit/{book_id}")
//	    public String sucess(Model model, HttpSession session) {
//	    	//session.setAttribute("user", session.getId());
//	    	if(session.getAttribute("userId")!=null) {
//	    		System.out.println("++++++++++++++++++++++++");
//	    		Long userId=(Long)session.getAttribute("userId");
//	    		User currenUser=userServ.findbyId(userId);
//	    		model.addAttribute("currentUser", currenUser);
//	    	 	return "sucess.jsp";
//	    	}
//	    System.out.println("***********************");
//	    	return "redirect:/";
//	    }
//	    
//	   
//
//	
//}
