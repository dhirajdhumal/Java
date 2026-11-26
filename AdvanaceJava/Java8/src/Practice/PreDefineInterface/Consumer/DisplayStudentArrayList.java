package Practice.PreDefineInterface.Consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

import FunctionalInterface.PassStudentArray.Student;
import java.util.Arrays;

public class DisplayStudentArrayList {
    public static void main(String[] args) {
        Consumer<ArrayList<Student>> s = (students) -> {
            for (Student student : students) {
                if (student.getMarks() > 80) {
                    System.out.println(student.getStudentId());
                    System.out.println(student.getStudentName());
                    System.out.println(student.getMarks());
                    System.out.println("=============================");
                }
            }
        };
        ArrayList<Student> students = new ArrayList<>(Arrays.asList(
                new Student(98, 1, "Dhiraj"),
                new Student(98, 2, "Jay")));
        s.accept(students);
    }
}
