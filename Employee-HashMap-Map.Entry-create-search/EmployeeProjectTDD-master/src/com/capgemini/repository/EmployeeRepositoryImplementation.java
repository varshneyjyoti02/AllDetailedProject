package com.capgemini.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.capgemini.beans.Employee;
import com.capgemini.exceptions.EmployeeDoesNotExist;

public class EmployeeRepositoryImplementation implements EmployeeRepository {
	
	HashMap<Integer,Employee> hm= new HashMap<>();

	@Override
	public Employee save(Employee employee) {
		// TODO Auto-generated method stub
		hm.put(employee.getId(), employee);
		return employee;
	}

	@Override
	public List<Employee> findByName(String Name) throws EmployeeDoesNotExist {
		// TODO Auto-generated method stub
		int flag=0;
		List <Employee> list = new ArrayList<>(); 
		
		for (Map.Entry<Integer,Employee>  iter : hm.entrySet()) {
			  if (iter.getValue().getName().equals(Name) ) {
			    // do something
				  flag=1;
				  list.add(iter.getValue());
			  }
			}
		if(flag==0)
		throw new EmployeeDoesNotExist();
		
		return list;
	}

	@Override
	public boolean findId(int id) {
		// TODO Auto-generated method stub
		for (Map.Entry<Integer,Employee>  iter : hm.entrySet()) {
			  if (iter.getKey()==id ) {
			    // do something
				  return true;
			  }
			}
		return false;
	}
	

}
