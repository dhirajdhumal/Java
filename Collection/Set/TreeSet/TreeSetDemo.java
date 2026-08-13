package Set.TreeSet;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        //it is used to sort the data.
        //it cannot contains null value either one value or more value.
        // TreeSet<Integer> has = new TreeSet<>();
        // has.add(12);
        // has.add(24);
        // has.add(54);
        // has.add(47);
        // has.add(12);
        // has.add(87);

        TreeSet<String> has = new TreeSet<>();
        has.add("Suyash");
        has.add("Adesh");
        has.add("Jay");
        has.add("Dhiraj");
        has.add("Vedant");
        has.add("Vivek");

        System.out.println(has);
    }
}
