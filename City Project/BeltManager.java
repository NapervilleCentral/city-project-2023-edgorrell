import java.awt.*;
import java.util.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class BeltManager extends JComponent implements Runnable{
    ArrayList<ArrayList<Belt>> belts = new ArrayList<ArrayList<Belt>>();
    ArrayList<Belt> belt1, belt2, belt3;

    public BeltManager(){
        belt1 = new ArrayList<Belt>();
        belt2 = new ArrayList<Belt>();
        belt3 = new ArrayList<Belt>();
        belt1.add(new Belt());
        belt2.add(new Belt());
        belt3.add(new Belt());
        belts.add(belt1);
        belts.add(belt2);
        belts.add(belt3);
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