package datastructures.priorityqueue;


import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityqueuemain {
    public static void main(String[] args) {

        //for string or double it will work low to high
        Queue<Double> queue1=new PriorityQueue<>();

        queue1.offer(2.0);
        queue1.offer(3.0);
        queue1.offer(5.0);
        queue1.offer(1.0);

        while (!queue1.isEmpty()){
            System.out.println(queue1.poll());     //remove last element
        }

        Queue<String> queue2=new PriorityQueue<>(Collections.reverseOrder());
        //for string or double it will work high to low

        queue2.offer("B");
        queue2.offer("D");
        queue2.offer("C");
        queue2.offer("A");

        while (!queue2.isEmpty()){
            System.out.println(queue2.poll());
        }
    }
}
