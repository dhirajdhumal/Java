package methods;

public class Dhiraj {
    //method with return type but no parameters
    int add(){
        return 100;
    }
    String x(){
        String name = "Dhiraj";
        String lastName = " Dhumal";
        return name + lastName;
    }
    public static void main(String[] args) {
        Dhiraj d = new Dhiraj();

        int age = d.add();
        System.out.println(age);

        String fullName = d.x();
        System.out.println(fullName);
    }
}
