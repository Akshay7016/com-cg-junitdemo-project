package com.cg.jpademo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeDemo {
	public static void main(String[] args) {
		
		System.out.println("Start");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("abcd");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tr = em.getTransaction();
		
		tr.begin();
		
		Employee emp1 = new Employee(101,"Akshay",15.79);
		Employee emp2 = new Employee(102,"Rohan",18.6);
		Employee emp3 = new Employee(103,"Prasad",13.9);
		
		// Inserting record  ---> After insertion we cannot again insert that record
//		em.persist(emp1);  //insert
//		em.persist(emp2);
//		em.persist(emp3);
		
//		em.remove(emp2);
		
		// Updating record
		emp1.setFirstName("Ram");
		em.merge(emp1);    //Update
		
		// Displaying record
		Employee emp4 = em.find(Employee.class, 101);   //Select
		System.out.println(emp4.toString());
		
		tr.commit();
		System.out.println("End");
	}
}
