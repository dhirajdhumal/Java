package thisandsuper.thiskeywordcall;

public class ThisKeyword {

    int id;
    String name;

    void display(int id, String name) { //to differntiate local and instance variable we use this keyword.
        this.id = id;   //here this.id means it is a instance variable // without this id is a local variable.
        this.name = name;  //here this.name means it is instance variable // without this name is a local variable.
    }

    void show(){
        System.out.println(id);
        System.out.println(name);
    }

    public static void main(String[] args) {
        ThisKeyword s = new ThisKeyword();
        s.id = 10;
        s.name = "Dhiraj";
        s.show();
    }
}
