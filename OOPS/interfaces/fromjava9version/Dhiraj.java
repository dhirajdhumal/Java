package interfaces.fromjava9version;

public class Dhiraj implements Test, Test2, Test3{

    @Override
    public void fun(){
        System.out.println("One class can implements multiple interfaces");
    }

    @Override
    public void run() {
        System.out.println("This is the third interface");
    }

    public static void main(String[] args) {
//        Dhiraj d = new Dhiraj();
//        d.m3();

        //using upcasting
        Test t = new Dhiraj();
        t.m3();

        Test2 t2 = new Dhiraj();
        t2.fun();

        Test3 t3 = new Dhiraj();
        t3.run();
    }
}
