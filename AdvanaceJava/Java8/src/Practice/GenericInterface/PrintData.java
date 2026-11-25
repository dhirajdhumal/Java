package Practice.GenericInterface; 
 
import FunctionalInterface.PassStudentArray.Student;

public interface PrintData<T> {
    void displayData(T t);

    public static void main(String[] args) {
        PrintData<Integer> t = (i)->{
            System.out.println(i);
        };
        t.displayData(101);

        PrintData<String> t1 = (s)->{
            System.out.println(s);
        };
        t1.displayData("Dhiraj");

        PrintData<Double> t2 = (d)->{
            System.out.println(d);
        };
        t2.displayData(54.54343);

        PrintData<Student> stu = (student)->{
            System.out.println(student);
        };
        stu.displayData(new Student(21,1,"Dhiraj"));

    }
}