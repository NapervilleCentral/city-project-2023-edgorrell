import java.io.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.imageio.*;
import java.awt.image.*;

public class CarBecauseItsACity extends JComponent implements Runnable{
    BufferedImage car, mask, paintedMask, shadow;
    int x, y = 20;
    boolean isDriving;
    public CarBecauseItsACity() throws IOException{
        this.car = ImageIO.read(new File("sprites/car/car.png"));
        this.mask = ImageIO.read(new File("sprites/car/car-mask.png"));
        this.paintedMask = paintMask();
        this.shadow = ImageIO.read(new File("sprites/car/car-shadow.png"));
        this.x = 600;
        this.y = 20;
        
        for(int x = 0; x < this.shadow.getWidth(); x++){
            for(int y = 0; y < this.shadow.getHeight(); y++){
                if(new Color(shadow.getRGB(x,y),true).equals(new Color(0,0,0))){
                    this.shadow.setRGB(x,y,new Color(0,0,0,127).getRGB());
                }
            }
        }
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
    public BufferedImage paintMask(){
        Color color = newColor();
        Color temp;
        int num;
        BufferedImage img = new BufferedImage(this.mask.getWidth(),this.mask.getHeight(),this.mask.getType());
        
        for(int x = 0; x < this.mask.getWidth(); x++){
            for(int y = 0; y < this.mask.getHeight(); y++){
                if(new Color(mask.getRGB(x,y),true).equals(new Color(mask.getRGB(0,0),true))){
                    continue;
                } else {
                    num = new Color(mask.getRGB(x,y)).getRed();
                    temp = new Color(
                        (int)((num/255.0)*color.getRed())+32,
                        (int)((num/255.0)*color.getGreen())+32,
                        (int)((num/255.0)*color.getBlue())+32
                    );
                    img.setRGB(x,y,temp.getRGB());
                }
            }
        }
        return img;
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
        frame.drawImage(this.shadow,this.x+2,this.y+11,null);
        frame.drawImage(this.car,this.x,this.y,null);
        frame.drawImage(this.paintedMask,this.x,this.y,null);
    }
    public void run(){
        while(true){
            this.x -= 3;
            if(this.x < -90){
                this.paintedMask = paintMask();
                this.x = 600;
                try{
                    Thread.sleep((int)(6000*Math.random()));
                } catch(Exception e){}
            }
            try{
                Thread.sleep(17);
            } catch(Exception e){}
        }
    }
}