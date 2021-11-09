package com.cg.jpademo.dao;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;

import com.cg.jpademo.entities.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private EntityManager entityManager;

	public EmployeeDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Employee getEmployeeById(int id) {
		Employee employee = entityManager.find(Employee.class, id);
		System.out.println("getEmployeeById in EmployeeDaoImpl");
		return employee;
	}

	@Override
	public void addEmployee(Employee employee) throws EntityExistsException {
		entityManager.persist(employee);
		// entityManager.
		// CRUD - insert - persist(), select - find(), update - merge(), delete - remove() 
		// select * from students where first_name = "Sachin";
		
	}

	@Override
	public void removeEmployee(Employee employee) {
		entityManager.remove(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		entityManager.merge(employee);
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

}