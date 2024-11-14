package GUIjava;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class myFrame extends JFrame {

        // JFrame = a GUI window to add components to
        myFrame() {
            //JFrame frame = new JFrame(); //creates a frame
            this.setTitle("JFrame title goes here"); //sets title of frame
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit from application
            this.setResizable(false); //prevent frame from being resized
            this.setSize(420, 420); //sets the x-dimension, and y-dimension of frame
            this.setVisible(true); //make frame visible

            ImageIcon image = new ImageIcon("supermariologo.png"); //create an ImageIcon
            this.setIconImage(image.getImage()); //change icon of frame
            this.getContentPane().setBackground(new Color(123, 50, 250)); //change color of background
        }

}
