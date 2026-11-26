package Practice.PreDefineInterface.Consumer;

import FunctionalInterface.PassStudentArray.Student;
import java.util.function.Consumer;

public class DisplayStudent {
    public static void main(String[] args){
        Consumer<Student> stu = (student)->{
            System.out.println("Student Name: " + student.getStudentName());
            System.out.println("Student id: " + student.getStudentId());
            System.out.println("Student marks: " + student.getMarks());
            System.out.println("====================");
        };
        
        Student st1 = new Student(91, 1, "Dhiraj");
        Student st2 = new Student(92, 2, "Jay");
        Student st3 = new Student(93, 3, "Adesh");
        Student st4 = new Student(94, 4, "Kausalya");

        stu.accept(st1);
        stu.accept(st2);
        stu.accept(st3);
        stu.accept(st4);
    }
}
