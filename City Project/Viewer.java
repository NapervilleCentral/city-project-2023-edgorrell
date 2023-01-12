import javax.swing.JFrame;
import java.awt.*;

public class Viewer{
    public static void main(String[] args) throws InterruptedException{
        JFrame frame = new JFrame();

        frame.setSize(Factorio.APPLET_WIDTH, Factorio.APPLET_HEIGHT);
        frame.setTitle("Factorio");
        frame.setBackground(Color.red);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Factorio city = new Factorio();
        frame.add(city);
        frame.setVisible(true);
        
        while(true){
            //city.nextFrame();
            System.out.println(frame.getWidth() + "," + frame.getHeight());
            Thread.sleep(17); // approx 30fps
        }
    }
}