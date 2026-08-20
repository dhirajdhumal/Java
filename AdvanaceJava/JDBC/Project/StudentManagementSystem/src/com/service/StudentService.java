package com.service;

import java.util.ArrayList;
import java.util.List;

import com.dao.StudentDao;
import com.entity.User;
import com.exception.AgeIsLessThanException;
import com.exception.DatabaseAlreadyExistsException;
import com.exception.InvalidEmailException;
import com.exception.UserNotExistException;
import com.exception.UsersNotFoundException;

public class StudentService {
	
	StudentDao dao = new StudentDao();

	public String createDatabase() {
		return dao.createDatabase();
	}
	
	public String createTable() {
		return dao.createTable();
	}
	
	public String insertUser(User user) {
		return dao.insertUser(user);
	}
	
	public String insertMultilpleUsers(List<User> users) {
		
		for(User user:users) {
			if(user.getAge() < 18) {
				throw new AgeIsLessThanException("Age is less than 18");
			}
			
			if(user.getEmail() == null || !user.getEmail().contains("@")) {
				throw new InvalidEmailException("Invalid Email Address");
			}
		}
		
		return dao.insertMultipleUsers(users);
	}
	
	public String updateUser(String username, int id) {
		return dao.updateUser(username, id);
	}
	
	public String updateUsers(User user) {
		return dao.updateUsers(user);
	}
	
	public String deleteUser(int id) {
		
		int rows = dao.deleteUser(id);
		
		if(rows == 0) {
			return "User does not exist";
		}
		return "User deleted successfully";
	}
	
	public String deleteAllUsers() {
		
		int rows = dao.deleteAllUsers();
		
		if(rows == 0) {
			return "Users Not Exists";
		}
		return "Users deleted successfully";
	}

	public User getUser(int id) {
		
	User user = dao.getUser(id);
			if(user == null) {
				throw new UserNotExistException("User Not Exist: " + id);
			}
				
		return user;
	}

	public ArrayList<User> getAllUsers(){
		
			ArrayList<User> user = dao.getAllUsers();
			if(user.isEmpty()) {
				throw new UsersNotFoundException("No Users Found");
			}
			return user;
	}
}
