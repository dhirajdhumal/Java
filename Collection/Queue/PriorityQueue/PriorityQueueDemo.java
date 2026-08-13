package Queue.PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        //it return priority element which is least or lower element.
        PriorityQueue<Integer> pri = new PriorityQueue<>();
        pri.add(10);
        pri.add(13);
        pri.add(14);
        pri.add(16);
        pri.add(13);

        System.out.println(pri);
    }
}
