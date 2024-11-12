import java.util.Scanner;
//importing scanner for user provide input
//GUI
import java.util.Random;
// importing Random class to generate numbers and boolean value

import java.util.ArrayList;


public class systemoutprintln {
    public static void main(String args[]) {
        int var1 = 1041;
        int var2 = 1051;
        int var3 = 10/3;
        int var4 = 10%3;
        double var5= 10.0/3.0;
        double var6 = 10.0%3.0;
        System.out.println("test " + var2);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
        System.out.println(var6);
        System.out.println("First line \nSecond line \nThird line");
        System.out.println("A\tB\tC");
        System.out.println("D\tE\tF") ;
        System.out.println("\bG") ;

        String variable1="0";

        int conditionValue = 15;
        if (conditionValue < 10) {
            variable1 = "10";
        } else {
            variable1 = "20";
        }

        // Output the result
        System.out.println("The value of variable1 is: " + variable1);

        int x=1;
        double y=2.1;
        long z=2999992828282L;
        float e=293.2f;
        boolean q=true;
        boolean m =false;
        char symbol='@';
        String testkkk1="testkkk";

        System.out.println("The value of x is: " + x);
        System.out.println("The value of y is: " + y);
        System.out.println("The value of z is: " + z);
        System.out.println("The value of e is: " + e);
        System.out.println("The value of q is: " + q);
        System.out.println("The value of m is: " + m);
        System.out.println("The value of symbol is: " + symbol);
        System.out.println("The value of testkkk1 is: " + testkkk1);


        String word1="water";
        String word2="cooldrink";
        String tempword=null;

        tempword=word1;
        word1=word2;
        word2=tempword;

        System.out.println("The value of word1 is: " + word1);
        System.out.println("The value of word2 is: " + word2);

        //scanner user input information

        /* commenting for scanner code

        Scanner scanner=new Scanner(System.in);

        System.out.println("who are you? ");
        String namepls= scanner.nextLine();

        System.out.println("your age? ");
        int age1=scanner.nextInt();
        scanner.nextLine();

        System.out.println("your fav food? ");
        String food=scanner.nextLine();
        
        System.out.println("Hello " + namepls);
        System.out.println("age " + age1);
        System.out.println("fav food " + food);
          comment end */
        // scanner end

        // arithmetic expressions

        int friends=10;
        friends=10+1;
        int friends1=friends*2;
        int friends2=friends++;

        System.out.println("sum of friends " + friends);
        System.out.println("mul of friends1 " + friends1);
        System.out.println("increment ++ of friends2 " + friends2);

        double friends3= 10/3;
        System.out.println("division of friends3 " + friends3);

        //type casting data type

        double friends4=10;
        friends4= (double) friends4/3 ;

        System.out.println("division of friends4 " + friends4);

        double friends5= (double) 10/3;
        System.out.println("division of friends5 " + friends5);

        //GUI graphical user interface gui accepts only string so we are parseing

        /* gui start comment
        String name_enter=JOptionPane.showInputDialog("Enter the name");
        JOptionPane.showMessageDialog(null,"Hello " + name_enter);

        int age_enter=Integer.parseInt(JOptionPane.showInputDialog("Enter the age"));
        JOptionPane.showMessageDialog(null,"your age " + age_enter);

        Double height_enter=Double.parseDouble(JOptionPane.showInputDialog("Enter the height"));
        JOptionPane.showMessageDialog(null,"your height " + height_enter);

         gui end comment */
        
        // java maths

        double x1=3.243;
        double y1=-10;

        double z1=Math.max(x1,y1);
        System.out.println("max of x1,y1 " + z1);

        double m1=Math.min(x1,y1);
        System.out.println("max of x1,y1 " + m1);

        double n1=Math.round(x1);
        System.out.println("max of x1,y1 " + n1);

        // Math hyptonesis squareroot ((x*x) + (y*y))

        double x2;
        double y2;
        double z2;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter x2 value");
        //x2=scanner.nextDouble();

        System.out.println("Enter y2 value");
        //y2=scanner.nextDouble();

        //z2=Math.sqrt((x2*x2)+(y2*y2));

        //System.out.println("z2 hypotenesis value is" + z2);

        // Random class generate numbers or boolean

        Random random= new Random();

        int x3=random.nextInt();
        System.out.println("x3 random number is " + x3);

        //to limit numbers we are mentioning value not to over come limit

        int y3=random.nextInt(6)+1;
        System.out.println("y3 random number is " + y3);

        boolean z3=random.nextBoolean();
        System.out.println("x3 random number is " + z3);

        // if statements java

        int age1=36;

        if (age1<18) {
            System.out.println("age is 18 for if statement");
        } else if (age1<25) {
            System.out.println("age is not 18 for else if statement");
        }
        else if (age1==35) {
            System.out.println("age is 35 for else if statement");
        }
        else {
            System.out.println("age is more than 25 for else statement");
        }

        // switches - statement used to test equality of a variable with list of values

        String day="monday";

        switch (day){
            case "Sunday" : System.out.println("It's Sunday");
            break;
            case "Monday" : System.out.println("It's Monday");
            break;
            case "Friday" : System.out.println("It's Friday");
            break;
            default: System.out.println("It's not in the list");
        }

        // and or logic conditions

        int temp1=10;

        if (temp1>=10 && temp1>11){
            System.out.println("temperature is less than 10 and greater than 9");
        } else if (temp1>=2 || temp1<=11) {
            System.out.println("temperature is greater than 2");
        }

        // string equal with ||

        String stringvalue1="kiran";
        String stringvalue2="kumar";

        if ((!stringvalue1.equals(stringvalue2)) || (stringvalue2.equals("kumar"))){
            System.out.println("stringvalue1 & stringvalue2 are not equal");

        }

        System.out.println("stringvalue1 "+ stringvalue1);
        System.out.println("stringvalue2 "+ stringvalue2);

        // while loop and do {} while () both works similar way

        Scanner scanner1 = new Scanner(System.in);
        String nameplsenter = "";

        while(nameplsenter.isBlank()) {
            System.out.print("Enter your name: ");
             break;
            //nameplsenter = scanner1.nextLine();
        }

        System.out.println("\n kiran Hello "+nameplsenter);

        // for loop

        for ( int i=1; i<5 ; i++){
            System.out.println("for loop running");

        }

        // nested loops

        Scanner scanner3 = new Scanner(System.in);
        int rows;
        int columns;
        String symbol1 = "";

        System.out.println("Enter # of rows: ");
        //rows = scanner3.nextInt();
        System.out.println("Enter # of columns: ");
        //columns = scanner3.nextInt();
        System.out.println("Enter symbol to use: ");
        //symbol1 = scanner3.next();

        /*
        for(int i=1; i<=rows; i++) {
            System.out.println();
            for(int j=1; j<=columns;j++) {
                System.out.print(symbol1);
            }
        }
        */

        // array is used to store multiple values in a single variable

        // one way
        String[] oldcars={"car1","car2","car3","123"};

        oldcars[0] = "car4";

        System.out.println(oldcars[0]);
        System.out.println(oldcars[3]);

        //another way
        String[] newcars=new String[3];
        newcars[0]="newcar1";
        newcars[1]="newcar2";
        newcars[2]="newcar3";

        System.out.println(newcars[0]);

        for (int carsi=0; carsi<newcars.length ; carsi++){
            System.out.println(newcars[carsi]);

        }

        //2D array multiple arrays in a single variable

        String[][] newbike={{"bike1","bike2","bike3"},
                {"bike4","bike5","bike6"},
                {"bike7","bike8","bike9"}};

        for ( int newbike1=0;newbike1<newbike.length ; newbike1++) {
            System.out.println();
            for(int j=0; j<newbike[newbike1].length; j++) {
                System.out.print(newbike[newbike1][j]+" ");
            }
        }


        //String methods

        String myname="kiran";
        boolean nameis = myname.equals("kiran");
        System.out.println("\n"+  nameis);

        boolean nameis1 = myname.equalsIgnoreCase("Kiran");
        System.out.println(nameis1);

        //length of the string

        int result1=myname.length();
        System.out.println("number of chars " + result1);

        //char placed at 3 index

        char chars1=myname.charAt(3);
        System.out.println("chars1 at 0 is " + chars1);

        //index where char is placed

        int index1=myname.indexOf("i");
        System.out.println("index1 of i is " + index1);

        //upper case string

        String upper1=myname.toUpperCase();
        System.out.println("making upper case  is " + upper1);

        //lower case string

        String lower1=myname.toLowerCase();
        System.out.println("making lower case  is " + lower1);

        boolean value1=myname.isEmpty();
        System.out.println("making value1 case  is " + value1);

        //trim method remove space

        String myname1=" Kiran ";
        System.out.println("making value1 case  is " + value1);
        String myname2=myname1.trim();
        System.out.println("making myname2 case  is " + value1);

        //replace value
        
        String myname3="dog";
        System.out.println("myname3 case  is " + myname3);
        String myname4=myname3.replace("dog","cat");
        System.out.println("making myname4 case  is " + myname4);






        //boolean
        
        boolean result2=true;
        boolean result4=false;

        if(result2) {
            System.out.println("boolean result2 is " + result2);
            boolean result3=true;
            if (result3){
                System.out.println("inside result3 is " + result3);
            }
        }
        if(!result4) {
            System.out.println("boolean result4 is " + result4);
            System.out.println("boolean result is " + (10 > 9));

        }

        // storing different in a variable
        int result5=5;
        System.out.println("boolean result5 is " + result5);
        result5=6;
        System.out.println("boolean result5 is " + result5);


        double value_1,value_2,value_3;
        value_1=0;
        value_2=1;
        value_3=2;

        if (value_1!=value_2){
            System.out.println("value1 is not equal to value value2");
        }

        if (value_1==0){
            System.out.println("value1 is  equal to value 0");

        }

        int xvalue1=3;
        if(xvalue1==3){
            System.out.println("value of x1 before update "+ xvalue1);
            //xvalue1=2;
            int yvalue1=2;
            xvalue1=xvalue1+yvalue1;
            System.out.println("value of x1 after update "+ xvalue1);
        }
        for(xvalue1=0;xvalue1<3;xvalue1++){
            int yvalue2=100;
            System.out.println("value of yvalue2 after update "+ yvalue2);

        }

        int xvalue2=5;
        double yvalue2=xvalue2;
        System.out.println("value of yvalue2 after update "+ xvalue2);
        System.out.println("value of yvalue2 after update "+ yvalue2);

        String[] animalslist={"dog","cat","rabbit"};
        for(String i : animalslist){
            System.out.println(i);
        }

        ArrayList<String> animalslist1=new ArrayList();
        animalslist1.add("dog1");
        animalslist1.add("cat1");
        animalslist1.add("rabbit1");

        for (String i : animalslist1){
            System.out.println(i);
        }

        //java method

        // string and int method passing values to the method
        String name_1="kiran";
        int age_1=26;
        int age_2=24;
        //string method
        hello(name_1,age_1);
        //int method calling using a variable
        int age12=add(age_1,age_2);
        System.out.println("add method value is "+ age12);
        //int method calling without variable
        System.out.println("add method value is another way "+add(age_1,age_2));
        //java overloaded method calling same method but different params
        int age_3=10;
        System.out.println("This is 2nd method with 2 params "+add(age_1,age_2,age_3));
        //java overloaded double method
        double agetotal=add(10.0,10.0);
        System.out.println("double method "+agetotal);

        //printf
        //System.out.printf("to diplay int %10d",10);
        //System.out.printf("to diplay int %-10d",10);
        //System.out.printf("to diplay string %s","kkk");
        //System.out.printf(" to diplay character %s","@");

        //final keyword in java once defined, it cannot be changes

        final double PIvalue=3.14156;
        // PIvalue=2.1; since final keyword used we cannot assign new value
        System.out.println(PIvalue);



    }
    //getting title=name_1=kiran value
    static void hello(String title,int age1){
        System.out.println("hello " + title+" " +age1);
    }
    //getting age_1 and age_2 values and adding
    static int add(int x, int y){
        int z=x+y;
        return z;
    }
    //java overloaded double method
    static double add(double x, double y){
        double z=x+y;
        return z;
    }
    //java overloaded method same method with diff params and values
    static int add(int x, int y,int x1){
        int z=x+y+x1;
        return z;
    }
}
