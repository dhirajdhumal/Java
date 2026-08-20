package com.entity;

public class User {
	private int id;
	private String username;
	private String password;
	private String email;
	private String gender;
	private String address;
	private String dob;
	private int age;
	private long monumber;
	
	public User(int id, String username, String password, String email, String gender, String address, String dob, int age, long monumber) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.address = address;
		this.dob = dob;
		this.age = age;
		this.monumber = monumber;
	}
	
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + ", gender="
				+ gender + ", address=" + address + ", dob=" + dob + ", age=" + age + ", monumber=" + monumber + "]";
	}



	public int getId() {
		return id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getDob() {
		return dob;
	}
	
	public int getAge() {
		return age;
	}
	
	public long getMoNumber() {
		return monumber;
	}
}
