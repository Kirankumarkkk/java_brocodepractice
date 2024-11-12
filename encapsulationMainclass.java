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

    }
}
