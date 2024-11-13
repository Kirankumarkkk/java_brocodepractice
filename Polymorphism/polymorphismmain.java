package polymorphismjava;

public class polymorphismmain {

    public static void main(String[] args) {

        polymorphismcar car1=new polymorphismcar();
        polymorphismbycyle bycycle1=new polymorphismbycyle();

        polymorphismvehicle[] vehicle1={car1,bycycle1};

        for (polymorphismvehicle x : vehicle1){
            x.go();
        }
    }
}
