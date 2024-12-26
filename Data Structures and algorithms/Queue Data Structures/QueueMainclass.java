package datastructures.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMainclass {
    public static void main(String[] args) {

        Queue<String> queue=new LinkedList<String>();

        queue.offer("apple");  //add to the queue
        queue.offer("mango");
        queue.offer("orange");
        System.out.println(queue);
        String removeitem=queue.poll(); //remove first item from the queue
        System.out.println(removeitem);
        System.out.println(queue);
        System.out.println(queue.peek());  //to see first item from the queue
        System.out.println(queue.isEmpty()); //to check queue is empty or not
        System.out.println(queue.size()); //to check the size of queue
        System.out.println(queue.contains("orange"));  //to check whether item present in queue or not true or false
    }
}
