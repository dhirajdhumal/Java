
import java.util.ArrayList;

public class EmployeeDemo {

    public static void main(String[] args) {
        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Lingdeo", "Defence", "Male", 1, "Dhiraj", 52000));
        emp.add(new Employee("Akole", "Defence", "Male", 2, "Jay", 52000));
        emp.add(new Employee("Sangmaner", "Defence", "Male", 2, "Adesh", 52000));
        emp.add(new Employee("Pune", "Defence", "Female", 2, "Hem", 52000));

        // for (Employee employee : emp) {
        //     if(employee.getDep().equals("Defence"))
        //     System.out.println(employee);
        // }
        // for (Employee employee : emp) {
        //     if (employee.getGender().equals("Female")){
        //         double existingSalary = employee.getSalary();
        //         employee.setSalary(existingSalary + 50000);
        //         System.out.println(employee);
        //     }
        // }
        // Chnage username
        for (Employee employee : emp) {
            if (employee.getName().equals("Hem")) {
                employee.setName("Hemlata");
                System.out.println(employee);
            }
        }
    }
}
