package thisandsuper.thiskeywordcall;

public class ThisCall {

    // this call is used to call another constructor of the same class.
    public ThisCall() {
        this(10); // here this(10) means it is calling another constructor of the same class which is having int parameter.
        System.out.println("this is first costructor");
    }

    public ThisCall(int a){
        this("Dhiraj", "Ok"); // here this("Dhiraj", "Ok") means it is calling another constructor of the same class which is having String and String parameter.
        System.out.println(a);
    }

    public ThisCall(String name, String password){
        System.out.print(name+ " ");
        System.out.println(password);
    }

    public static void main(String[] args) {
        ThisCall t = new ThisCall();

    }
    
}
