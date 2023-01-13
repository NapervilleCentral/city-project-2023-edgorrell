import javax.swing.JFrame;
import java.awt.*;

/**
 * Class that contains the main method for the program and creates the frame containing the component.
 * 
 * @author gcschmit
 * @version 18 July 2014
 */
public class CityscapeViewer{
    public static void main(String[] args) throws InterruptedException{
        JFrame frame = new JFrame();

        frame.setSize(400 /* x */, 300 /* y */);
        frame.setTitle("Cityscape");
        frame.setBackground(Color.red);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        LineUp row = new LineUp();
        frame.add(row);

        frame.setVisible(true);
        while(true){
            row.nextFrame();
            Thread.sleep(17); // approx 30fps
        }
    }
}
