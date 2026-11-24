package PredefinedFunctionalInterface.PredicateInterface;

import java.util.function.Predicate;
public class Demo {
    public static void main(String[] args) {
        //Passing Integer Value
        Predicate<Integer> p = (i)->{
            return i%2 == 0;
        };
        boolean b = p.test(112);
        System.out.println(b);

        //Passing String Value
        Predicate<String> s = (i)->{
            return i.length() < 2;
        };
        boolean c = s.test("Dhiraj");
        System.out.println(c);
    }
}
