package FileClass;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileClassMain {

    public static void main(String[] args) {

        File file1=new File("C:\\Users\\a921731\\Desktop\\JAVA files\\firstProject\\src\\A_brocode_practice code and comments.txt");

        // checking for file path and exists
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

        // create new file with txt format

        try{
            FileWriter writer1=new FileWriter("poem.txt");
            writer1.write("Roses are red\nviolets are blue");
            writer1.append("\nThis is the end");
            writer1.close();

        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

}
