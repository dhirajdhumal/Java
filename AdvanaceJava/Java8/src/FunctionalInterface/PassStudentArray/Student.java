package FunctionalInterface.PassStudentArray;

public class Student {
    int studentId;
    String studentName;
    int age;

    public Student(int age, int studentId, String studentName) {
        this.age = age;
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getAge() {
        return age;
    }

}
