package com.spring.security.successhandler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

//reference: https://grokonez.com/spring-framework/spring-security/spring-security-customize-login-handler
// OR
//reference: https://www.javainuse.com/spring/boot_form_authentication_handler
@Component
public class CustomizeAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//you may use this object also instead of "HttpServletRequest"
	//private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		
				
		boolean admin = false;
		
		//logger.info("AT onAuthenticationSuccess(...) function!");
		
		for (GrantedAuthority auth : authentication.getAuthorities()) {
            if ("ROLE_ADMIN".equals(auth.getAuthority())){
              admin = true;
              //logger.info("AT onAuthenticationSuccess(...) ROLE!"+auth.getAuthority().toString());
            }
        }
		
		if(admin){
			response.sendRedirect("/admin_view");
	        }else{
	        	response.sendRedirect("/employee_view");
	        }
		//logger.info("AT onAuthenticationSuccess(...) function!"+admin);
	}
}
