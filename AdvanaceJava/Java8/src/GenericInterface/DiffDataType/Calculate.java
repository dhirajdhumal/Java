package GenericInterface.DiffDataType;

import java.util.Arrays;

import FunctionalInterface.PassStudentArray.Student;

public class Calculate {
    public static void main(String[] args) {
        Test<Integer, String> t = (a,b)->{
            System.out.println(a + " " + b);
        };
        t.printData(12, "Dhiraj Dhumal");

        Test<Integer, int[]> t1 = (a,b)->{
            System.out.println(a + " " + Arrays.toString(b));

        };
        t1.printData(21, new int[]{1, 2, 3});

        Test<Float, String> t2 = (a,b)->{
            System.out.println(a + " " + b);
        };
        t2.printData(12.5f, "Dhiraj Dhumal");

        Test<Student, String> t3 = (a,b)->{
            System.out.println(a.getStudentId());
            System.out.println(a.getStudentName());
            System.out.println(a.getAge());
            System.out.println(b);
        };
        t3.printData(new Student(25, 1, "Dhiraj Dhumal"), "Engineer");
    }
}

