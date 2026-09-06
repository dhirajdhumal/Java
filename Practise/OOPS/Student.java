package Practise.OOPS;

public class Student {
    String name;
    int age;
    String course;

    public Student(String name, int age, String course){
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
        this.course = "Not assigned";
    }

    public void displayDetails(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(course);
    }

    public static void main(String[] args){
        Student s1 = new Student("Dhiraj" ,22, "Java");
        s1.displayDetails();

        System.out.println(""); 

        Student s2 = new Student("Jay", 18);
        s2.displayDetails();

        System.out.println(""); 

        Student s3 = new Student("Ades", 15, "Army");
        s3.displayDetails();
    }
}
