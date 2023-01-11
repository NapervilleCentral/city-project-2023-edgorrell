import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class Cityscape extends JComponent{
    // define the objects in your Cityscape as instance variables
    // ...

    
    // define the Cityscape contructor and intiailize all instance variables
    // ...

    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     * 
     * @param g a reference to the Graphics object used for all drawing operations
     *
     */
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
    }
    public void nextFrame(){
        
    }
}