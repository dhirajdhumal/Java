package FunctionalInterface.PassStudentArray;

public class PrintStudent {
    public static void main(String[] args) {
        Test t = (students)->{
            for(Student s:students){
                System.out.println(s.getAge());
                System.out.println(s.getStudentId());
                System.out.println(s.getStudentName());
                System.out.println("===================");
            }
        };

        Student[] students = new Student[2];

        students[0] = new Student(1, 12, "DhiraJ");

        students[1] = new Student(12, 22, "Jay");

        t.printStudents(students);

    }
}
