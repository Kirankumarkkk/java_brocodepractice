package exceptionHandling;

import java.util.Scanner;

public class exceptionHandlingMain {
    public static void main(String[] args) {
        Scanner scanner1=new Scanner(System.in);

        try {
            System.out.println("Enter a number to divide: ");
            int x = scanner1.nextInt();
            System.out.println("Enter a number to divide by: ");
            int y = scanner1.nextInt();
            int z = x / y;
            System.out.println("z value is " + z);
        }
        catch(Exception e){
            System.out.println("We can divide by zero");
        }

        finally {
            scanner1.close();
            System.out.println("this will print always");
        }
    }
}
