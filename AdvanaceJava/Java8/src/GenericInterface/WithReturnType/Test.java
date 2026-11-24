package GenericInterface.WithReturnType;

import java.util.Arrays;
public interface Test<T, U, R> {
    //T - First Parameter type of data
    //U - Second Parameter type of data
    //R - Return type of Parameter
    // we need to just add 3rd Parameter of return Type

    R display(T a, U b);
    public static void main(String[] args) {
        //Here we need to write Return type at the last or 3rd.
        Test<Integer, String, String> t = (a,b)->{
            return "Dhiraj";
        };
        String name = t.display(20, "Jay");
        System.out.println(name);

        Test<Integer, String, String> t1 = (a,b)->{
            return b;
        };
        String ans = t1.display(20, "Dhiraj");
        System.out.println(ans);

        Test<int[], int[], int[]> t2 = (a,b)->{
            return a;
        };
        int[] arr = t2.display(new int[] {2,4,6}, new int[] {32,56,87});
        System.out.println(Arrays.toString(arr));

        Test<int[], String[], String[]> t3 = (a,b)->{
            return b;
        };
        String[] str = t3.display(new int[] {10,20,30}, new String[] {"Dhiraj", "Jay", "Adesh", "Kausalya"});
        System.out.println(Arrays.toString(str));
    }
}
