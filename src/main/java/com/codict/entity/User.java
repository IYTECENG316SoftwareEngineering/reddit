package com.codict.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

import com.codict.annotation.UniqueUsername;

@Entity
@Table(name = "app_user")
public class User {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Size(min = 3, message = "Name must be at least 3 characters!")
	@Column(unique = true)
	@UniqueUsername(message = "Such username already exist!")
	private String name;
	
	@Size(min = 1, message = "Invalid email address!")
	@Email(message = "Invalid email address!")
	private String email;
	
	@Size(min = 5, message = "Password must be at least 5 characters!")
	private String password;
	
	private boolean enabled;
	
	@OneToMany(mappedBy="user", cascade = CascadeType.REMOVE)
	private List<Entry> entries;
	
	@ManyToMany
	@JoinTable
	private List<Role> roles;

	
	
	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name.toLowerCase();
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

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public List<Entry> getEntries() {
		return entries;
	}

	public void setEntries(List<Entry> entries) {
		this.entries = entries;
	}
	
	
	
	

}
