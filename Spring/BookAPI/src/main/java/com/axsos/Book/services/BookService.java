package com.axsos.Book.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.Book.models.Book;
import com.axsos.Book.repositories.BookRepository;

@Service
public class BookService {

	private final BookRepository  bookRepo;
	
	public BookService(BookRepository bookRepo) {
		this.bookRepo = bookRepo;
	}
	
	public List<Book> findAll(){
		return bookRepo.findAll();
		
	}
	public Book creatBook(Book b){
		return bookRepo.save(b);
				
	}
	public Book findBook(Long id) {
		Optional<Book> optionalBook=bookRepo.findById(id);
		if(optionalBook.isPresent()) {
			return optionalBook.get();	
		}
		else {
			return null;
		}

	public void  deleteBook(Long id) {
		 bookRepo.deleteById(id);
		
	}
	

	public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
		// TODO Auto-generated method stub
		Book updateBook=bookRepo.findById(id);
		updateBook.setBook(title);
		updateBook.setBook(description);
		updateBook.setBook(language);
		updateBook.setBook(numberOfPages);
		
			return bookRepo.save(updateBook);	
		}
		return null;
	}
}
