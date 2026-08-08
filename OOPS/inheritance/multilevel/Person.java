package inheritance.multilevel;

public class Person {
    String name;
    int age;
    String address;

    Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

//    void setPersonData(String name, int age, String address){
//        this.name = name;
//        this.age = age;
//        this.address = address;
//    }

    void showPersonData(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}
