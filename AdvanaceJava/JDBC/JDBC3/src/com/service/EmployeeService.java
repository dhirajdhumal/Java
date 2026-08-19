package com.service;

import com.dao.EmployeeDao;
import com.entity.Employee;
import com.exception.EmployeeNotFoundException;
import com.exception.EmployeesNotFoundException;
import com.exception.SomethingWentWrongException;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeService {
	EmployeeDao dao = new EmployeeDao();
	
	public String insertEmployee(Employee employee) {
		String msg = dao.insertEmployee1(employee);
		
		return msg;
	}
	
	public String updateEmployee(Employee employee){
		String msg = dao.updateEmployee(employee);

		if(msg == null) {
			throw new SomethingWentWrongException("Check Ypur Sql Query");
		}
		
		return msg;
	}

	public String deleteEmployee(int id) throws SQLException {
		String msg = dao.deleteEmployee(id);

		if(msg == null){
			throw new SQLException("Value not found for deletion");
		}

		return msg;
	}

	public Employee getEmployee(int id){
		Employee employee = dao.getEmployee(id);
		
		if(employee == null){
			throw new EmployeeNotFoundException("Employee Not Found with id: " + id);
		}

		return employee;
	}

	public ArrayList<Employee> getAllEmployees() {
		ArrayList<Employee> employees = dao.getAllEmployees();
		if(employees.isEmpty()){
			throw new EmployeesNotFoundException("No Employees Present in the Database");
		}

		return employees;
		
	}
}
