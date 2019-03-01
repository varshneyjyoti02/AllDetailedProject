package com.capgemini.view;

import java.util.List;

import com.capgemini.beans.Address;
import com.capgemini.beans.City;
import com.capgemini.beans.Country;
import com.capgemini.beans.Employee;
import com.capgemini.exceptions.DuplicateIdException;
import com.capgemini.exceptions.EmployeeDoesNotExist;
import com.capgemini.exceptions.InvalidAddressException;
import com.capgemini.exceptions.InvalidIdException;
import com.capgemini.exceptions.InvalidNameException;
import com.capgemini.repository.EmployeeRepository;
import com.capgemini.repository.EmployeeRepositoryImplementation;
import com.capgemini.service.EmployeeServiceImplementation;

public class MainApp {

	public static void main(String[] args) throws InvalidIdException, DuplicateIdException, InvalidNameException, EmployeeDoesNotExist, InvalidAddressException {
		
		EmployeeRepository employeeRepository = new EmployeeRepositoryImplementation();
		// TODO Auto-generated method stub
		
		EmployeeServiceImplementation es = new  EmployeeServiceImplementation(employeeRepository);
		
		City c=new City("mathura");
		Country cn = new Country("India",c);
		Address ad = new Address("krishna nagar",cn);
		employeeRepository.save(es.createEmployee(101, "Krishan", ad));


		
		c.setName("delhi");
		cn.setCity(c);
		cn.setName("India");
		ad.setCountry(cn);
		ad.setAddressLine("karol baag");
		Employee e=es.createEmployee(102, "Krishan", ad);
		employeeRepository.save(e);
		
		
		List<Employee> al=employeeRepository.findByName("Krishan");
		for(Employee em:al)
		{
		System.out.println(em);
		}

	}

}
