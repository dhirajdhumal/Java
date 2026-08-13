package List.LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(13);
        list.add(87);
        list.add(12);

        System.out.println(list);
    }
}
