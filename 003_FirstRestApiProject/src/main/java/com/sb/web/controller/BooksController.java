package com.sb.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sb.web.bean.Book;
import com.sb.web.service.BookService;

@RestController
public class BooksController {
	@Autowired
	private BookService bookService;
	@GetMapping("/books")
	//get all books handler
	public List<Book> getBooks() {
		System.out.println(ResponseEntity.status(HttpStatus.OK).build());
		return bookService.getAllBooks();
	}
	
	//get book by id handler
	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable("id") int id) {
		return bookService.getBookById(id);
	}
	
	//adding a new book handler
	@PostMapping("/books")
	public Book addBook(@RequestBody Book book) {
		Book b=bookService.addBook(book);
		System.out.println(ResponseEntity.status(HttpStatus.OK).build());
		return b;
	}
	
	//delete book handler
	@DeleteMapping("/books/{id}")
	public void deleteBook(@PathVariable("id") int id){
		bookService.deleteBook(id);
	}
	
	//update book handler
	@PutMapping("/books/{id}")
	public Book updateBook(@RequestBody Book book,@PathVariable("id") int id) {
		bookService.updateBook(book,id);
		return book;
	}
}
