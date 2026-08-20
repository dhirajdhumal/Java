package com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.controller.StudentController;
import com.entity.User;

public class StudentMain {
	StudentController controller = new StudentController();
	
	public void createDatabase() {
		
		String msg = controller.createDatabase();
			
		System.out.println(msg);	
	}
	
	public void createTable() {
		
		String msg = controller.createTable();
		
		System.out.println(msg); 
	}
	
	public void insertUser() {
		User user = new User(2,"Dhiraj", "Jay@9322", "dhirajdh9421@gmail.com", "Male", "Pune", "30-07-2004",22, 942190034);

		String msg = controller.insertUser(user);
		
		System.out.print(msg);
	}
	
	public void insertMultipleUsers() {
		try {
			User user1 = new User(9,"Dhiraj", "Jay@9322", "", "Male", "Pune", "30-07-2004",22, 942190034);
			User user2 = new User(10,"Dhiraj", "Jay@9322", "dhirajdh@9421gmail.com", "Male", "Pune", "30-07-2004",22, 942190034);
			
		    List<User> users = Arrays.asList(user1, user2);
			String msg = controller.insertMultipleUsers(users);
			
			System.out.println(msg);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}	
	}
	
	public void updateUser() {
		String msg = controller.updateUser("Kaka", 1);
		System.out.println(msg);
	}
	
	public void updateUsers() {
		User user = new User(10, "Dhiraj", "Jay@9322", "Jay@gmail.com", "Male", "Pune", "30-07-2004",22, 942190034);
		String msg = controller.updateUsers(user);
		System.out.println(msg);
	}
	
	public void deleteUser() {
		String msg = controller.deleteUser(2);
		System.out.println(msg);
	}

	public void deleteAllUsers() {
		String msg = controller.deleteAllUsers();
		System.out.println(msg);
	}
	
	public void printUser() {

		try {
			User msg = controller.getUser(2);
			
			System.out.println(msg);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	public void printAllUsers() {
		
		
		try {
			ArrayList<User> msg = controller.getAllUser();
			for(User users:msg) {
				System.out.println("Id :" + users.getId());
				System.out.println("Username :" + users.getUsername());
				System.out.println("Password :" + users.getPassword());
				System.out.println("Mail-id :" + users.getEmail());
				System.out.println("Gender :" + users.getGender());
				System.out.println("Address :" + users.getAddress());
				System.out.println("DOB :" + users.getDob());
				System.out.println("Age :" + users.getAge());
				System.out.println("Mobile No :" + users.getMoNumber());
				
				System.out.println("================================");
				
				System.out.println(msg);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		
		StudentMain operation = new StudentMain();
		operation.printAllUsers();
	}
}
