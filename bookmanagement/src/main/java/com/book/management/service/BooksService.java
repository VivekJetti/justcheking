package com.book.management.service;

import com.book.management.dao.BookInterface;
import com.book.management.dao.impl.BookInterfaceImplementation;
import com.book.management.model.Book;

public class BooksService {
	
	
	public BooksService() {
		System.out.println("BookService obj created since constructor is invoked...");
	}
	
	
	public void addBook(Book book) {
		BookInterface bookInf = new BookInterfaceImplementation();
		bookInf.addBook(book);
	}
	
	void updateBookDetails() {
		
	}
	
	void deleteBook() {
		
	}
	

}
