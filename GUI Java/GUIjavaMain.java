package GUIjava;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GUIjavaMain {
    public static void main(String[] args) {

        // JFrame = a GUI window to add components to

        JFrame frame = new JFrame(); //creates a frame
        frame.setTitle("JFrame title goes here"); //sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit from application
        frame.setResizable(false); //prevent frame from being resized
        frame.setSize(420,420); //sets the x-dimension, and y-dimension of frame
        frame.setVisible(true); //make frame visible

        ImageIcon image = new ImageIcon("supermariologo.png"); //create an ImageIcon
        frame.setIconImage(image.getImage()); //change icon of frame
        frame.getContentPane().setBackground(new Color(123,50,250)); //change color of background

    }
}
