package constructor;

public class User {
    String username;
    String password;
    String email;
    int age;

    User(String username, String password, String email, int age){
        this.username = username;

        if(password.length()>=5){
            this.password = password;
        }else {
            this.password = "Invalid Password";
        }

        if(email.contains("@")){
            this.email = email;
        }else {
            this.email = "Invalid Email";
        }

        if(age >= 18){
            this.age = age;
        }else {
            this.age = 0;
        }
        show();
    }

    void show(){
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        new User("Dhiraj", "5985", "dhiraj@gmail.com", 22);
        new User("Jay", "45789","jaygmail.com", 18);
        new User("Adesh", "457895", "adesh@gmail.com",16);
    }
}
