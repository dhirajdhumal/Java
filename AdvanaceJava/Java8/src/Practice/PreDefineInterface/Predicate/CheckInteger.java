package Practice.PreDefineInterface.Predicate;

import java.util.function.Predicate;

public class CheckInteger {
    public static void main(String[] args) {
        Predicate<Integer> i = (k)->{
            return k%2 == 0;
        };

        boolean ans = i.test(10);
        System.out.println(ans);

        boolean ans1 = i.test(1);
        System.out.println(ans1);

        boolean ans2 = i.test(2);
        System.out.println(ans2);

        boolean ans3 = i.test(3);
        System.out.println(ans3);

        boolean ans4 = i.test(4);
        System.out.println(ans4);

        boolean ans5 = i.test(5);
        System.out.println(ans5);

        boolean ans6 = i.test(6);
        System.out.println(ans6);

        boolean ans7 = i.test(7);
        System.out.println(ans7);
        
        boolean ans8 = i.test(8);
        System.out.println(ans8);

        boolean ans9 = i.test(9);
        System.out.println(ans9);
    }
    
}
