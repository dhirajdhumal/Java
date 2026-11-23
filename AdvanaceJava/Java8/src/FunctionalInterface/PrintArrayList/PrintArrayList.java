package FunctionalInterface.PrintArrayList;

import java.util.ArrayList;

public class PrintArrayList {
    public static void main(String[] args) {
        Test t = (employees)->{
            for(Employee e :employees){
                System.out.println("id: " + e.getId());
                System.out.println(e.getName());
                System.out.println(e.getMarks());

                System.out.println("==========");
            }
        };

        ArrayList<Employee> em = new ArrayList<>();
        em.add(new Employee(12, "Dhiraj", 22));
        em.add(new Employee(2, "Jay", 223));

        t.printArrayList(em);
    }
}
