package Practice.PreDefineInterface.Consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class DisplayArrayList {
    public static void main(String[] args) {
        Consumer<ArrayList<Integer>> a = (i)->{
            for(int j : i){
                if(j % 2 == 0){
                    System.out.println(j);
                }
            }
        };
        ArrayList numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        a.accept(numbers);
    }
}
