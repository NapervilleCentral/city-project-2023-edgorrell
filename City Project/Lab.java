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
    Image sprite;
    int x, y, sx, sy;
    
    public Lab(int x, int y) throws IOException{
        this.sprite = ImageIO.read(new File("sprites/lab/lab.png"));
        this.x = x;
        this.y = y;
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
        frame.drawImage(this.sprite,x,y,x+98,y+87,98 * sx,87 * sy,98*(sx+1),87*(sy+1),null);
    }
    public void run(){
        while(true){
            sx++;
            if(sx > 10){ sx = 0; sy++; }
            if(sy > 2){ sy = 0; }
            try{
                Thread.sleep(34);
            } catch(Exception e){}
        }
    }
}