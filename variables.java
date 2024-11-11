import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
public class variables {
    public static void main(String[] args) {
        int a=1;
        char character='C';
        boolean right=true;
        double double1=2.30;
        System.err.println(double1);
        System.err.println(right);

        //dont use these wrapper it's slow
        Integer b=1;
        Character character1='C';
        Boolean right1=true;
        Double double2=2.31;
        if (b==1){
        System.out.println(character1);
        }

        //Arraylist

        ArrayList<String> food= new ArrayList<String>();
        food.add("hello");
        food.add("hi");
        food.set(0,"kkk");
        food.remove(1);
        food.clear();

        for (int i=0;i<food.size();i++){
            System.out.println(food.get(i));
        }

        ArrayList<Integer> numbers1= new ArrayList<Integer>();
        numbers1.add(1);
        numbers1.add(2);

        System.out.println(numbers1.get(0));

        numbers1.removeLast();

        for (int i=0;i<numbers1.size();i++){
            System.out.println(numbers1.get(i));
        }

        ArrayList bakery= new ArrayList<ArrayList<String>>();

        ArrayList bakery1= new ArrayList<String>();
        bakery1.add("bread");
        bakery1.add("jam");

        ArrayList bakery2= new ArrayList<String>();
        bakery2.add("coffee");
        bakery2.add("milk");

        bakery.add(bakery1);
        bakery.add(bakery2);

        System.out.println(bakery);

        System.out.println(bakery.get(0));

       // System.out.println(bakery.get(0).get(0));



     // Array String

        String[] cars = {"bmw","volvo"};

        System.out.println(Arrays.toString(cars));

    }
    
}
