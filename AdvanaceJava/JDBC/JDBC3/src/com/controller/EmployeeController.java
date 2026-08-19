package com.controller;

import com.entity.Employee;
import com.service.EmployeeService;
import java.util.ArrayList;

public class EmployeeController {
	EmployeeService service = new EmployeeService();
	
	public String insert(Employee employee) {
		String msg = service.insertEmployee(employee);
		
		return msg;
	}
	
	public String update(Employee employee) {
		String msg = service.updateEmployee(employee);
		
		return msg;
	}

	public String delete(int id) throws Exception {
		return service.deleteEmployee(id);
	}

	public Employee get(int id){
		return service.getEmployee(id);
	}

	public ArrayList<Employee> getAllEmployees() {
		return service.getAllEmployees();
	}
}
