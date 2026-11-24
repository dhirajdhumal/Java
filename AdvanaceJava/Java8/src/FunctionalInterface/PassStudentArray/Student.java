package FunctionalInterface.PassStudentArray;

public class Student {
    int studentId;
    String studentName;
    int marks;

    public Student(int marks, int studentId, String studentName) {
        this.marks = marks;
        this.studentId = studentId;
        this.studentName = studentName;
    }
    

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", studentName=" + studentName + ", age=" + marks + "]";
    }


    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getMarks() {
        return marks;
    }

}
