package ua.com.serviceimpl;

import java.util.List;






import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.dao.BookDao;
import ua.com.entity.Book;
import ua.com.service.BookService;



@Service
public class BookServiceImpl implements BookService {

	
	@Autowired
	private BookDao dao;;
	
	public void save(Book book) {
	
	dao.save(book);

	}
	
	
	public List<Book> findAll() {
		return dao.findAll();
	
	}

	public Book findOne(int id) {
		return dao.findOne(id);
	}

	public void delete(int id) {
		 dao.delete(id);
	}

	public Book findByName(String name) {
		return dao.findByName(name);
	}


	public Book delteByName(String name) {
		Scanner sc =  new Scanner(System.in);
		List<Book> list = (List<Book>) dao.findByName(name);
		int  y = 1;
		for(Book book : list){
			System.out.println(book);
			System.out.println(1);
			y++;
		}
		int  q = sc.nextInt();
		
		dao.delete(list.get(q-1).getId());
		
		return list.get(q);
		
	}

	
	
	
}
