package com.capgemini.repository;

import java.util.List;

import com.capgemini.beans.Employee;
import com.capgemini.exceptions.EmployeeDoesNotExist;

public interface EmployeeRepository {

	Employee save(Employee employee);
	List<Employee> findByName(String Name) throws EmployeeDoesNotExist;
	boolean findId(int id);

}
