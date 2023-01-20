import java.io.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.imageio.*;
import java.awt.image.*;

public class CarBecauseItsACity extends JComponent implements Runnable{
    BufferedImage car, mask, coloredMask;
    Color color;
    int x, y;
    boolean isDriving;
    public CarBecauseItsACity(){
        try {
            this.car = ImageIO.read(new File("sprites/car/car.png"));
            this.mask = ImageIO.read(new File("sprite/car/car-mask.png"));
        } catch(Exception e){}
        this.x = 600;
        this.y = 20;
    }
    public Color newColor(){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(0); nums.add(0); nums.add(64);
        Collections.shuffle(nums);
        Color color = new Color((int)(128*Math.random())+nums.get(0),
                                (int)(128*Math.random())+nums.get(1),
                                (int)(128*Math.random())+nums.get(2));
        return color;
    }
    public void paintMask(){
        for(int x = 0; x < 0; x++){
            for(int y = 0; y < 0; y++){
                
            }
        }
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
        if(!isDriving){return;}
        if(isDriving && this.x == 600){
            this.color = newColor();
            paintMask();
        }
        if(isDriving && this.x < -90){
            this.isDriving = false;
            this.x = 600;
        }
        this.x += 2;
        frame.drawImage(this.car,x,y,null);
        try{
            frame.drawImage(this.coloredMask,x,y,null);
        } catch(Exception e){}
    }
    public void run(){
        try{
            Thread.sleep((long)(3000*Math.random()+3000));
        } catch(Exception e){}
        if(!isDriving){this.isDriving = true;}
    }
}