class Student2 extends Object{
    private int id;
    private String name;
    private String address;


    public Student2(int id, String name, String address){
        super();
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // this method is used to convert the Object address to string 
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
    }

    //if we create our method that time we dont need to use toString
    String data() {
        return "Id: " + id + ", name: " + name + ", address: " + address;
    }

    // aslo we can create our own methods like
    void display(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(address); 
        System.out.println("===========");
    }

    //using getter setter we can also call convert the object address into string because it always return a direct value.
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}