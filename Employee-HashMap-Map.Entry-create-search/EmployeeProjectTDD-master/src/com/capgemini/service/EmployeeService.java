package com.capgemini.service;

import java.util.List;

import com.capgemini.beans.Address;
import com.capgemini.beans.Employee;
import com.capgemini.exceptions.DuplicateIdException;
import com.capgemini.exceptions.EmployeeDoesNotExist;
import com.capgemini.exceptions.InvalidAddressException;
import com.capgemini.exceptions.InvalidIdException;
import com.capgemini.exceptions.InvalidNameException;
import com.capgemini.exceptions.SearchByNullException;

public interface EmployeeService {
	Employee createEmployee(int id,String name,Address address) throws InvalidIdException, DuplicateIdException, InvalidNameException, InvalidAddressException;
	List<Employee> SearchByName(String name) throws EmployeeDoesNotExist, SearchByNullException;
	
	
}
