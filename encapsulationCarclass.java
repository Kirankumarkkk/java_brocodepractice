package encapsulationpackage;

public class encapsulationCarclass {
    private String name;
    private int year;
    encapsulationCarclass(String name,int year){
        this.setName(name);
        this.setYear(year);
    }
    public String getName(){
        return name;
    }
    public int getYear(){
        return year;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setYear(int year){
        this.year=year;
    }
}
