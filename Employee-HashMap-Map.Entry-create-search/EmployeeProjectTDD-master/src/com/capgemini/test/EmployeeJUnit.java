package com.capgemini.test;

import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.beans.Address;
import com.capgemini.beans.City;
import com.capgemini.beans.Country;
import com.capgemini.beans.Employee;
import com.capgemini.exceptions.DuplicateIdException;
import com.capgemini.exceptions.EmployeeDoesNotExist;
import com.capgemini.exceptions.InvalidAddressException;
import com.capgemini.exceptions.InvalidIdException;
import com.capgemini.exceptions.InvalidNameException;
import com.capgemini.exceptions.SearchByNullException;
import com.capgemini.repository.EmployeeRepository;
import com.capgemini.repository.EmployeeRepositoryImplementation;
import com.capgemini.service.EmployeeService;
import com.capgemini.service.EmployeeServiceImplementation;

public class EmployeeJUnit {

	EmployeeRepository employeeRepository=new EmployeeRepositoryImplementation() ;
    //@Mock
	EmployeeService employeeService = new EmployeeServiceImplementation(employeeRepository);
	
	
	@Before
	public void setUp() throws Exception {
		employeeService = new EmployeeServiceImplementation(employeeRepository);
	}

	@Test(expected=com.capgemini.exceptions.InvalidIdException.class)
	public void test() throws InvalidIdException, DuplicateIdException, InvalidNameException, InvalidAddressException {
		City c=new City("mathura");
		Country cn = new Country("India",c);
		Address ad = new Address("krishna nagar",cn);
		employeeRepository.save(employeeService.createEmployee(-1, "Krishan", ad));
	}
	
	
	@Test
	public void test6() throws InvalidIdException, DuplicateIdException, InvalidNameException, InvalidAddressException {
		City c=new City("mathura");
		Country cn = new Country("India",c);
		Address ad = new Address("krishna nagar",cn);
		employeeRepository.save(employeeService.createEmployee(1, "Krishan", ad));
	}
	
	
	@Test(expected=com.capgemini.exceptions.DuplicateIdException.class)
	public void test1() throws InvalidIdException, DuplicateIdException, InvalidNameException, InvalidAddressException {
		
		City c=new City("mathura");
		Country cn = new Country("India",c);
		Address ad = new Address("krishna nagar",cn);
		Employee e=employeeRepository.save(employeeService.createEmployee(1, "Krishan", ad));
		
		City c1=new City("singapore");
		Country cn1 = new Country("England",c1);
		Address ad1 = new Address("ravi nagar",cn1);
		Employee e1=employeeRepository.save(employeeService.createEmployee(1, "ravi", ad1));
	}
	
	
	@Test(expected=com.capgemini.exceptions.InvalidNameException.class)
	public void test2() throws InvalidIdException, DuplicateIdException, InvalidNameException, InvalidAddressException {
		City c=new City("mathura");
		Country cn = new Country("India",c);
		Address ad = new Address("krishna nagar",cn);
		employeeService.createEmployee(2, null, ad);
	}
	
	
	
	@Test(expected=com.capgemini.exceptions.EmployeeDoesNotExist.class)
	public void test3() throws InvalidIdException, DuplicateIdException, InvalidNameException, EmployeeDoesNotExist, InvalidAddressException {
		City c=new City("mathura");
		Country cn = new Country("India",c);
		Address ad = new Address("krishna nagar",cn);
		employeeService.createEmployee(2, "ravi", ad);
		List<Employee> al=employeeRepository.findByName("krishan");

	}
	
	
	
	
	@Test(expected=com.capgemini.exceptions.SearchByNullException.class)
	public void test4() throws SearchByNullException, InvalidIdException, DuplicateIdException, InvalidNameException, EmployeeDoesNotExist, InvalidAddressException {
		City c=new City("mathura");
		Country cn = new Country("India",c);
		Address ad = new Address("krishna nagar",cn);
		employeeService.createEmployee(2, "ravi", ad);
		List<Employee> al=employeeService.SearchByName(null);

	}
	
	
	@Test
	public void test5() throws SearchByNullException, InvalidIdException, DuplicateIdException, InvalidNameException, EmployeeDoesNotExist, InvalidAddressException {
		City c=new City("mathura");
		Country cn = new Country("India",c);
		Address ad = new Address("krishna nagar",cn);
		employeeService.createEmployee(2, "ravi", ad);
		List<Employee> al=employeeService.SearchByName("ravi");
		System.out.println(al);

	}
	
	
	
	@Test(expected=com.capgemini.exceptions.InvalidAddressException.class)
	public void test7() throws InvalidIdException, DuplicateIdException, InvalidNameException, InvalidAddressException {
		City c=new City("Mathura");
		Country cn = new Country("India",c);
		Address ad = new Address("krishna nagar",cn);
		employeeRepository.save(employeeService.createEmployee(1, "Krishan", null));
	}
	
	

}
