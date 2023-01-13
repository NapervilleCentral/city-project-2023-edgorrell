import javax.swing.JFrame;
import java.awt.*;

public class Viewer{
    public static void main(String[] args) throws InterruptedException{
        JFrame frame = new JFrame();

        frame.setSize(Factory.APPLET_WIDTH, Factory.APPLET_HEIGHT);
        frame.setTitle("Factorio");
        frame.setBackground(Color.red);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Factory factory = new Factory();
        frame.add(factory);
        frame.setVisible(true);
        
        while(true){
            factory.nextFrame();
            Thread.sleep(17); // approx 30fps
        }
    }
}