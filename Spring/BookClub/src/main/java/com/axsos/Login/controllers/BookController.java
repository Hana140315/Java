package com.axsos.Login.controllers;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axsos.Login.models.Book;
import com.axsos.Login.models.User;
import com.axsos.Login.services.BookService;
import com.axsos.Login.services.LoginService;

@Controller
@RequestMapping("/books")
public class BookController {
	
	private BookService bookServ;
	 private LoginService userServ;

	public BookController(BookService bookServ, LoginService userServ) {
		
		this.bookServ = bookServ;
		this.userServ=userServ;
	}

	
	@GetMapping ("")
	public String root(@ModelAttribute("newBook") Book newBook,Model model,HttpSession session) {
		List<Book> allBooks=bookServ.findAll();
		model.addAttribute("allBooks", allBooks);
		System.out.print(allBooks);
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
	    	
	        if(result.hasErrors()) {
	          
	        	return "new.jsp";
	        }
	        Long currentUserId=(Long) session.getAttribute("userId");
	    	User currentUser=userServ.findbyId(currentUserId);
	    	newBook.setUser(currentUser);
	    	bookServ.create(newBook);
	        // No errors! 
	        // TO-DO Later: Store their ID from the DB in session, 
	        // in other words, log them in.
//	        session.setAttribute("userId", registerUser.getId());
	        return "redirect:/sucess";
	    }

	    
	    @GetMapping("/{book_id}")
	    public String show(@PathVariable("book_id") Long BookId,  Model model, HttpSession session) {
	        
	        // Add once service is implemented:
	        // User user = userServ.login(newLogin, result);
	    	 Long currentUserId=(Long) session.getAttribute("userId");
	        if(currentUserId==null) {
	            model.addAttribute("newUser", new User());
	            return "LogReg.jsp";
	        }
	        Book book= bookServ.findById(BookId);
	        model.addAttribute("book", book);
	        return "show.jsp";
  }

	    @GetMapping("/edit/{book_id}")
	    public String edit(Model model,@PathVariable("book_id") Long BookId, HttpSession session ) {
	    
	    	Book book= bookServ.findById(BookId);
	    	model.addAttribute("currentBook", book);
		return "edit.jsp";
	
	}
	    
	    @PostMapping("/edit/{book_id}")
	    public String Update(@Valid Model model,@ModelAttribute("currentBook") Book newBook ,@PathVariable("book_id") Long BookId, HttpSession session,
	    		BindingResult result) {
	    
	    	 if(result.hasErrors()) {
		          
		        	return "new.jsp";
		        }
		        Long currentUserId=(Long) session.getAttribute("userId");
		    	User currentUser=userServ.findbyId(currentUserId);
		    	Book upBook= bookServ.findById(BookId);
		    	upBook.setTitle(newBook.getTitle());
		    	upBook.setAuthor(newBook.getAuthor());
		    	upBook.setThought(newBook.getThought());
		    	bookServ.create(upBook);
		        // No errors! 
		        // TO-DO Later: Store their ID from the DB in session, 
		        // in other words, log them in.
//		        session.setAttribute("userId", registerUser.getId());
		        return "redirect:/sucess";
		    }
}
