import java.io.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.imageio.*;
import java.awt.image.*;

public class InserterManager extends JComponent implements Runnable{
    ArrayList<Inserter> inserters;
    Inserter i1, i2, i3;
    boolean first = true;
    
    public InserterManager(){
        this.inserters = new ArrayList<Inserter>();
        this.i1 = new Inserter(167,165);
        this.i2 = new Inserter(205,165);
        this.i3 = new Inserter(243,165);
        inserters.add(i1);
        inserters.add(i2);
        inserters.add(i3);
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
        for(int i = 0; i < 2; i++){
            for(Inserter inserter : inserters){
                inserter.draw(frame, this.first);
            }
            first = !first;
        }
    }
    public void run(){
        while(true){
            for(Inserter i : inserters){
                i.run();
            }
            try{
                Thread.sleep(17);
            } catch(Exception e){}
        }
    }
}