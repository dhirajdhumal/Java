package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.entity.User;
import com.jdbcConnection.JDBCUtil;

public class StudentDao {
	Connection con = JDBCUtil.createConnection();
	
	public String createDatabase() {
		try {
			Statement st = con.createStatement();
			
			st.execute("CREATE DATABASE useranagement");
			
			return "Database Created Successfully";
		
		}catch(Exception e) {
			return e.getMessage();
		}
	}
	
	public String createTable() {
		try {
			Statement st = con.createStatement();
					
			st.execute("CREATE TABLE users (id INT, username VARCHAR(32), password VARCHAR(32), email VARCHAR(32), gender VARCHAR(32), address VARCHAR(32), dob VARCHAR(32), age INT, monumber BIGINT)");
			
			return "Table Created Successfully";

		}catch(Exception e){
			return e.getMessage();
		}
	}
	
	public String insertUser(User user) {
		try {
			PreparedStatement pst = con.prepareStatement("INSERT INTO users VALUES(?,?,?,?,?,?,?,?,?)");
			
			pst.setInt(1, user.getId());
			pst.setString(2, user.getUsername());
			pst.setString(3, user.getPassword());
			pst.setString(4, user.getEmail());
			pst.setString(5, user.getGender());
			pst.setString(6, user.getAddress());
			pst.setString(7, user.getDob());
			pst.setInt(8, user.getAge());
			pst.setLong(9, user.getMoNumber());
			
			pst.executeUpdate();
			
			return "Data Inserted SuccessFully";
		}catch(Exception e) {
			return e.getMessage();
		}
	}
	
	public String insertMultipleUsers(List<User> users) {
		
		try {
			
			for(User user:users) {
				PreparedStatement pst = con.prepareStatement("INSERT INTO users VALUES(?,?,?,?,?,?,?,?,?)");
				
				pst.setInt(1,user.getId());
				pst.setString(2, user.getUsername());
				pst.setString(3, user.getPassword());
				pst.setString(4, user.getEmail());
				pst.setString(5, user.getGender());
				pst.setString(6, user.getAddress());
				pst.setString(7, user.getDob());
				pst.setInt(8, user.getAge());
				pst.setLong(9, user.getMoNumber());
				
				pst.executeUpdate();
				
			}	
			return "Multiple Users Data Inserted SuccessFully";
		}catch(Exception e) {
			return e.getMessage();
		}
	}
	
	public String updateUser(String username, int id) {
		try {
			PreparedStatement pst = con.prepareStatement("UPDATE users SET username=? WHERE id=?");
			pst.setString(1, username);
			pst.setInt(2,id);
			
			pst.executeUpdate();
			
			return "User Update Successfully";
		}catch(Exception e) {
			return e.getMessage();
		}
	}
	
	public String updateUsers(User user) {
		try {
			PreparedStatement pst = con.prepareStatement("UPDATE users SET username=?, address=?, password=?, gender=?, email=?, dob=?, age=?, monumber=? WHERE id=?");
			pst.setString(1, user.getUsername());
			pst.setString(2, user.getAddress());
			pst.setString(3, user.getPassword());
			pst.setString(4, user.getGender());
			pst.setString(5, user.getEmail());
			pst.setString(6, user.getDob());
			pst.setInt(7, user.getAge());
			pst.setLong(8, user.getMoNumber());

			pst.setInt(9,user.getId());
			
			pst.executeUpdate();
			
			return "User fields Updated Successfully";
		}catch(Exception e) {
			return e.getMessage();
		}
	}
	
	public int deleteUser(int id) {

		
		try {
			PreparedStatement pst = con.prepareStatement("DELETE FROM  users WHERE id=?");
			
			pst.setInt(1, id);
			
			return pst.executeUpdate();
			
			
		}catch(Exception e) {
			 e.getMessage();
			 return 0;
		}
	
	}
	
	public int deleteAllUsers() {

		try {
			PreparedStatement pst = con.prepareStatement("DELETE FROM users");
						
			return pst.executeUpdate();
			
		}catch(Exception e) {
			 e.getMessage();
			 return 0;
		}
	
	}
	
	public User getUser(int id) {
		
		User user = null;
		try {
			PreparedStatement pst = con.prepareStatement("SELECT * FROM users WHERE id=?");
			
			pst.setInt(1, id);
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				int id1 = rs.getInt("id");
				String username = rs.getString("username");
				String password = rs.getString("password");
				String email = rs.getString("email");
				String gender = rs.getString("gender");
				String address = rs.getString("address");
				String dob = rs.getString("dob");
				int age = rs.getInt("age");
				long monumber = rs.getLong("monumber");
				
				user = new User(id1,username, password, email, gender, address, dob, age, monumber);
				
			}
			
		}catch(Exception e) {
			e.getMessage();
		}
		return user;
	}
	
	public ArrayList<User> getAllUsers() {
		
		ArrayList<User> users = new ArrayList<>();
		User user = null;
		try {
			PreparedStatement pst = con.prepareStatement("SELECT * FROM users");
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				
				int id1 = rs.getInt("id");
				String username = rs.getString("username");
				String password = rs.getString("password");
				String email = rs.getString("email");
				String gender = rs.getString("gender");
				String address = rs.getString("address");
				String dob = rs.getString("dob");
				int age = rs.getInt("age");
				long monumber = rs.getLong("monumber");
				
				user = new User(id1,username, password, email, gender, address, dob, age, monumber);
				
				users.add(user);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return users;
	}
}
