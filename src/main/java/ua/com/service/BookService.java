package ua.com.service;

import java.util.List;

import ua.com.entity.Book;

public interface BookService {

	void save (Book book);
	List<Book> findAll();
	Book findOne (int id);
	void delete (int id);
	Book findByName(String name);
	Book delteByName(String name);
	
	
	
	
	
}
