package com.spring.security.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.security.model.employee;

public interface EmployeeRepository extends CrudRepository<employee, Integer>
{	
	//employee findByUsernameAndPassword(String username, String password);	
	//List<employee> findByEmail(String email);
	//employee getById(String id);
   // public List<employee> findAllByOrderByNameAsc();
}
