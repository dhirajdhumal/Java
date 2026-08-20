package com.controller;

import java.util.ArrayList;
import java.util.List;

import com.entity.User;
import com.service.StudentService;

public class StudentController {
	StudentService service = new StudentService();
	
	public String createDatabase() {
		return service.createDatabase();
	}
	
	public String createTable() {
		return service.createTable();
	}
	
	public String insertUser(User user) {
		return service.insertUser(user);
	}
	
	public String insertMultipleUsers(List<User> users) {
		return service.insertMultilpleUsers(users);
	}
	
	public String updateUser(String username, int id) {
		return service.updateUser(username, id);
	}
	
	public String updateUsers(User user) {
		return service.updateUsers(user);
	}
	
	public String deleteUser(int id) {
		return service.deleteUser(id);
	}
	
	public String deleteAllUsers() {
		return service.deleteAllUsers();
	}
	
	public User getUser(int id) {
		return service.getUser(id);
	}
	
	public ArrayList<User> getAllUser() {
		return service.getAllUsers();
	}

}
