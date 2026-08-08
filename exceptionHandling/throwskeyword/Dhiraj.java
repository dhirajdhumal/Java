package exceptionHandling.throwskeyword;

public class Dhiraj {

    void fun() throws ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException {
        System.out.println(10/0);
    }

    public static void main(String[] args) {
        Dhiraj d = new Dhiraj();

        try{
            d.fun();
        }catch (ArithmeticException a){
            System.out.println(a.getMessage());
        }
    }
}
