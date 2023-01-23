import java.io.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.imageio.*;
import java.awt.image.*;

public class ScienceManager extends JComponent implements Runnable{
    public static ArrayList<ArrayList<SciencePack>> packs;
    ArrayList<SciencePack> pack1, pack2, pack3, pack4, pack5, pack6;
    
    public ScienceManager() throws IOException{
        pack1 = new ArrayList<SciencePack>();
        pack2 = new ArrayList<SciencePack>();
        pack3 = new ArrayList<SciencePack>();
        pack4 = new ArrayList<SciencePack>();
        pack5 = new ArrayList<SciencePack>();
        pack6 = new ArrayList<SciencePack>();
        packs = new ArrayList<ArrayList<SciencePack>>();
        packs.add(pack1); packs.add(pack2); packs.add(pack3);
        packs.add(pack4); packs.add(pack5); packs.add(pack6);
        for(ArrayList<SciencePack> type : packs){
            for(int i = 0; i < 22; i++){
                type.add(new SciencePack(packs.indexOf(type)+1));
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
        
    }
    public void run(){
        
    }
}
