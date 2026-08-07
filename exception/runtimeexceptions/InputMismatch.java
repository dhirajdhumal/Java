package exception.runtimeexceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter your age");
            int age = sc.nextInt();
        } catch (InputMismatchException i){
            i.printStackTrace();
        }

        System.out.println("Dhiraj");
        System.out.println("Dhumal");


    }
}
