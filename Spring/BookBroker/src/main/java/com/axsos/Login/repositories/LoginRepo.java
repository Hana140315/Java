package com.axsos.Login.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.Login.models.User;


@Repository 
public interface LoginRepo  extends CrudRepository<User, Long>{
	
	
	    List<User> findAll();
	   
	    Optional<User> findByEmail(String search);
	    // this method counts how many titles contain a certain string
	    Optional<User> findById(Long id);
	    
	    void deleteById(Long id);
		
	
	
}
