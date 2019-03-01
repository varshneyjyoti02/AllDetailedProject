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
import com.capgemini.repository.EmployeeRepository;

public class EmployeeServiceImplementation implements EmployeeService {

	EmployeeRepository employeeRepository;
	
	public EmployeeServiceImplementation(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee createEmployee(int id,String name, Address address) throws InvalidIdException, DuplicateIdException, InvalidNameException, InvalidAddressException {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		if(id<0)
		{
			throw new InvalidIdException();
		}
		
		if(name==null)
		{
			throw new InvalidNameException();
		}
		
		if(employeeRepository.findId(id))
		{
			throw new DuplicateIdException();
		}
		
		if((address==null)||(address.getAddressLine()==null)||(address.getCountry().getName()==null)||(address.getCountry().getCity().getName()==null))
		{
			throw new InvalidAddressException();
		}
		
		employee.setId(id);
		employee.setName(name);
		employee.setAddress(address);
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> SearchByName(String name) throws EmployeeDoesNotExist, SearchByNullException {
		// TODO Auto-generated method stub
		
		if(name==null)
			throw new SearchByNullException();
		
		return employeeRepository.findByName(name);
	}

}
