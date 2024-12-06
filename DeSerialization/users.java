package DeSerialization;

import java.io.Serializable;
import java.io.*;

public class users implements Serializable {
    String name;
    String password;

    public void sayHello(){
        System.out.println("Hey "+ name+" "+ password );
    }
}
