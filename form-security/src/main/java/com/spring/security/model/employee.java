package com.spring.security.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.ui.ModelMap;

@Entity
@Table
public class employee {
	
	@Id
    @GeneratedValue
    @Column
    private Integer id;
    
	@Column
    private String first_name;
    
	@Column
    private String last_name;
    
	@Column(name = "date_birth")
    private String dob;
    
	@Column(unique=true)
    private String email;
	
	@Column
	private String password;
	
	@Column
    private String department;
	
	@Column
    private String role;

	
	
//	public employee(Integer id, String first_name, String last_name, String dob, String email, String password,
//			String department, String role) {
//		super();
//		this.id = id;
//		this.first_name = first_name;
//		this.last_name = last_name;
//		this.dob = dob;
//		this.email = email;
//		this.password = password;
//		this.department = department;
//		this.role = role;
//	}

	public employee() {
		// TODO Auto-generated constructor stub
	}

	/*public employee(ModelMap model) {
		// TODO Auto-generated constructor stub
	}*/

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}	

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	public String toString() {
        return String.format("{id=%s, first_name='%s', last_name='%s', date_birth='%s', email='%s', password='%s', department='%s', role='%s'}", id, first_name, last_name, dob, email, password, department, role);
    }

}
