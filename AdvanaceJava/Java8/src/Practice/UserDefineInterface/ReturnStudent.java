package Practice.UserDefineInterface;

import FunctionalInterface.PassStudentArray.Student;

public interface  ReturnStudent<T, R> {
    R displayStudent(T t);

    public static void main(String[] args) {
        ReturnStudent<Student, Student> arr = (s)->{
            return s;
        };

        Student str = arr.displayStudent(new Student(12, 2, "Jay"));

        System.out.println(str.getStudentId());
        System.out.println(str.getStudentName());
        System.out.println(str.getAge());

    }
}
