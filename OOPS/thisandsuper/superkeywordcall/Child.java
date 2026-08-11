package thisandsuper.superkeywordcall;

public class Child extends SuperKeywordCall{
    String name = "jay";
    

    public Child() {
        super();
        // when we try to call parent constructor using super call at that time our super call will be on start of the constructor.
        // here we use super call to call the parent constructor. 
        // we call only parent constructor using super call.
        // we call constructor using another constructor only.
        System.out.println("Child Constructor called....");
    }

    void work(){
        System.out.println(super.name); // here super.name means it is a parent class variable 
        System.out.println(name); // here name means current class variable
        super.work();
        // super keyword id used to differentiate parent class variables methods and child class variables methods
        // When we want to call parent method in child class methods at that time we use super keyword
        // here is no restriction like super call is at start of the constructor, we can write anywhere in the child method 
        System.out.println("Child Working.....");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.work();
    }
    
}
