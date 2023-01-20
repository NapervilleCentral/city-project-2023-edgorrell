import java.io.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.imageio.*;
import java.awt.image.*;

public class Ground extends JComponent implements Runnable {
    public static BufferedImage spriteSheet;
    BufferedImage sprite;
    
    public Ground() throws IOException{
        if(this.spriteSheet == null){
            try{
                this.spriteSheet = ImageIO.read(new File("sprites.concrete.png"));            
            } catch(Exception e){}
        }
        //sprite = this.spriteSheet.getSubimage(0,0,528,this.spriteSheet.getHeight());
    }
    public void nextFrame(){
        repaint();
    }
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        draw(g2);
    }
    public void draw (Graphics2D frame){
        frame.drawImage(this.sprite,0,0,null);
        frame.drawImage(this.sprite,0,256,null);
    }
    public void run(){}
}
