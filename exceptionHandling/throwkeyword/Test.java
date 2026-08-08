package exception.throwkeyword;

import java.util.Scanner;

public class Test {

    void check(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        if(age < 18){
            throw new AgeNotValidException("Age is not Eligible");
        }else{
            System.out.println("Eligible for voting");
        }
    }

    public static void main(String[] args) {
        Test t = new Test();
        try{
            t.check();
        }catch (AgeNotValidException a){
            System.out.println(a.getMessage());
        }
    }
}
