package PredefinedFunctionalInterface.ConsumerInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
        //Here we are Passing int value
        Consumer<Integer> t = (a)->{
            System.out.println(a);
        };
        t.accept(100);

        //Here We are Passing String
        Consumer<String> t1 = (b)->{
            System.out.println(b);
        };
        t1.accept("Dhiraj");

        //Here We are Passing String[]
        Consumer<String[]> t2 = (i)->{
            for(String a:i){
                System.out.println("String Array: " + a);
            }
        };
        t2.accept(new String[] {"Dhiraj", "Jay", "Adesh"});

        //Here We are Passing Arr[]
        Consumer<int[]> t3 = (s)->{
            for(int a:s){
                if(a%2 == 0)
                System.out.println("Integer Array: " + a);
            }
        };
        t3.accept(new int[] {1,2,3,4,5,6,7,8,9});

        //Here we are Passing User Defined Type
        Consumer<Student> t4 = (i)->{
            System.out.println(i);
        };
        t4.accept(new Student(1, "Dhiraj Dhuaml", 22));

        //Here we are Passing List
        Consumer<List<Student>> t5 = (i)->{
            System.out.println(i);
        };
        t5.accept(Arrays.asList(new Student(12, "Jay", 17), (new Student(14, "Adesh", 4))));
    }
}
