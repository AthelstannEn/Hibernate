package ua.com.dao;





import java.util.List;

import ua.com.entity.Book;

public interface BookDao  {

	Book save (Book book);
	
	List<Book> findAll();
	Book findOne (int id);
	void delete (int id);
	Book findByName(String name);
	
	
	
	
	
}
