import java.util.Random;

public class newdiceroller {

    Random random;
    int number;

    newdiceroller(){
        random=new Random();
        roll();
    }

    void roll(){
        number=random.nextInt(6)+1;
        System.out.println(number);
    }
    
}

