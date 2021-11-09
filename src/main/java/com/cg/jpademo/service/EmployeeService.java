package com.cg.jpademo.service;

import com.cg.jpademo.entities.Employee;

public interface EmployeeService {

	public abstract void addEmployee(Employee employee);

	public abstract void updateEmployee(Employee employee);

	public abstract void removeEmployee(Employee employee);

	public abstract Employee findEmployeeById(int id);

}