package com.capg.pro.entity;

import java.util.Objects;

public class User {
	
	private int user_id;
	private String user_name;
	private String email;
	private String password;
	private String role;
	private String mobile;
	private String address;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, email, mobile, password, role, user_id, user_name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(address, other.address) && Objects.equals(email, other.email)
				&& Objects.equals(mobile, other.mobile) && Objects.equals(password, other.password)
				&& Objects.equals(role, other.role) && user_id == other.user_id
				&& Objects.equals(user_name, other.user_name);
	}
	
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name + ", email=" + email + ", password=" + password
				+ ", role=" + role + ", mobile=" + mobile + ", address=" + address + "]";
	}
}
