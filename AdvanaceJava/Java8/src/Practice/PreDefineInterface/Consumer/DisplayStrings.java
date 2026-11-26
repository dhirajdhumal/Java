package Practice.PreDefineInterface.Consumer;

import java.util.function.Consumer;

public class DisplayStrings {
    public static void main(String[] args) {
        Consumer<String> s = (i)->{
            System.out.println(i.toUpperCase());
        };
        s.accept("Dhiraj");
        s.accept("Jay");
        s.accept("Adesh");
        s.accept("Kausalya");
        s.accept("Suyash");
    }
}