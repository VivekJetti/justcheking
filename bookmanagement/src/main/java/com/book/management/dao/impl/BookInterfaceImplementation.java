package com.book.management.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.book.management.dao.BookInterface;
import com.book.management.model.Book;

public class BookInterfaceImplementation implements BookInterface {

	@Override
	public void addBook(Book book) {

		Statement st = null;
		Connection con = null;

		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookmanagement", "root", "root");
			st = con.createStatement();
			String insertBook = "INSERT INTO books (book_id, author, book_title, isbn_number)" + " VALUES ('"
					+ book.getBookId() + "'," + "'" + book.getAuthor() + "'," + "'" + book.getBookTitle() + "','"
					+ book.getIsbnNumber() + "')";

			boolean execute = st.execute(insertBook);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (st != null) {
					st.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public void updateBookDetails() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBook() {
		// TODO Auto-generated method stub

	}

}
