package Practice.GenericInterface;

import FunctionalInterface.PassStudentArray.Student;

public interface ReturnData<T> {
    T displayData();

    public static void main(String[] args) {
        ReturnData<Integer> t = ()->{
            return 10;
        };
        System.out.println(t.displayData());

        ReturnData<String> t1 = ()->{
            return "Jay";
        };
        System.out.println(t1.displayData());

        ReturnData<Double> t2 = ()->{
            return 10.26569;
        };
        System.out.println(t2.displayData());;

        ReturnData<Student> stu = ()->{
            return new Student(98,1,"Dhiraj");
        };
        System.out.println(stu.displayData());
    }
}
