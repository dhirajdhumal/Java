package encapsulation;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        //System.out.println(user.username); // because username variable is private thats why we cannot access here.
        user.setUsername("Dhiraj");
        System.out.println(user.getUsername()); // we can access here because of getter method getter method is public thats why we can access the username

        user.setPassword("Jay@9322");
        System.out.println(user.getPassword());

    }
}
