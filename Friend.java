public class Friend {

    String name;
    static int numberoffriends;
    Friend(String name){
        this.name=name;
        numberoffriends++;

    }
    static void displaynoofriends(){
        System.out.println("number of friends is "+ numberoffriends);
    }
    
}
