package Practise.Collections;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        //using for loop
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        //using for each loop or inhanced for loop
        for(Integer i:list){
            System.out.println(i);
        }
    }
}
