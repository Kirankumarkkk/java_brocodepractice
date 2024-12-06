package Serialization;
import java.io.*;

public class serializationMain {
    public static void main(String[] args) throws IOException {

        users user=new users();
        user.name="kiran";
        user.password="1234";

        //user1.sayHello();

        FileOutputStream fileOut= new FileOutputStream("C:\\Users\\a921731\\Desktop\\JAVA files\\firstProject\\userinfo.ser");
        ObjectOutputStream out=new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("Object saved!");

    }
}
