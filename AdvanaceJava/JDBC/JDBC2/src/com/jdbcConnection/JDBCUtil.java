package com.jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;

//Step-1 Add jar file

//Step-2 Load/Register Driver Class

//Step-3 Establish Connection

//Step-4 Return Connection

public class JDBCUtil {
	
	private static final String url = "jdbc:mysql://localhost:3306/18aug";
	private static String username = "root";
	private static final String password = "Jay@9322";
	
	
	public static Connection createConnection() {
		// we created this con here because if we create inside the try block we cannot return it because of block scope.
		// we assign firstly null because Connection is a Interface and  every Interface and Class value is null by default.
		// return type of createConnection Method is Connection because con's return type is Connection thats why we write Connection as a written time in method.
		// here we create a method as a static because using static we can directly access this method we don't need to Create Object of this Class.
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
		
	}
}
