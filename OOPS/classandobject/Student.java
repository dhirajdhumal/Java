package classandobject;

public class Student {
    /*
    //wrong approach
    int id = 21;
    String name = "Dhiraj";

    void add(){
        System.out.println("Dhiraj");
    }
    */

    int id;
    String name;


    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 35;
        s1.name = "Jay";
        System.out.println(s1.id);
        System.out.println(s1.name);

        Student s2 = new Student();
        s2.id = 21;
        s2.name = "Dhiraj";
        System.out.println(s2.id);
        System.out.println(s2.name);

        Student s3 = new Student();
        s3.id = 10;
        s3.name = "Adesh";
        System.out.println(s3.id);
        System.out.println(s3.name);
    }
}
