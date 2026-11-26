package Practice.PreDefineInterface.Predicate;

import java.util.function.Predicate;

public class CheckString {
    public static void main(String[] args) {
        Predicate<String> i = (k)->{
            return k.length() > 5;
        };

        boolean ans = i.test("Dhiraj");
        System.out.println(ans);

        boolean ans1 = i.test("Jay");
        System.out.println(ans1);

        boolean ans2 = i.test("Adesh");
        System.out.println(ans2);

        boolean ans3 = i.test("Kausalya");
        System.out.println(ans3);

        boolean ans4 = i.test("Vedant");
        System.out.println(ans4);

        boolean ans5 = i.test("Shreyash");
        System.out.println(ans5);

        boolean ans6 = i.test("Rushikesh");
        System.out.println(ans6);

        boolean ans7 = i.test("Vivek");
        System.out.println(ans7);
        
        boolean ans8 = i.test("Ganesh");
        System.out.println(ans8);

        boolean ans9 = i.test("Omkar");
        System.out.println(ans9);
    }
    
}
