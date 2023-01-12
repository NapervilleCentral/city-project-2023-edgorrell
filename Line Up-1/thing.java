import java.awt.*;
import java.util.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class thing extends JComponent implements Runnable{
    private Color color;
    private int x,y,w,h;
    private int xplus = 1, yplus = 1;

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
    public void draw (Graphics2D page){ // actually draw stuff here
        page.setColor(color);
        page.fillOval(x,y,w,h);
    }
    
    public void run(){
        int frame = 0;
        while(true){
            if(frame % 2 == 0){
                x += xplus;
                y += yplus;
            }
            frame++;
            try{
                Thread.sleep(17);
            } catch (Exception e){}
        }
    }
}
