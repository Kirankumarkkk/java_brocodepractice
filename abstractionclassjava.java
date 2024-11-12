public class abstractionclassjava {
    public static void main(String[] args) {

        // since vehicle class is abstract class , it cannot instantiated - new object cannot create
        // public abstract class classname for class
        // abstract void methodname()
        // in the parent class abstract method , we cannot add action, we need to add in child class

        //abstractionclassvehicle abstractionclassvehicle=new abstractionclassvehicle() ;


        abstractionclasscar abstractionclasscar=new abstractionclasscar();

        abstractionclasscar.go();
        abstractionclasscar.stop();
    }
}
