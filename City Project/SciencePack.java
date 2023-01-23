import java.io.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.imageio.*;
import java.awt.image.*;

public class SciencePack extends JComponent implements Runnable{
    BufferedImage sprite;
    int x, y, id, index;
    // id is 1-6 not 0-5
    
    public SciencePack(int id) throws IOException{
        this.sprite = ImageIO.read(new File("sprites/science-packs/id-" + id + ".png"));
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
        frame.drawImage(this.sprite,x,y,null);
    }
    public void run(){
        index = ScienceManager.packs.get(id).indexOf(this);
    }
    public boolean equals(Object obj){
        SciencePack pack = (SciencePack) obj;
        return (this.x == pack.x && this.y == pack.y && this.id == pack.id);
    }
}