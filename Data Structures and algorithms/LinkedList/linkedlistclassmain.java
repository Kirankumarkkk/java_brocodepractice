package datastructures.Linkedlist;

import java.util.LinkedList;

public class linkedlistclassmain {
    public static void main(String[] args) {

        LinkedList<String> linkedList1=new LinkedList<>();

        linkedList1.offer("A");
        linkedList1.offer("B");
        linkedList1.offer("C");
        linkedList1.offer("D");
        linkedList1.offer("E");

        linkedList1.add(5,"F");    //add element to the list
        linkedList1.remove("F");   //remove element to the list
        //linkedlist1.poll() ;   //remove the last element from the list
        //linkedList1.push("G"); push will stack the list one by one , offer work better

        System.out.println(linkedList1.peekFirst());  //to see first element from the list
        System.out.println(linkedList1.peekLast());  //to see last element from the list

        linkedList1.addFirst("Z");     //add a element first to the list
        linkedList1.addLast("Y");       //add a element last to the list

        String firstremoved=linkedList1.removeFirst();      //storing removed value into a string
        String lastremoved=linkedList1.removeLast();

        System.out.println(firstremoved);
        System.out.println(lastremoved);

        System.out.println(linkedList1);
        System.out.println(linkedList1.indexOf("E"));


    }
}
