package Practice.UserDefineInterface;

public interface Calculate<T, U, R> {
    R calculator(T t, U u);

    public static void main(String[] args) {
        Calculate<Integer, Integer, Integer> c = (a,b)->{
            return a+b;
        };
        int addition = c.calculator(14, 15);
        System.out.println("Addition is: " + addition);
        
        Calculate<Integer, Integer, Integer> c1 = (a,b)->{
            return a-b;
        };
        int subtraction = c1.calculator(14, 15);
        System.out.println("Subtraction is: " + subtraction);

        Calculate<Integer, Integer, Integer> c2 = (a,b)->{
            return a*b;
        };
        int multiplication = c2.calculator(14, 15);
        System.out.println("Multiplication is: " + multiplication
        );

        Calculate<Integer, Integer, Integer> c3 = (a,b)->{
            return a/b;
        };
        int division = c3.calculator(14, 15);
        System.out.println("Division is: " + division);
    }
}
