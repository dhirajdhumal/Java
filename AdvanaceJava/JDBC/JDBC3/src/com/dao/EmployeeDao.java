package com.dao;

import com.entity.Employee;
import com.jdbcConnection.JDBCUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
    //Database Code

    Connection con = JDBCUtil.createConnection();

    //createTable
    public void createTable() {
        try {
            Statement st = con.createStatement();

            st.execute("CREATE TABLE employees (id INT, name VARCHAR(50), salary DOUBLE, department VARCHAR(34), gender VARCHAR(34), city VARCHAR(34))");

            System.out.println("Table Created SuccessFully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //not recommended Statement
    public void insertEmployee(Employee employee) {
        try {
            Statement st = con.createStatement();

            st.execute("INSERT INTO employees VALUES('" + employee.getId() + "','" + employee.getName() + "','" + employee.getSalary() + "','" + employee.getDepartment() + "','" + employee.getGender() + "','" + employee.getCity() + "')");

            System.out.println("Eemployee Inserted Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //not recommended using Statement
    public void insertMultipleEmployee(List<Employee> employee) {
        try {
            Statement st = con.createStatement();
            for (Employee ee : employee) {
                st.execute("INSERT INTO employees VALUES('" + ee.getId() + "','" + ee.getName() + "','" + ee.getSalary() + "','" + ee.getDepartment() + "','" + ee.getGender() + "','" + ee.getCity() + "')");
            }

            System.out.println("Multiple Eemployees Inserted Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Recommended using PreparedStatement
    public String insertEmployee1(Employee employee) {
        try {
//			Statement st = con.createStatement();

            PreparedStatement pst = con.prepareStatement("INSERT INTO employees VALUES(?,?,?,?,?,?)");

            pst.setInt(1, employee.getId());
            pst.setString(2, employee.getName());
            pst.setDouble(3, employee.getSalary());
            pst.setString(4, employee.getDepartment());
            pst.setString(5, employee.getGender());
            pst.setString(6, employee.getCity());

            pst.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "Employee Inserted Successfully";
    }

    //Recommended using PreparedStatement Multiple Employees at a time
    public void insertMultipleEmployee1(List<Employee> employee) {
        try {
//			Statement st = con.createStatement();
            for (Employee ee : employee) {
                PreparedStatement pst = con.prepareStatement("INSERT INTO employees VALUES(?,?,?,?,?,?)");

                pst.setInt(1, ee.getId());
                pst.setString(2, ee.getName());
                pst.setDouble(3, ee.getSalary());
                pst.setString(4, ee.getDepartment());
                pst.setString(5, ee.getGender());
                pst.setString(6, ee.getCity());

                pst.execute();
            }

            System.out.println("Eemployee Inserted Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Recommended way using PreparedStatement Update Employee
    public String updateEmployee(Employee employee) {
        try {
            PreparedStatement pst = con.prepareStatement("UPDATE employees SET name=?, gender=?, salary=?, city=?, department=? WHERE id=?");

            pst.setString(1, employee.getName());
            pst.setDouble(3, employee.getSalary());
            pst.setString(5, employee.getDepartment());
            pst.setString(2, employee.getGender());
            pst.setString(4, employee.getCity());
            pst.setInt(6, employee.getId());
            // pst.executeUpdate();

            int value = pst.executeUpdate();

            if (value > 0) {
                return "Employee Update Successfully";
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public String deleteEmployee(int id) {
        try {
            PreparedStatement pst = con.prepareStatement("DELETE FROM employees WHERE id=?");

            pst.setInt(1, id);;

            int value = pst.executeUpdate();

            if (value > 0) {
                // System.out.println("Employee Deleted SuccessFully");
                return "Employee Deleted SuccessFully";
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    //get single employee 
    public Employee getEmployee(int id) {

		Employee employee = null;
        try {
            PreparedStatement pst = con.prepareStatement("SELECT * FROM employees WHERE id=?");

			pst.setInt(1,id);

			ResultSet rs = pst.executeQuery();

			while(rs.next()) {
			
			int id1 = rs.getInt("id");
			String name = rs.getString("name");
			String gender = rs.getString("gender");
			String department = rs.getString("department");
			String city = rs.getString("city");
			double salary = rs.getDouble("salary");

			employee = new Employee(id1, name, gender, department, city, salary);
			}

        } catch (Exception e) {
			e.printStackTrace();
        }
		return employee;
    }

	    //get all employee 
    public ArrayList<Employee> getAllEmployees() {

		ArrayList<Employee> employees = new ArrayList<>();
		Employee employee = null;
        try {
            PreparedStatement pst = con.prepareStatement("SELECT * FROM employees");

			ResultSet rs = pst.executeQuery();

			while(rs.next()) {
			
			int id1 = rs.getInt("id");
			String name = rs.getString("name");
			String gender = rs.getString("gender");
			String department = rs.getString("department");
			String city = rs.getString("city");
			double salary = rs.getDouble("salary");

			employee = new Employee(id1, name, gender, department, city, salary);
			employees.add(employee);
			}

        } catch (Exception e) {
			e.printStackTrace();
        }
		return employees;

    }

    public static void main(String args[]) {
        EmployeeDao dao = new EmployeeDao();
        // dao.deleteEmployee(3);
//		dao.createTable();

        //using setter
//		Employee e = new Employee();
//		e.setId(1);
//		e.setName("Dhiraj");
//		e.setCity("Pune");
//		e.setGender("Male");
//		e.setDepartment("IT");
//		e.setSalary(65021.26);
//		dao.insertEmployee(e);
        //using Constructor
//		Employee e = new Employee(1, "Jay", "Male", "IT", "Mumbai", 55124.22);
//		dao.insertEmployee(e);
        //5 Employees at a time.
//		Employee e1 = new Employee(3, "Adesh", "Male", "IT", "Mumbai", 55124.22);
//		Employee e2 = new Employee(4, "Suysah", "Male", "IT", "Mumbai", 55124.22);
//		Employee e3 = new Employee(5, "Vedant", "Male", "IT", "Mumbai", 55124.22);
//		Employee e4 = new Employee(6, "Vivek", "Male", "IT", "Mumbai", 55124.22);
//		Employee e5 = new Employee(7, "Rushikesh", "Male", "IT", "Mumbai", 55124.22);
//		List<Employee> e = Arrays.asList(e1,e2,e3,e4,e5);
//
//		dao.insertMultipleEmployee(e);
//		// using recommended way
//		Employee e = new Employee(8, "Piyush", "Male", "IT", "Nashik", 85124.22);
//		dao.insertEmployee1(e);
//		
        //5 Employees at a time using recommended way.
//		Employee e1 = new Employee(9, "Adesh", "Male", "IT", "Mumbai", 55124.22);
//		Employee e2 = new Employee(10, "Suysah", "Male", "IT", "Mumbai", 55124.22);
//		Employee e3 = new Employee(11, "Vedant", "Male", "IT", "Mumbai", 55124.22);
//		Employee e4 = new Employee(12, "Vivek", "Male", "IT", "Mumbai", 55124.22);
//		Employee e5 = new Employee(13, "Rushikesh", "Male", "IT", "Mumbai", 55124.22);
//		List<Employee> e = Arrays.asList(e1,e2,e3,e4,e5);
//
//		dao.insertMultipleEmployee1(e);
    }
}
