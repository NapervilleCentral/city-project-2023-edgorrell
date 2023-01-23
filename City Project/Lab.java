import java.io.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.imageio.*;
import java.awt.image.*;

// each lab frame is 
// buffer 1px side-side, 1px up, 3px down
// actual sprite is contained within 96x83 px
// sprite sheet is 11x3 sprites
// will prolly grab lab + buffer = 98x87 px
public class Lab extends JComponent implements Runnable{
    BufferedImage sprite, shadow;
    public int[] timers;
    int sx, sy;
    
    public Lab() throws IOException{
        this.timers =new int[] {0,0,0,0,0,0};
        this.sprite = ImageIO.read(new File("sprites/lab/lab.png"));
        this.shadow = ImageIO.read(new File("sprites/lab/lab-shadow.png"));
        for(int x = 0; x < this.shadow.getWidth(); x++){
            for(int y = 0; y < this.shadow.getHeight(); y++){
                if(new Color(shadow.getRGB(x,y),true).equals(new Color(0,0,0))){
                    this.shadow.setRGB(x,y,new Color(0,0,0,127).getRGB());
                }
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
        frame.drawImage(this.shadow,210,135,null);
        if(new ArrayList<>(Arrays.asList(this.timers)).contains(0)){
            
        } else {
            frame.drawImage(this.sprite,208,120,304,207,98 * sx,87 * sy,98*(sx+1),87*(sy+1),null);
        }
    }
    public void run(){
        while(true){
            sx++;
            if(sx > 10){ sx = 0; sy++; }
            if(sy > 2){ sy = 0; }
            for(int time : timers){
                if(time > 0){ time--; }
            }
            try{
                Thread.sleep(34);
            } catch(Exception e){}
        }
    }
}