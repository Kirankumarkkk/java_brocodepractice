package FileClass;

import java.io.IOException;

public class FileWriter {
    public static void main(String[] args) {

        try{
            java.io.FileWriter writer1=new java.io.FileWriter("poem.txt");
            writer1.write("Roses are red\nviolets are blue");
            writer1.append("\nThis is the end file");
            writer1.close();

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
