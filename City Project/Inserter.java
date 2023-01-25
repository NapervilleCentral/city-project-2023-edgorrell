import java.io.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.imageio.*;
import java.awt.image.*;

public class Inserter extends JComponent implements Runnable{
    BufferedImage sprite, arm, item;
    int x,y,angle;
    boolean turnDirection;
    
    public Inserter(){}
    public Inserter(int x, int y){
    
    }
    public BufferedImage rotate(BufferedImage image, double theta){
        BufferedImage result = new BufferedImage(100,100, image.getType());
        
        return result;
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
        while(true){
            if(this.item != null && this.angle == 0){
                this.turnDirection = Math.random() < 0.5;
            }
        }
    }
}