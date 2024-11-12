public class oppclass {
    public static void main(String[] args) {
        System.out.println("Start OOP - object oriented programming");

        //object = instance of a class that contains attributes and methods
        //eg: { phone, desk, coffee
        //calling class to get details in a object and calling method with object
        carsoppclass mycar=new carsoppclass();
        System.out.println(mycar.carname);
        System.out.println(mycar.year);

        mycar.drive();
        mycar.brake();

        carsoppclassnew mycar1=new carsoppclassnew();
        System.out.println(mycar1.carname1);
        System.out.println(mycar1.color1);

        mycar1.drive1();
        mycar1.brake1();

        System.out.println("hello oppclass");

        newgarage newgarage1=new newgarage();

        newcars newcarename=new newcars("Audi");

        newgarage1.carnamemethod(newcarename);




    }
}

