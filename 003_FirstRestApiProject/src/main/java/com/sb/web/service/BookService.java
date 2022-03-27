package com.sb.web.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.sb.web.bean.Book;
@Service
public class BookService {
	private static List<Book> books=new ArrayList<>();
	static {
		books.add(new Book(1,"c","nitish"));
		books.add(new Book(2,"c++","deepak"));
		books.add(new Book(3,"java","chandu"));
		books.add(new Book(4,"python","amarjeet"));	
	}
	
	//get all books
	public List<Book> getAllBooks(){
		return books;
	}
	
	//get single book by id
	public Book getBookById(int id) {
		Book bo=null;
		bo=books.stream().filter(e->e.getId()==id).findFirst().get();
		
		return bo;
	}
	
	//add books
	public Book addBook(Book b) {
		books.add(b);
		return b;
	}
	
	//delete book
	public void deleteBook(int id) {
//		books.forEach(bo->{
//			if(bo.getId()==id) {
//				books.remove(bo);
//			}
//		});
//		System.out.println(books);
//		return books;
		
		// or
		
		books=books.stream().filter(e->e.getId()!=id).collect(Collectors.toList());
	}

	public void updateBook(Book book, int id) {
		books.stream().map(e->{
			if(book.getId()==id) {
				book.getTitle();
				book.getAuthor();
			}
			return e;
			}).collect(Collectors.toList());
		}
}
