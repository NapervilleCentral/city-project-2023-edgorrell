import java.awt.*;
import java.util.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class thing extends JComponent implements Runnable{
    private Color color;
    private int x,y,w,h;

    public thing(){
        x = 0;
        y = 0;
        w = 50;
        h = 50;
        color = new Color(100,100,100);
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
        frame.setColor(new Color(0,0,0));
        frame.fillRect(0,0,50,50);
    }
    
    public void run(){ // change stuff between frames here

    }
}
