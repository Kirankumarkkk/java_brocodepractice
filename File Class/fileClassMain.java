package FileClass;

import java.io.File;

public class fileClassMain {

    public static void main(String[] args) {

        File file1=new File("C:\\Users\\a921731\\Desktop\\JAVA files\\firstProject\\src\\A_brocode_practice code and comments.txt");

        if(file1.exists()){

            System.out.println("File present");
            System.out.println(file1.getPath());
            System.out.println(file1.getAbsolutePath());
            System.out.println(file1.isFile());
            //file1.delete();
            //above code will delete the file
        }
        else {
            System.out.println("File doesn't exist");
        }
    }

}
