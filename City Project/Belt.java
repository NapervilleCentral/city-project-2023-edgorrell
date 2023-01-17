import java.io.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.imageio.*;
import java.awt.image.*;

// image stats
// start 16,143, end 49,175, total size 33,34
// buffer: 30 between 
public class Belt extends JComponent implements Runnable{
    public Image sprite;
    public int x, y, tick;
    public char dir;
    public boolean end;
    
    public Belt(int x, int y, boolean end) throws IOException{
        this.sprite = ImageIO.read(new File("sprites/transport-belt/transport-belt.png"));
        this.tick = 0;
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
        if(end){
            
        } else {
            frame.drawImage(this.sprite,x,y,x+33,x+34,16+63*this.tick,143,49+63*this.tick,175,null);
        }
    }
    public void run(){
        while(true){
            this.tick++;
            this.tick %= 16;
            try{
                Thread.sleep(34);
            } catch(Exception e){}
        }
    }
}