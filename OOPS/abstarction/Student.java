package abstarction;

public abstract class Student {
    Student(){
        System.out.println("Student Constructor");
    }


    //here we are hiding implementation from user and do implementation using child class.
    abstract void login();
    abstract void register();
    abstract void work();


    public static void main(String[] args) {

    }
}
