import java.util.HashMap;


public class Hashmapmain {

    public static void main(String[] args) {

        HashMap<String,String> countries= new HashMap<String,String>();

        //HashMap is similar to arraylist, but with key-value pair like eg (name,email)

        //need to use full names Integer,String, Double, Boolean

        countries.put("IND","INDIA");
        countries.put("AUS","AUSTRALIA");
        countries.put("UK","ENGLAND");       //to add key paired value to the HashMap
        System.out.println(countries);
        countries.remove("UK");               //to remove key value and it's object
        System.out.println(countries.get("IND")); // to get value using key
        // countries.clear();                  //to remove all values in HashMap
        System.out.println(countries.size());   //to know the size of HashMap
        System.out.println(countries.containsKey("IND")); //to check whether key is present in HashMap true or false only
        System.out.println(countries.containsValue("INDIA"));  //to check value is present or not -> true or false
        System.out.println(countries.containsValue("UK"));  //to check value is present or not -> true or false


        // loop to print all key values

        for (String i : countries.keySet()){
            System.out.print(i +"\t"+"= " );
            System.out.println(countries.get(i));
        }
        HashMap<String,Integer> contactinfo= new HashMap<String,Integer>();
        contactinfo.put("Kiran",9100);
        contactinfo.put("Manoj",8100);
        System.out.println(contactinfo);

        for (String i : contactinfo.keySet()){
            System.out.print(i +"\t"+"= " );
            System.out.println(contactinfo.get(i));
        }
    }
}
