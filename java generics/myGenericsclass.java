package Generics;

public class myGenericsclass<Thing> {
    Thing x;
    myGenericsclass(Thing x){
    this.x=x;
    }
    public Thing getValue(){
        return x;
    }
}
