import java.io.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.imageio.*;
import java.awt.image.*;

public class InserterManager extends JComponent implements Runnable{
    Inserter i1, i2, i3;
    
    public InserterManager(){
        this.i1 = new Inserter();
        this.i2 = new Inserter();
        this.i3 = new Inserter();
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