package com.main;

import com.controller.EmployeeController;

public class EmployeeMain {

    public static void main(String[] args) {
        EmployeeController controller = new EmployeeController();

		while(true){
			System.out.println("1. Insert Employee");
			System.out.println("2. Update Employee");
			System.out.println("3. Delete Employee");
			System.out.println("4. Get by Id Employee");
			System.out.println("5. Get Employee By Name");
			System.out.println("6. Get Employee By Department");
			System.out.println("7. Delete Employee by Id");
			System.out.println("8. Get All Employees");
			System.out.println("9. Exit");
		}

        // Insert Data
		// Employee e = new Employee(15, "Hardik", "Male", "Barods", "Cricket", 45784541);
		
		// String msg = controller.insert(e);
		
		// System.out.println(msg);
        //Update Data
        // try {
        // 	Employee e = new Employee(15, "Hardik Pandya", "Male", "Baroda", "International + National", 78454515);
        // String msg = controller.update(e);
        // System.out.println(msg);
        // } catch (SomethingWentWrongException e) {
        // 	e.printStackTrace();
        // }

        //Delete data
        // try {
        // 		System.out.println(controller.delete(8));
        // } catch (Exception e) {
        // 	e.printStackTrace();
        // }

        //get single employee
        // try {
        //     Employee employee = controller.get(1);
        //     System.out.println(employee);

        // } catch (EmployeeNotFoundException e) {
        //     System.out.println(e.getMessage());
        // }

		// //get all employees
		// ArrayList<Employee> all = controller.getAllEmployees();
		// for(Employee employee : all) {
		// 	System.out.println(employee);
		// }

		// //get all employees
		// try{
		// 		ArrayList<Employee> all = controller.getAllEmployees();
		// for(Employee employee : all){
		// 	System.out.println("Id: " + employee.getId());
		// 	System.out.println("Name: " + employee.getName());
		// 	System.out.println("Gender: " + employee.getGender());
		// 	System.out.println("Department: " + employee.getDepartment());
		// 	System.out.println("City: " + employee.getCity());
		// 	System.out.println("Salary: " + employee.getSalary());
		// 	System.out.println("-----------------------------");
		// }

		// }catch(Exception e){
		// 	System.out.println(e.getMessage());
		// }
	
    }
}
