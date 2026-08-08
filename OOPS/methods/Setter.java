package com.methods;

public class Setter {
    String username;
    String password;
    String email;

    void set(String username, String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;
        show();
    }

    void show(){
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Email: " + email);
    }
    public static void main(String[] args) {
        Setter user1 = new Setter();
        user1.set("Dhiraj", "Jay@9322", "dhirajdh9421@gmail.com");
    }
}
