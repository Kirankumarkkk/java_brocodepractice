package Generics;

public class myGenericsclass<Thing, Thing2> {
    Thing x;
    Thing2 y;
    myGenericsclass(Thing x, Thing2 y){
    this.x=x;
    this.y=y;
    }
    public Thing2 getValue(){
        return y;
    }
}
