public class methodChaining {
    public static void main(String[] args) {

        //method chaining = a common syntax for invoking multiple method calls in oop condense code into less lines

        String name="    hello ";
        name=name.concat("bro");
        String nameupper=name.toUpperCase();   //to make uppercase
        String namewithoutspace=name.trim();   //to remove spaces
        String combineallmethods=name.concat(" kiran").toUpperCase().trim(); //combine all methods

        System.out.println(name);
        System.out.println(nameupper);
        System.out.println(namewithoutspace);
        System.out.println(combineallmethods);


    }
}
