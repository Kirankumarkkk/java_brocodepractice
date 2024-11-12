public class powersuperkeyword extends  personsuperkeyword{
    String power;
    powersuperkeyword(String name,int age,String power){
        super(name,age);
        this.power=power;

    }
    public String toString(){
        return super.toString()+this.power;
    }
}
