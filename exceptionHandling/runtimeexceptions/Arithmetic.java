package exceptionHandling.runtimeexceptions;

public class Arithmetic {
    public static void main(String[] args) {
        System.out.println("Hey Dhiraj!");
        System.out.println(10+10);
        try{
            System.out.println(10/0);

        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("My name is Jay");

    }
}