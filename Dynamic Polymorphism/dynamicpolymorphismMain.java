package polymorphismjava;

import java.util.Scanner;

public class dynamicpolymorphismMain {
    public static void main(String[] args) {
        Scanner scanner1=new Scanner(System.in);
        dynamicpolymorphismAnimal Animal;

        System.out.println("what animal do you want?");
        System.out.println("1=cat and 2=dog");
        int choice=scanner1.nextInt();

        if (choice==1){
            Animal= new dynamicpolymorphismCat();
            Animal.speak();
        } else if (choice==2) {
            Animal=new dynamicpolymorphismDog();
            Animal.speak();

        }
        else {
            Animal=new dynamicpolymorphismAnimal();
            Animal.speak();
        }


    }
}
