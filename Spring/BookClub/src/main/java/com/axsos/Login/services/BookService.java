package com.axsos.Login.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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


	public List<Book> findAll(){
		return (List<Book>)bookRepo.findAll();
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
