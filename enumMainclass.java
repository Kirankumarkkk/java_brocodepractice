//Enum -enumerated(ordered listing of items in a collection )
//grouping of constants that behave similarly to objects

enum Planet{
    EARTH(1),
    MARS(2),
    SUN(3);

    int number;
    Planet(int number){
        this.number=number;
    }

}

public class enumMainclass {
    public static void main(String[] args) {

        Planet myplant=Planet.SUN;
        canilivehere(myplant);
    }

    static void canilivehere(Planet myplant){
        switch (myplant){
            case EARTH:
                System.out.println("you can live here");
                System.out.println("this planet #"+myplant.number);
                break;
            default:
                System.out.println("you can't live here");
                System.out.println("this planet #"+myplant.number);
        }
    }
}
