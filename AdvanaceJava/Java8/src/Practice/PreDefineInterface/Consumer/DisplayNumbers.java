package Practice.PreDefineInterface.Consumer;

import java.util.function.Consumer;

public class DisplayNumbers {
    public static void main(String[] args) {
        Consumer<Integer> i = (k)->{
            System.out.println("Square of " + k + ": " + k*k);
        };
        i.accept(3);
        i.accept(4);
        i.accept(6);
        i.accept(7);
        i.accept(9);
        i.accept(11);
    }
}
