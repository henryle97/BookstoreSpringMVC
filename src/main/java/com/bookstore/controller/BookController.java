package com.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bookstore.dao.BookDAO;

/*
 * Lớp xử lý request với sách 
 */
//@Controller
public class BookController {
	
	@Autowired
	private BookDAO bookDAO;
	
	
}
