import java.io.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.imageio.*;
import java.awt.image.*;

public class BeltManager extends JComponent implements Runnable{
    ArrayList<Belt> belts;
    public static int tick = 0;

    public BeltManager() throws IOException{
        belts = new ArrayList<Belt>();
        
        for(int xpos : new int[] {201,238,275}){
            belts.add(new Belt(xpos,235,true));
            belts.add(new Belt(xpos,242,false));
            belts.add(new Belt(xpos,275,false));
            belts.add(new Belt(xpos,308,false));
            belts.add(new Belt(xpos,341,false));
            belts.add(new Belt(xpos,374,false));
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
        for(Belt belt : belts){
            belt.draw(frame);
        }
        this.tick++;
        this.tick %= 16;
    }
    public void run(){
        while(true){
            try{
                Thread.sleep(34);
            } catch(Exception e){}
        }
    }
}
