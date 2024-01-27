package com.book.management;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.book.management.model.Book;
import com.book.management.service.BooksService;
import com.google.gson.Gson;

@SpringBootApplication
public class BookmanagementApplication {

	public static void main(String[] args) {
		//SpringApplication.run(BookmanagementApplication.class, args);
		
		ApplicationContext container = new ClassPathXmlApplicationContext("bookmangementConfig.xml");
		
		String bookJson = "{ \"bookId\": \"234123\", \"bookTitle\": \"VedaIT Python\",  \"author\": \"Rajesh\",\"isbnNumber\": \"567890000\" }";

		Gson gson = new Gson();
		Book book = gson.fromJson(bookJson, Book.class);
		System.out.println("Book --> "+book);
		
		BooksService booksService = container.getBean("booksService",BooksService.class);
		booksService.addBook(book);
	}

}
