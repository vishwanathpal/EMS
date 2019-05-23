package com.spring.security.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
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
    }
	
	//Employee login form
    @RequestMapping(value = "/registration_User_admin")
    public ModelAndView employeeLoginForm(HttpServletRequest request, HttpServletResponse response) throws Exception 
    {
        ModelAndView registration = new ModelAndView("registration_User_admin");
        return registration;     
    }

}
