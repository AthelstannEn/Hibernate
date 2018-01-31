package ua.com.controller;

import java.util.Scanner;

import ua.com.entity.Book;
import ua.com.service.BookService;



public class Menu {

	private BookService service;
	
	public void menu(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
		
		System.out.println("Press 1 to add Book");	
		System.out.println("Press 2 to remove Book");	
		System.out.println("Press 3 to edit book");	
		System.out.println("Press 4 to show all book");
		System.out.println("Press 5 to find the book after the name ");
		
		switch(sc.next()){
			case "1":
			
				System.out.println("Enter book name: ");
				String name = sc.next();
				System.out.println("Enter author name: ");
				String author = sc.next();
				
				Book book =  new Book(name, author);
				
				service.save(book);
				System.out.println("book " + book +"  was added");
			
			
			break;	
			case"2":
				
				System.out.println("Enter the name of the book you want to delete: ");
				String name1 = sc.next();
				
				service.delteByName(name1);
				System.out.println("book "+ name1 +" was deleted");
				
			break;
			case"3":
				System.out.println("Enter the name of book: ");
				String name2 = sc.next();
				if(service.findByName(name2) !=null
				){
				Book book1 =  new Book();
				System.out.println("Enter new name: ");
				String newname = sc.next();
				book1.setName(newname);
				service.save(book1);	
				System.out.println("book named " + name2+ " was renamed to"+ newname);	
					
				}else System.out.println(" There is no such book ") ;
				
			break;
			case"4":
				
				System.out.println(service.findAll());
				
			break;
			case"5":
				
				System.out.println("Enter the name of book: ");
				String name3 = sc.next();
				service.findByName(name3);
				
			break;
		}	
			
			
			
			
		}//end of while
	}//end of menu
	
	
	
	
}
