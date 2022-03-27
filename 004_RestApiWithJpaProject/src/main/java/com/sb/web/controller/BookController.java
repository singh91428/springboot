package com.sb.web.controller;

import java.util.List;
import java.util.Optional;

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

public class BookController {
	@Autowired
	private BookService bookService;
	//Save Book Handler
	@PostMapping("/savebook")
	public ResponseEntity<Book> saveBook(@RequestBody Book book) {
		Book b=bookService.addBook(book);
		return ResponseEntity.status(HttpStatus.CREATED).body(b);
	}
	
	//getbooks handler
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getBooks(){
		List<Book> books=bookService.getAllBooks();
		if(books.size()<=0)
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		return ResponseEntity.status(HttpStatus.CREATED).body(books);
	}
	
//	@GetMapping("/finbook/{id}")
//	public Book findBook(@PathVariable("id") Integer id) {
//		Book b=bookService.findBookById(id);
//		return b;
//	}
	//using proper response entity
	@GetMapping("/findbook/{id}")
	public ResponseEntity<Book> findBook(@PathVariable("id") Integer id) {
		Book b=bookService.findBookById(id);
		return ResponseEntity.of(Optional.of(b));
	}
	
	@DeleteMapping("/deletebook/{id}")
	public Book deleteBook(@PathVariable("id") Integer id) {
		Book b=bookService.findBookById(id);
		bookService.deleteBookById(id);
		return b;
	}
	
	@PutMapping("/updatebook/{id}")
	public ResponseEntity<Book> updateBook(@RequestBody Book book,@PathVariable("id") Integer id) {
		Book b=bookService.updateBookById(book,id);
		return ResponseEntity.status(HttpStatus.CREATED).body(b);
	}
	
			
}
