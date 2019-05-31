package com.spring.security.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.security.model.employee;
import com.spring.security.repository.EmployeeRepository;
import com.spring.security.services.EmployeeService;

@Controller
public class EmployeeController {

	
	@Autowired
	EmployeeRepository employeeRepo;
	
	@Autowired
	private EmployeeService employeeService;
	
	/*
	 * @GetMapping("/employee_list") public String showAllUsers(HttpServletRequest
	 * request) { request.setAttribute("users", employeeRepo.findAll());
	 * request.setAttribute("mode", "ALL-USERS"); //
	 * System.out.println("Employee records::::::"+employeeRepo.findAll());
	 * System.out.println("Employee records::::::"+employeeService.showAllUsers());
	 * return "employee_list"; }
	 */
	
	/*
	 * @RequestMapping("/delete-user") public String deleteUser(@RequestParam int
	 * id, HttpServletRequest request) { userService.deleteMyUser(id);
	 * request.setAttribute("users", employeeRepo.findAll());
	 * request.setAttribute("mode", "ALL-USERS"); return "welcomepage"; }
	 * 
	 * @RequestMapping("/edit-user") public String editUser(@RequestParam int
	 * id,HttpServletRequest request) { request.setAttribute("users",
	 * userService.editUser(id)); request.setAttribute("mode", "MODE_UPDATE");
	 * return "welcomepage"; }
	 */
	
	//reference: https://www.youtube.com/watch?v=w9mFOUFNmfQ
//	@RequestMapping(value = "/employee_list", method = RequestMethod.GET)
//	private String getEmployeeList(Model model)
//	{
//		List<employee> empList = employeeService.showAllUsers();
//		model.addAttribute("empList", empList);
//		System.out.println("Employee records::::::"+model);
//		
//		return "employee_list";
//	}
}
