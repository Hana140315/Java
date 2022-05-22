package com.axsos.Login.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.axsos.Login.models.LoginUser;
import com.axsos.Login.models.User;
import com.axsos.Login.repositories.LoginRepo;



	@Service
	public class LoginService {
	@Autowired
	private  LoginRepo  loginRep;
	
	
	public User register(User newUser, BindingResult result) {
        Optional<User> isUser=loginRep.findByEmail(newUser.getEmail());
        if(isUser.isPresent()) {
        result.rejectValue("email", "Mathes", "Email alreedy exist");	
        }
        if(!newUser.getPassword().equals(newUser.getConfirm())) {
            result.rejectValue("confirm", "Mathes", "The confirm password must match");	
            }
        String toCheck=newUser.getUserName();
        if(!toCheck.matches(("[a-zA-Z]+"))) {
        	result.rejectValue("userName", "Matches", "Must contain letter only");
        	
        }
        if(result.hasErrors()) {
        	return null;
        }
        else {
        	String hashed=BCrypt.hashpw(newUser.getPassword(),BCrypt.gensalt());
        	newUser.setPassword(hashed);
        	loginRep.save(newUser);
        	return newUser;
        }
    }
		public User login(LoginUser newLoginObject, BindingResult result) {
	    	
	   	 Optional<User> isUser=loginRep.findByEmail(newLoginObject.getEmail());
	   	if(!isUser.isPresent()) {
	           result.rejectValue("email", "Mathes", "Unknown email");	
	           return null;
	           }
	   	User user=isUser.get();
	   	if(!BCrypt.checkpw(newLoginObject.getPassword(), user.getPassword())) {
	   		result.rejectValue("password", "Matches", "Invalid Password!");
	   	}
	   	if(result.hasErrors()) {
	   		return null;
	   	}
	   	else {
	       return user;
	   }
   	}

		public User findbyId(Long id) {
			   return loginRep.findById(id).orElse(null);  
		   }

	

	
}

