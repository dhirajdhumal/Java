package Practice.PreDefineInterface.Predicate;

import java.util.function.Predicate;

public class CheckArrayList {
    public static void main(String[] args) {
        Predicate<Integer> a = (num)->{
            return num > 99 && num < 501;
        };

        Boolean ans = a.test(300);
        System.out.println(ans);
    }
}
