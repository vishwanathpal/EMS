package com.spring.security.services;

import java.util.ArrayList;
import javax.annotation.Resource;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import com.spring.security.model.employee;
import com.spring.security.repository.EmployeeRepository;

@Service
@Transactional
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
	public ArrayList<employee> showAllUsers() {
		ArrayList<employee> emps = new ArrayList<employee>();
		for (employee emp : employeeRepository.findAll()) {
			emps.add(emp);
		}
		return emps;
	}

}
