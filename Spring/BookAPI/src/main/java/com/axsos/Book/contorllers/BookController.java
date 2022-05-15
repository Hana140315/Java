package com.axsos.Book.contorllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.axsos.Book.models.Book;
import com.axsos.Book.services.BookService;

@RestController
public class BookController {
	private final BookService bookServ;

	public BookController(BookService bookServ) {
		super();
		this.bookServ = bookServ;
	}
	@RequestMapping("/api/books")
	public List<Book> index(){
		return bookServ.findAll();
	}
	
	@RequestMapping(value="/api/books", method=RequestMethod.POST)
    public Book create(@RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
        Book book = new Book(title, desc, lang, numOfPages);
        return bookServ.creatBook(book);
    }
    
    @RequestMapping("/api/books/{id}")
    public Book show(@PathVariable("id") Long id) {
        Book book = bookServ.findBook(id);
        return book;
    }
}


