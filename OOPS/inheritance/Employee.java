package inheritance;

public class Employee {
    int employeeId;
    String employeeName;

    public Employee() {
        System.out.println("Employee constructor");
    }

    void work(){
        System.out.println("Employee is working");
    }

    void eat() {
        System.out.println("Employee is eating");
    }
}
