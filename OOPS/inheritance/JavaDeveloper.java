package com.inheritance;

public class JavaDeveloper extends Employee{
    void developJavaProject(){
        System.out.println("Java Developer is developer");
    }

    void work(){
        super.work(); // super keyword is used to called parent property. When parent and child have same name methods. if there is no same method we don't need a super keyword.
        System.out.println("Work of child");
    }
    public static void main(String[] args) {
        JavaDeveloper j = new JavaDeveloper();
        Employee employee = new JavaDeveloper();
        j.employeeId = 123;
        j.employeeName = "Dhiraj";
        employee.work();
        j.developJavaProject();
    }
}
