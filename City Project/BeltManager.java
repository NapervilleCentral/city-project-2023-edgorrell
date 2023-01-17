import java.io.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.imageio.*;
import java.awt.image.*;

public class BeltManager extends JComponent implements Runnable{
    ArrayList<ArrayList<Belt>> belts = new ArrayList<ArrayList<Belt>>();
    ArrayList<Belt> belt1, belt2, belt3;

    public BeltManager() throws IOException{
        belt1 = new ArrayList<Belt>();
        belt2 = new ArrayList<Belt>();
        belt3 = new ArrayList<Belt>();
        belts.add(belt1);
        belts.add(belt2);
        belts.add(belt3);
        belt1.add(new Belt(0,0,false));
        //belt2.add(new Belt());
        //belt3.add(new Belt());
        
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
        for(ArrayList<Belt> belt : belts){
            for(Belt segment : belt){
                segment.draw(frame);
            }
        }
    }
    public void run(){
        
    }
}