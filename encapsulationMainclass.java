package encapsulationpackage;

public class encapsulationMainclass {
    public static void main(String[] args) {

        encapsulationCarclass encapsulationcar=new encapsulationCarclass("BMW",2024);
        System.out.println(encapsulationcar.getName());
        System.out.println(encapsulationcar.getYear());

        encapsulationcar.setName("Audi");
        System.out.println(encapsulationcar.getName());

        encapsulationcar.setYear(2025);
        System.out.println(encapsulationcar.getYear());

        encapsulationCarclass encapsulationcar1=new encapsulationCarclass("FORD",2024);
        encapsulationCarclass encapsulationcar2=new encapsulationCarclass(encapsulationcar1);

        System.out.println(encapsulationcar1);
        System.out.println(encapsulationcar2);
        System.out.println();
        System.out.println(encapsulationcar1.getName());
        System.out.println(encapsulationcar1.getYear());
        System.out.println();
        System.out.println(encapsulationcar2.getName());
        System.out.println(encapsulationcar2.getYear());

    }
}
