package interfaces;

public interface Test {
    int id = 10;
    String name = "Dhiraj";

    void login();
    public void register();
    abstract void email();

    public static void main(String[] args) {
        System.out.println(Test.id);
    }
}
