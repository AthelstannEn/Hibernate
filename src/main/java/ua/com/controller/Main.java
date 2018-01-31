package ua.com.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {

		
		Menu menu = new Menu ();
		
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("primary");
		
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		menu.menu();
//		manager.persist(new Color("White"));
//		manager.persist(new Color("Black"));
//		manager.persist(new Color("Space Gray"));
//		
		
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
		
		
	}
}
