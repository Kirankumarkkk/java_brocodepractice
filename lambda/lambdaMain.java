package lambdapackage;

public class lambdaMain {
    public static void main(String[] args) {

        String name="bro";
        char symbol='!';
        String name1="again";

        myinterface myinterface1=(x,y,z) -> {
            System.out.println("hey "+x+y+z);
        };

        myinterface myinterface2=(x,y,z) -> System.out.println("hey dude "+x+y+z);

        myinterface1.message(name,symbol,name1);
        myinterface2.message(name,symbol,name1);

    }
}
