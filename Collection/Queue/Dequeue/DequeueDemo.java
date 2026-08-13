package Queue.Dequeue;

import java.util.ArrayDeque;

public class DequeueDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> pri = new ArrayDeque<>();
        pri.add(10);
        pri.add(13);
        pri.add(14);
        pri.add(16);
        pri.add(13);

        System.out.println(pri.peekFirst());//it return first element
        System.out.println(pri.peekLast());//it return last element
        System.out.println(pri.peek());//it return first element
        System.out.println(pri.pop());//it return first element and remove it from the queue
        System.out.println(pri);

        System.out.println(pri.pollFirst());//it return first element and remove it from the queue
        System.out.println(pri.pollLast());//it return last element and remove it from the queue
        System.out.println(pri);
        System.out.println(pri.poll());//it return first element and remove it from the queue
    }

    
}    