package methods;

public class ChainingMethod {
    void m1(){
        System.out.println("m1");
        m2();
    }

    void m2(){
        System.out.println("m2");
        m3();
    }

    void m3(){
        System.out.println("m3");
        m1();
    }
    public static void main(String[] args) {
        ChainingMethod c = new ChainingMethod();
        c.m1();
    }
}
