package Practice.GenericInterface;

import java.util.ArrayList;
import java.util.Arrays;

public interface DataProcessor<T, R> {
    R ShowData(T t);
    
    public static void main(String[] args) {
        DataProcessor<ArrayList<Integer>, Integer> a = (li)->{
            int sum = 0;
            for(int i : li){
                sum += i;
            }
            return sum;
        };
        ArrayList numbers = new ArrayList<>(Arrays.asList(50,20,30));
        int ans = a.ShowData(numbers);
        System.out.println(ans);

        DataProcessor<ArrayList<String>, Integer> a1 = (li)->{
            int count = 0;
            for(String s : li){
                count += s.length();
            }
            return count;
        };
        ArrayList name = new ArrayList<>(Arrays.asList("DHiraj","Jay","a"));
        int ans1 = a1.ShowData(name);
        System.out.println(ans1);
    }
}