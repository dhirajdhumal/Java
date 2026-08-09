
import java.util.ArrayList;



class Demo{
    public static void main(String[] args) {
        Integer x = 100;
        Integer y = 200;

        int a = 300;
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(x);
        arr.add(y);
        arr.add(a);

        System.out.println(arr); //it return [100,200,300]

    }
}