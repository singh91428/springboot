package com.sb.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.web.bean.Book;
import com.sb.web.dao.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	//add book to database
	public Book addBook(Book b) {
		Book book=bookRepository.save(b);
		return book;
	}
	
	//find book by id
	public Book findBookById(Integer id) {
		Optional<Book> b=bookRepository.findById(id);
		return b.get();
	}
	
	//update book by id
	public Book updateBookById(Book book,Integer id) {
		book.setId(id);
		Book res=bookRepository.save(book);
		return res;
	}
	
	//delete book by id
	public void deleteBookById(Integer id) {
		bookRepository.deleteById(id);
	}
	
	//all books detail
	public List<Book> getAllBooks(){
		List<Book> books=bookRepository.findAll();
		return books;
	}
}
