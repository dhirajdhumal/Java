package Practice.UserDefineInterface;

import java.util.ArrayList;
import java.util.Arrays;

import FunctionalInterface.PassStudentArray.Student;

public interface StudentOperation<T> {
    void displayStudents(T t);

    public static void main(String[] args) {
        StudentOperation<ArrayList<Student>> stu = (students)->{
            for(Student i:students){
                if(i.getMarks()>75){
                    System.out.println(i);
                }
            }
        };

        ArrayList<Student> students = new ArrayList<>(Arrays.asList(new Student(96, 1, "Dhiraj"), new Student(38, 2, "Adesh"),new Student(87, 3, "Jay"),new Student(78, 4, "Suyash"),new Student(96, 5, "Vedant")));
        stu.displayStudents(students);
    }
}


