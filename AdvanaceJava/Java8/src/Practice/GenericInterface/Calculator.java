package Practice.GenericInterface;

import FunctionalInterface.PassStudentArray.Student;

public interface Calculator<T, R> {
    R displayValue(T t);

    public static void main(String[] args) {
        Calculator<Integer, String> c = (i)->{
            return i + "DHiraj";
        };
        String ans = c.displayValue(101);
        System.out.println(ans);

        Calculator<String, Integer> c1 = (s)->{
            return s.length();
        };
        int ans1 = c1.displayValue("Dhiraj");
        System.out.println(ans1);

        Calculator<Student, String> c2 = (p)->{
            return p.getStudentName();
        };
        String name = c2.displayValue(new Student(25, 25, "Kausalya"));
        System.out.println(name);

        Calculator<Double, Integer> c3 = (d)->{
            return (int) (d*3);
        };
        int ans3 = c3.displayValue(125.2365452);  
        System.out.println(ans3);
    }
}
