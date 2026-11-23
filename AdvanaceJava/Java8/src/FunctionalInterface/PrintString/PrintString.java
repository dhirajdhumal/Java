package FunctionalInterface.PrintString;

public class PrintString {
    public static void main(String[] args) {
        Test s = (names)->{
            return names;
        };

        String Students[] =s.printStudent(new String[] {"Dhiraj", "Jay", "Adesh"});

        for(String c:Students){
            System.out.println(c);
        }
    }
}
