package PredefinedFunctionalInterface.FunctionInterface;

import java.util.function.Function;
import FunctionalInterface.PassStudentArray.Student;
public class Demo {
    public static void main(String[] args) {
        //String Returning
        Function<String, String> f = (i) -> {
            return i;
        };
        System.out.println(f.apply("Jay"));

        //Integer Returning
        Function<String, Integer> f1 = (i)->{
            return i.length();
        };
        System.out.println(f1.apply("Dhiraj"));

        //Returning arr
        Function<Integer, int[]> f2 = (i)->{
            return new int[] {99,98,97,96,95};
        };
        int[] arr = f2.apply(7);
        for(int k:arr){
            System.out.println("Array Elemrnt: " + k);
        }

        //Returning User Defined Type
        Function<Student, Student> s = (e)->{
            return e;
        };
        System.out.println(s.apply(new Student(21,1,"Jay")));
    }
}
