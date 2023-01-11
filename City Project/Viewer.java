import javax.swing.JFrame;
import java.awt.*;

/**
 * Class that contains the main method for the program and creates the frame containing the component.
 * 
 * @author gcschmit
 * @version 18 July 2014
 */
public class Viewer{
    public static void main(String[] args) throws InterruptedException{
        // create and configure the frame (window) for the program
        JFrame frame = new JFrame();

        frame.setSize(400 /* x */, 300 /* y */);
        frame.setTitle("Cityscape");
        frame.setBackground(Color.red);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // a frame contains a single component; create the Cityscape component and add it to the frame
        Cityscape city = new Cityscape();
        frame.add(city);
        frame.setVisible(true);

        // animate the cityscape
        while(true){
            city.nextFrame();
            Thread.sleep( 100 );
        }
    }
}