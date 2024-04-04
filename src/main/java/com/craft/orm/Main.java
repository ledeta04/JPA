package com.craft.orm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student("James", "Bond", "Livingston", 30, "Jamica");
		

		Persistence persistence = new Persistence();
		
		EntityManagerFactory entityManagerFactory = persistence.createEntityManagerFactory("mysql");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		//Insert
//		entityManager.persist(student);
		
		//Select
//		System.out.println(entityManager.find(student.getClass(), 1));
		
		//Update
	//JPA does not have a Method for Update	so we have to select first then use Setter method 
		
		//Delete
		entityManager.remove(student);
		
		entityManager.getTransaction().commit();

	}

}
