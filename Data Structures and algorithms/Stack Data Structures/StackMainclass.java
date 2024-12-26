package datastructures.Stack;

import java.util.Stack;

public class StackMainclass {
    public static void main(String[] args) {

        Stack<String> stack= new Stack<String>();

        stack.push("apple");
        stack.push("mango");
        stack.push("orange");
        stack.push("pineapple");

        System.out.println(stack.peek());    //to print last added item

        String removelastitem=stack.pop();   //to remove last added item from stack
        System.out.println(removelastitem);


        System.out.println(stack.search("orange"));   //to check item in the stack position
        System.out.println(stack.search("berry"));  //if any item is not present in stack it will give -1
        System.out.println(stack.empty()); //to check stack is empty or not

        System.out.println(stack);   //to print stack list

    }
}
