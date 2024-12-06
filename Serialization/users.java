package Serialization;

import java.io.Serializable;

public class users implements Serializable {
    String name;
    String password;

    public void sayHello(){
        System.out.println("Hey "+ name+" "+ password );
    }
}
