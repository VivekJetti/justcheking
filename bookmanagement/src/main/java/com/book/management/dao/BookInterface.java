package com.book.management.dao;

import com.book.management.model.Book;

public interface BookInterface {
	
	void addBook(Book book);
	void updateBookDetails();
	void deleteBook();
}
