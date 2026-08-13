package Set.HashSet;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String [] args) {
        HashSet<Integer> has = new HashSet<>();
        has.add(12);
        has.add(24);
        has.add(54);
        has.add(47);
        has.add(12);
        has.add(87);
        has.add(null);
        has.add(null);

        System.out.println(has);// here insertion order not matters.
    }
}
