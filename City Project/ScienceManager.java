import java.io.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.imageio.*;
import java.awt.image.*;

public class ScienceManager extends JComponent implements Runnable{
    ArrayList<SciencePack> packs;
    BufferedImage img;
    
    public ScienceManager() throws IOException{
        packs = new ArrayList<SciencePack>();
        packs.add(new SciencePack(205,235,1));
        packs.add(new SciencePack(219,235,2));
        
        packs.add(new SciencePack(205,235,1));
        packs.add(new SciencePack(219,235,2));
        
        packs.add(new SciencePack(205,235,1));
        packs.add(new SciencePack(219,235,2));
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
        for(SciencePack pack : packs){
            pack.draw(frame);
        }
    }
    public void run(){
        while(true){
            for(SciencePack pack : packs){
                pack.run();
            }
            try{
                Thread.sleep(34);
            } catch(Exception e){}
        }
    }
}
