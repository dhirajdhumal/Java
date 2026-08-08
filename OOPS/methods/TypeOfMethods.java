package methods;

public class TypeOfMethods {
    //Static method.
    static void get(){
        System.out.println("Get Dhiraj's Details");
    }

    //instance/non-static method
    double salary;
    void display(){
        System.out.println("Display salary of Dhiraj");
        System.out.println("Salary: "+salary);
    }

    void changeSalary(double newSalary){
        salary = newSalary;
    }

    public static void main(String[] args) {
        TypeOfMethods.get();

        TypeOfMethods t = new TypeOfMethods();
        t.salary = 200;
        t.display();
        t.changeSalary(400);
        t.display();

        TypeOfMethods t1 = new TypeOfMethods();
        t1.salary = 300;
        t1.display();
        t1.changeSalary(600);
        t1.display();

    }
}
