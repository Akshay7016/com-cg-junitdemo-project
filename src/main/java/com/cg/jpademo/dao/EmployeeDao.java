package com.cg.jpademo.dao;

import javax.persistence.EntityExistsException;
import com.cg.jpademo.entities.Employee;

public interface EmployeeDao {

	public abstract Employee getEmployeeById(int id);

	public abstract void addEmployee(Employee student) throws EntityExistsException;

	public abstract void removeEmployee(Employee student);

	public abstract void updateEmployee(Employee student);

	public abstract void commitTransaction();

	public abstract void beginTransaction();

}