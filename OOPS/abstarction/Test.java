package abstarction;

public class Test extends Student{
    @Override
    void login(){
        System.out.println("Login method implementation");

    }

    @Override
    void register() {

    }

    @Override
    void work(){

    }

    public static void main(String[] args) {
        Test t = new Test();
        t.login();
        t.register();
        t.work();
    }
}
