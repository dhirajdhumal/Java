package Set.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> has = new LinkedHashSet<>();
        has.add(12);
        has.add(24);
        has.add(54);
        has.add(47);
        has.add(12);
        has.add(87);
        has.add(null);
        has.add(null);

        System.out.println(has);//here insertion order matters
    }
}
