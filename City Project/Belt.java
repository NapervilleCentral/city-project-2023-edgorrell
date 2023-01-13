import java.awt.*;
import java.util.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class Belt extends JComponent implements Runnable{
    public Image image;
    public int x, y;
    public char dir;
    public boolean end;
    
    public Belt(int x, int y, char dir, boolean end){
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.end = end;
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
    public void run(){
        
    }
}