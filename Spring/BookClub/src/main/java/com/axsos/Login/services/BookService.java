package com.axsos.Login.services;

import java.util.ArrayList;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.axsos.Login.models.Book;
import com.axsos.Login.repositories.BookRepo;

@Service
public class BookService {
	@Autowired
	private BookRepo bookRepo;
	
	public Book create(Book newBook) {
    
    bookRepo.save(newBook);
   
    	return newBook;
    }


	public ArrayList<Book> findAll(){
		return (ArrayList<Book>)bookRepo.findAll();
	}
	
	public Book findById(Long bookId) {
		Optional<Book> book=bookRepo.findById(bookId);
		if(book.isPresent()) {
			return book.get();
		}
		return null;
			}
	public void destroy(Long bookId) {
		bookRepo.deleteById(bookId);
	}
}
