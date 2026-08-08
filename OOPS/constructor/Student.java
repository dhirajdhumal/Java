package constructor;

public class Student {
    int id;
    //Constructor
    Student(){
        System.out.println("Non-Parameterized/Default constructor");
    }
    Student(int a){
        id = a;
        System.out.println();
    }
    void show(){
        System.out.println("Id is: " + id);
    }


    public static void main(String[] args) {
        Student s1 = new Student(122);  //Object with reference variable. when we need to call method. s1.add(),s1.show
        s1.show();
        //new Student(); //Object without reference variable. only one method call using this like new Student().add()
        //Anonymos Object -> Object without name is called anonymos object

    }
}
