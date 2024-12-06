package Generics;

import java.util.ArrayList;

public class genericsMain {
    public static void main(String[] args) {
        myGenericsclass<String,Character> mygenericclassString= new myGenericsclass<>("String",'$');
        myGenericsclass<Integer,Integer> mygenericclassInteger= new myGenericsclass<>(1,2);
        myGenericsclass<Double,Double> mygenericclassDouble= new myGenericsclass<>(5.5,3.3);
        myGenericsclass<Character,Character> mygenericclassChar= new myGenericsclass<>('$','@');

        System.out.println(mygenericclassString.getValue());
        System.out.println(mygenericclassInteger.getValue());
        System.out.println(mygenericclassDouble.getValue());
        System.out.println(mygenericclassChar.getValue());

        ArrayList<String> myfriends= new ArrayList<>();
        myfriends.add("Kiran");
        myfriends.add("Kumar");
        System.out.println(myfriends);
        System.out.println(myfriends.getFirst());

    }
}
