package com.spring.security.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.spring.security.model.employee;
import com.spring.security.repository.EmployeeRepository;
import com.spring.security.services.EmployeeService;

//@Configuration
//@Controller
@RestController
public class MvcConfig implements WebMvcConfigurer{
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/admin_view").setViewName("admin_view");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/employee_view").setViewName("employee_view");
//        registry.addViewController("/all_employee").setViewName("all_employee");        
        registry.addViewController("/admin_regi").setViewName("admin_regi");        
    }
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	EmployeeRepository employeeRepo;
	
//	@Autowired
//	employee empClass;
	
	private static List<employee> empList = new ArrayList<employee>();
	
	private static final Logger log = LoggerFactory.getLogger(MvcConfig.class);
	/*
	
	
	/*@PostMapping("/registration_User_admin")
    public String greetingSubmit(@ModelAttribute employee emp) {
        return "home";
    }
	
	
	
	@RequestMapping("/home")
	public ModelAndView firstPage() {
		return new ModelAndView("home");
	}
	
	
	//@GetMapping("/employee_regi")
	@RequestMapping(value = "/employee_regi")
    public String showRegistrationForm(WebRequest request, Model model) {
		employee emp = new employee(id, null, null, null, null, null, null, null);
        model.addAttribute("employee", emp);
        return "employee_regi";
    } 
    @RequestMapping("/employee_regi")
	public String employeeRegistration(HttpServletRequest request) 
	{
		request.setAttribute("mode", "employee_regi");
		return "employee_regi";
	}
    */
	
	//@GetMapping("/employee_regi")
	//@RequestMapping(method = RequestMethod.POST)
	/*	
	@RequestMapping(value = "/employee_regi", method = RequestMethod.POST)
	public String saveUser(@RequestParam (value = "id", required =   
			false) String id, @RequestParam String firstname, @RequestParam String lastname, @RequestParam String dob, @RequestParam String email, @RequestParam String password, @RequestParam String department, @RequestParam String role)
	{
		
		employee emp = new employee(id, firstname,lastname,dob, email, password, department, role);
		employeeService.saveMyUser(emp);
		return"User saved.";
	}*/
	
	@RequestMapping(value = "/employee_regi", method = RequestMethod.GET) // Map ONLY GET Requests	
    public ModelAndView showForm() 
	{
        return new ModelAndView("employee_regi", "employee_regi", new employee());
    }
	
	@RequestMapping(value ="/employee_regi") // Map POST Requests
	public @ResponseBody String addNewEmployee (@RequestParam (value = "id", required =   
			false) String id, @RequestParam String firstname, @RequestParam String lastname, @RequestParam String dob, @RequestParam String email, @RequestParam String password, @RequestParam String department, @RequestParam String role)
	{
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		employee emp = new employee();
		emp.setFirst_name(firstname);
		emp.setLast_name(lastname);
		emp.setDob(dob);
		emp.setEmail(email);
		emp.setPassword(password);
		emp.setDepartment(department);
		emp.setRole(role);		
		employeeRepo.save(emp);		
		return "Employee saved";
	}
	
	@RequestMapping(value = "/employee_list", method = RequestMethod.GET) // Map ONLY GET Requests	
    public ModelAndView showemp() 
	{
//		System.out.println("Model and view::::"+ new ModelAndView("employee_list", "employee_list", employeeRepo.findAll()).getModel());
//		ModelAndView mav = new ModelAndView("employee_list", "employee_list", employeeService.showAllUsers());
		
        return new ModelAndView("employee_list", "employee_list", employeeRepo.findAll());
    }
	
	/*
	 * @GetMapping("/employee_list") public String showAllUsers(HttpServletRequest
	 * request) { request.setAttribute("users", employeeRepo.findAll()); //
	 * request.setAttribute("mode", "ALL-USERS");
	 * System.out.println("Employee records::::::"+employeeRepo.findAll()); return
	 * "all_employee"; }
	 */
	
	
//	@RequestMapping(value ="/employee_list", method = RequestMethod.GET)
//    public String employeeList(Map<String, Object> map)
//    {
//		map.put("empList", employeeService.showAllUsers());
//		System.out.println("Employee records::::::"+map);
//		return "employee_list";
////		return map.toString();
//		
////         employee employeeVO = new employee();
////         model.addAttribute("employee", employeeVO);
////         return "all_employee";
//    }
	
	//reference::https://hellokoding.com/full-stack-crud-web-app-and-restful-apis-web-services-example-with-spring-boot-jpa-hibernate-mysql-vuejs-and-docker/
//	@GetMapping("/employee_list")
//    public ResponseEntity<List<employee>> findAll() {
//		
//        return ResponseEntity.ok(employeeService.showAllUsers());
//    }
	
//	@RequestMapping("/employee_list")
//	public String allEmployee(Model model)
//	{
//		model.addAttribute("employee_lists", employeeService.showAllUsers());
//		return "employee_lists";		
//	}
	
//	@RequestMapping(value = "/all_employee", method = RequestMethod.GET) // Map ONLY GET Requests	
//    public ModelAndView allEmployee() 
//	{
//        return new ModelAndView("all_employee", "all_employee", employeeService.showAllUsers());
//    }
	
//	@GetMapping("/all_employee")
//	public String showAllUsers(HttpServletRequest request) {
//		request.setAttribute("employee", employeeService.showAllUsers());
////		request.setAttribute("mode", "ALL-USERS");
//		return "all_employee";
//	}
	
//	@RequestMapping(value = "/all_employee")
//	 public ModelAndView employeeList()
//	 {
//		return new ModelAndView("all_employee", "all_employee", employeeService.showAllUsers());
//	 }
	

	
	
	/*@RequestMapping(value = "/employee_regi", method = RequestMethod.POST)
	public String saveUser(@RequestParam (value = "id", required =   
			false) String id, @RequestParam String firstname, @RequestParam String lastname, @RequestParam String dob, @RequestParam String email, @RequestParam String password, @RequestParam String department, @RequestParam String role)
	{
		
		employee emp = new employee(id, firstname,lastname,dob, email, password, department, role);
		employeeService.saveMyUser(emp);
		return"User saved.";
	}*/
	
	/*@RequestMapping(value = "/employee_regi", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("employee_regi")employee emp, BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
        model.addAttribute("id", emp.getId());
        model.addAttribute("first_name", emp.getFirst_name());
        model.addAttribute("last_name", emp.getLast_name());
        model.addAttribute("dob", emp.getDob());
        model.addAttribute("email", emp.getEmail());
        model.addAttribute("password", emp.getPassword());
        model.addAttribute("department", emp.getDepartment());
        model.addAttribute("role", emp.getRole());
        employee em = new employee(model);
        employeeService.saveMyUser(em);
        
        return "home";
    }*/
	/*
	@PostMapping(value = "/employee_regi")
    public List<employee> persist(@RequestBody final employee emp){
    	System.out.print("EMP:::::::::::::::"+emp);
    	log.info("Customers found with findAll():");
		log.info("-------------------------------");
		log.info(emp.toString());
		
		return (List<employee>) employeeRepo.save(emp);
		
	}*/
}

