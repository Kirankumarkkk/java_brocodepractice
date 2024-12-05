public class genericsMain {
    public static void main(String[] args) {

        Integer[] intArray={1,2,3,4};
        Double[] doubleArray={1.1,2.2,3.3,4.4};
        String[] strArray={"A","B","C","D"};
        Character[] charArry={'!','@','$','&'};
        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(strArray);
        displayArray(charArry);
        System.out.println(getFirstArry(strArray));
        System.out.println(getFirstArry(charArry));


    }
    //method to display array for all data types
    public static<Thing> void displayArray(Thing[] arrayeach) {
        for (Thing x : arrayeach) {
            System.out.print(x + " ");
        }
        System.out.println();

    }

    //method to return array[0] first value for all data types

    public static<Thing> Thing getFirstArry(Thing[] array){
        return array[0];
    }
}
