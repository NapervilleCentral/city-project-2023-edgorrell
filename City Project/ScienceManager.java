import java.io.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.imageio.*;
import java.awt.image.*;

public class ScienceManager extends JComponent implements Runnable{
    ArrayList<SciencePack> pack1 = new ArrayList<SciencePack>();
    ArrayList<SciencePack> pack2 = new ArrayList<SciencePack>();
    ArrayList<SciencePack> pack3 = new ArrayList<SciencePack>();
    ArrayList<SciencePack> pack4 = new ArrayList<SciencePack>();
    ArrayList<SciencePack> pack5 = new ArrayList<SciencePack>();
    ArrayList<SciencePack> pack6 = new ArrayList<SciencePack>();
    
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
