package GenericInterface.OneDataType;

import FunctionalInterface.PassStudentArray.Student;

public class Calculator {
    public static void main(String[] args) {
        Test<Integer> t = (a)->{
            System.out.println("Single Data Type Integer: " + a);
        };
        t.add(15);

        Test<Float> t1 = (b)->{
            System.out.println("Single Data Type Float: " + b);
        };
        t1.add(12f);

        Test<String> t2 = (c)->{
            System.out.println("Single Data Type String: " + c);
        };
        t2.add("Dhiraj");

        Test<int []> t3 = (a)->{
            for(int b:a){
                System.out.print(b + " ");
            }
            System.out.println();
        };
        t3.add(new int[] {10,20,30,40,50});

        Test<Student> t4 = (student)->{
            System.out.println("Student Age: " + student.getAge());
            System.out.println("Student Id: " + student.getStudentId());
            System.out.println("Student Name: " + student.getStudentName());
        };

        t4.add(new Student(1,22,"Dhiraj"));
    }
}
