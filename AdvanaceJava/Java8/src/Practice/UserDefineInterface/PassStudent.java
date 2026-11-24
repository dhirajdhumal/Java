package Practice.UserDefineInterface;

import FunctionalInterface.PassStudentArray.Student;

public interface PassStudent<T> {
    void displayStudent(T t);

    public static void main(String[] args) {
        PassStudent<Student> s = (studentInfo)->{
            System.out.println(studentInfo.getStudentId());
            System.out.println(studentInfo.getStudentName());
            System.out.println(studentInfo.getAge());
        };

        s.displayStudent(new Student(23, 2, "Dhiraj"));
    }
}
