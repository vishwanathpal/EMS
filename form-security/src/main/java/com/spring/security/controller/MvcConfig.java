package com.spring.security.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer{
	
	
	public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/user").setViewName("user");
        registry.addViewController("/registration_User_admin").setViewName("registration_User_admin");
//        registry.addViewController("/registration_User_admin");
    }
	
	/*@PostMapping("/registration_User_admin")
    public String greetingSubmit(@ModelAttribute employee emp) {
        return "home";
    }
	
	@RequestMapping(value = "/registration_User_admin", method = RequestMethod.GET)
    public String showRegistrationForm(WebRequest request, Model model) {
		employee emp = new employee();
        model.addAttribute("employee", emp);
        return "registration_User_admin";
    } 
	
	@RequestMapping("/home")
	public ModelAndView firstPage() {
		return new ModelAndView("home");
	}*/
	
	
	
}
