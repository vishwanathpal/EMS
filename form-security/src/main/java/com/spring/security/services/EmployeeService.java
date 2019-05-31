package com.spring.security.services;

import java.util.ArrayList;
import java.util.Optional;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.spring.security.model.employee;
import com.spring.security.repository.EmployeeRepository;

//@Service
//@Transactional
@Repository
public class EmployeeService {

	@Resource
	public EmployeeRepository employeeRepository;

	/*
	 * public void saveMyUser(employee emp) { employeeRepository.save(emp); }
	 * 
	 * @Transactional public void saveEmployees(List<employee> emp){ int size =
	 * emp.size(); int counter = 0;
	 * 
	 * List<employee> empList = new ArrayList<>();
	 * 
	 * for(employee emps : emp){ empList.add(emps);
	 * 
	 * if ((counter + 1) % 500 == 0 || (counter + 1) == size) {
	 * employeeRepository.saveAll(empList); empList.clear(); } counter++; } }
	 */
	// Method to get list of employee records
	public ArrayList<employee> showAllEmployee() {
		ArrayList<employee> emps = new ArrayList<employee>();
		for (employee emp : employeeRepository.findAll()) {
			emps.add(emp);
		}
		return emps;
	}
	
	public void deleteEmployee(int id) {
		employeeRepository.deleteById(id);
	}
	
	/*
	 * public Optional<employee> employeeById(int id) {
	 * 
	 * return employeeRepository.findById(id); }
	 */

}
