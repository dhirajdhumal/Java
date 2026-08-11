
public class Employee {

    private int id;
    private String name;
    private String address;
    private double salary;
    private String dep;
    private String gender;

    public Employee(String address, String dep, String gender, int id, String name, double salary) {
        this.address = address;
        this.dep = dep;
        this.gender = gender;
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + ", dep=" + dep
                + ", gender=" + gender + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
