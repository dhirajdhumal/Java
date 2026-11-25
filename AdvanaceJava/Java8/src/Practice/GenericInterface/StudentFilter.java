package Practice.GenericInterface;

import FunctionalInterface.PassStudentArray.Student;

public interface StudentFilter<T, R> {
    R showResult(T t);

    public static void main(String[] args) {
        StudentFilter<Student, Boolean> s = (student)->{
            return student.getMarks()>60; 
        };
        Boolean result = s.showResult(new Student(61, 2, "Jay"));
        System.out.println(result);
    }
}