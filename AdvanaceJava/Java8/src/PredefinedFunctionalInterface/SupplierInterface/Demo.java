package PredefinedFunctionalInterface.SupplierInterface;

import java.util.Arrays;
import java.util.function.Supplier;
public class Demo {
    public static void main(String[] args) {
        //int value returning
        Supplier<Integer> s = ()->{
            return 100;
        };
        System.out.println(s.get());

        //String value returning
        Supplier<String> s1 = ()->{
            return "Adesh";
        };
        System.out.println(s1.get());

        //Arr returning
        Supplier<int[]> s2 = ()->{
            return new int[] {405,410,415};
        };
        System.out.println(Arrays.toString(s2.get()));

        //String arr returning
        Supplier<String[]> s3 = ()->{
            return new String[] {"Adesh", "Jay", "Kausalya", "Dhiraj"};
        };
        System.out.println(Arrays.toString(s3.get()));
    }
}
