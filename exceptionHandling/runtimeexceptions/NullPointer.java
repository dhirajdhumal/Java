package exception.runtimeexceptions;

public class NullPointer {
    public static void main(String[] args) {
        String name = "Dhiraj";

        name = null;

        try{
            System.out.println(name.toUpperCase());
        }catch (NullPointerException n){
            n.printStackTrace(); //it is used to print exception naame, message, line no
        }

    }
}
