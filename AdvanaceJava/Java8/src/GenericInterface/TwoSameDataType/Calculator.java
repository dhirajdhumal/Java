package GenericInterface.TwoSameDataType;

public class Calculator {
    public static void main(String[] args) {
        Test<Integer> t = (a,b)->{
            System.out.println("Addition is: " + (a+b));
        };
        t.add(10,20);

        Test<Float> t1 = (a,b)->{
            System.out.println("Addition of Float Values: " + (a+b));
        };
        t1.add(10f, 20f);

        Test<String> t2 = (a,b)->{
            System.out.println("Addition of String Values: " + (a+b));
        };
        t2.add("Dhiraj ", "Jay");
    }
}
