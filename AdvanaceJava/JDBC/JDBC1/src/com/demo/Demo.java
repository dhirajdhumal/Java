package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo {
	
	public static void main(String[] args) {
		//Driver Class Load/Register
		//DriverManager is a Class
		//getConnection is a method of DriverManager Class
		//Connection Interface is a return type of getConnection method
		//createStatement is a method of Connection Interface
		//Statement Interface is a return type of createStatement method
		//execute is a method of Statement Interface
		
		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "Jay@9322");
			
			Statement st = con.createStatement();
			
			st.execute("CREATE DATABASE Vignesh");
			
			System.out.println("DB Created successfully!");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
