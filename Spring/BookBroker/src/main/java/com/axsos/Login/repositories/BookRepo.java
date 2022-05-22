package com.axsos.Login.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.Login.models.Book;


@Repository
public interface BookRepo extends CrudRepository <Book, Long> {
	
	 	List<Book> findAll();
	   
	    Optional<Book> findByTitle(String search);
	    // this method counts how many titles contain a certain string
	    Optional<Book> findById(Long id);
	    List <Book> findByBorrowId(Long id);
	    
	    void deleteById(Long id);
}
