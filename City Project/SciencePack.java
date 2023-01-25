import java.io.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.imageio.*;
import java.awt.image.*;

public class SciencePack extends JComponent implements Runnable{
    BufferedImage sprite;
    int x, y, id, offset;
    boolean isMoving;
    // id is 1-6 not 0-5
    
    public SciencePack(int x, int y, int id) throws IOException{
        this.sprite = ImageIO.read(new File("sprites/science-packs/id-" + id + ".png"));
        this.x = x;
        this.y = y;
        this.offset = 0;
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
        for(int i = 0; i < 22; i++){
            frame.drawImage(this.sprite,x,(12*i)+offset+y,null);
        }
    }
    public void run(){
        if(offset != 0){
            offset--;
        }
    }
}