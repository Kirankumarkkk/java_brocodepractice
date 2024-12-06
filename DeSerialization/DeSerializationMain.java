package DeSerialization;
import java.io.*;
import Serialization.users;
import Serialization.serializationMain;

public class DeSerializationMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        users user=null;
        FileInputStream fileIn=new FileInputStream("C:\\Users\\a921731\\Desktop\\JAVA files\\firstProject\\src\\DeSerialization\\userinfo.ser");
        ObjectInputStream in=new ObjectInputStream(fileIn);
        //objectName=(Class) in.readObject();
        user = (users) in.readObject();
        in.close();
        fileIn.close();

        //System.out.println(user.name);
        //System.out.println(user.password);


        user.sayHello();

    }
}
