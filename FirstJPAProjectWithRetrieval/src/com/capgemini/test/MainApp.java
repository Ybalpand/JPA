package com.capgemini.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.entity.Employee;

public class MainApp {

	public static void main(String[] args) throws Exception{
		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		
		EntityManager entityManager = factory.createEntityManager();
		
		/*EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		Employee emp = new Employee();
		emp.setEno(222);
		emp.setEname("Nilesh");
		emp.setEsalary(50000);
		emp.setEaddress("Pune");
		
		
		entityManager.persist(emp);
		entityTransaction.commit();
		
		System.out.println("Employee inserted successfully");*/
		
		
		Employee emp = entityManager.find(Employee.class, 111);
		
		System.out.println("Employee details");
		System.out.println(emp.getEno());
		System.out.println(emp.getEname());
		System.out.println(emp.getEsalary());
		System.out.println(emp.getEaddress());
		entityManager.close();
		
		
		

	}

}
