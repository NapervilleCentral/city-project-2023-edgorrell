import java.awt.*;
import java.util.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class Ground extends JComponent implements Runnable{
    Image sprite;
    public Ground(){
        //sprite = file thing
    }
    public void nextFrame(){
        repaint();
    }
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        draw(g2);
    }
    public void draw (Graphics2D frame){ // actually draw stuff here
        
    }
    public void run(){}
}
