package methods;

public class Jay {
    //Method with return type and parameters
    int add(int a, int b){
        return a*b;
    }

    double mul(int a){
        return a * 2.36;
    }

    String get(String name){
        return name.toLowerCase();
    }

    public static void main(String[] args) {
        Jay j = new Jay();
        int addition = j.add(20,25);
        System.out.println(addition);

        String myName = j.get("Dhiraj");
        System.out.println(myName);

        double result = j.mul(10);
        System.out.println(result);
    }
}
