package Practice.PreDefineInterface.Predicate;

import java.util.function.Predicate;

public class CheckEvenGreater {
    public static void main(String[] args) {
        Predicate<Integer> i = (num)->{
            return num % 2 == 0;
        };

        Predicate<Integer> i2 = (num)->{
            return num > 50;
        };

        boolean ans = i.and(i2).test(50);
        System.out.println(ans); 
    }
}
