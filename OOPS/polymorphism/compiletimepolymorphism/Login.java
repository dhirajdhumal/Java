package polymorphism.compiletimepolymorphism;

import java.util.Scanner;

public class Login {
    void login(long mobileNo){
        int otp = (int) (Math.random() * 1000);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter OTP: " + otp);
        int userOtp = sc.nextInt();
        if(userOtp == otp){
            System.out.println("Login Success");
        }
        else{
            System.out.println("Login Failed");
        }
    }

    void login(String username, String password){
        if(username.equals("Dhiraj") && password.equals("9421")){
            System.out.println("Login Success");
        }else{
            System.out.println("Login Failed");
        }
    }

    void login(String gmail){
        if(gmail.contains("@")){
            System.out.println("Login success");
        }else {
            System.out.println("Login Failed");
        }
    }

    public static void main(String[] args) {
        Login login = new Login();

//        login.login(942190036);
//        login.login("Dhiraj", "9421");
        login.login("dhiraj@gmail.com");
    }
}
