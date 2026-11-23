package FunctionalInterface.PrintArrayList;

public class Employee {
    int id;
    String name; 
    int marks;

    public Employee(int id, String name, int marks) {
        super();
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getMarks(){
        return marks;
    }

}
