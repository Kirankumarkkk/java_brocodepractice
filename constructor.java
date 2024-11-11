public class constructor {

public static void main(String[] args) {

    //oops calling oppclassname class

    oppclassname classnameoop1=new oppclassname();

    System.out.println(classnameoop1.car);
    
    classnameoop1.drive();
    
    classnameoop1.stop();
    
    //constuctor = called when a object is instantiated ( created )

    // below is constructor calling another class name humanconstructor

    humanconstructor human1= new humanconstructor("kiran",28, 70);
    humanconstructor human2= new humanconstructor("manoj",29, 50);


    System.out.println(human1.name);
    System.out.println(human2.name);

    human1.eat();
    human2.eat();

    human1.age();
    human2.age();


    //variables scope 

    //local variables = variables present inside a method is local variables
    //global variables = variables present outside a method is global variables

    //local variables passing value as params newdicerollerlocal variable class

    newdicerollerlocal newdicerollerlocal=new newdicerollerlocal();

    //calling newdiceroller class global variable class

    newdiceroller dicenewroller=new newdiceroller();

    //java overloaded constructors

    newpizza newpizza=new newpizza("bread1");

    System.out.println(newpizza.bread);

    System.out.println(newpizza.sauce);

    newpizza newpizza2=new newpizza("bread2","sauce2");

    System.out.println(newpizza2.bread);

    System.out.println(newpizza2.sauce);

    //toString method to call implicitly or explicitly calling newcar class

    newcar newcar1=new newcar();

    //toString to call explicitly

    System.out.println(newcar1.toString());

    //implicitly toString inherited so no need to use toString

    System.out.println(newcar1);


    //arrays of objects

    foods food1=new foods("bread");
    foods food2=new foods("zam");

    foods[] fridge={food1,food2};

    System.out.println(fridge[0].name);
    System.out.println(fridge[1].name);





}    
}
