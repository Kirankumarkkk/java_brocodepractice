public class humanconstructor {

    String name;
    int age;
    double weight;
    
    humanconstructor(String name, int age, double weight){

        this.name=name;
        this.age=age;
        this.weight=weight;

    }

    void eat(){
        System.out.println(this.name + " is eating");
    }

    void age(){
        System.out.println(this.age + " -> age");
    }
}
