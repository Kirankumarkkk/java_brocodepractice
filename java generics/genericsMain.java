package Generics;

public class genericsMain {
    public static void main(String[] args) {
        myGenericsclass mygenericclassString= new myGenericsclass("String");
        myGenericsclass mygenericclassInteger= new myGenericsclass(1);
        myGenericsclass mygenericclassDouble= new myGenericsclass(5.5);
        myGenericsclass mygenericclassChar= new myGenericsclass('$');

        System.out.println(mygenericclassString.getValue());
        System.out.println(mygenericclassInteger.getValue());
        System.out.println(mygenericclassDouble.getValue());
        System.out.println(mygenericclassChar.getValue());

    }
}
