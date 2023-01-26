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
        packs.add(new SciencePack(204,235,1));
        packs.add(new SciencePack(219,235,2));
        
        packs.add(new SciencePack(241,235,3));
        packs.add(new SciencePack(256,235,4));
        
        packs.add(new SciencePack(278,235,5));
        packs.add(new SciencePack(293,235,6));
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
