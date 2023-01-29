import java.io.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.imageio.*;
import java.awt.image.*;

public class Biter extends JComponent implements Runnable{
    BufferedImage sprite, shadow;
    int x, y, sx, sy, wait;
    public void draw (Graphics2D frame){ // actually draw stuff here
        
    }
    public void run(){
        Lab.isDestroyed = !Lab.isDestroyed;
        System.out.println("lmao");
        try{
            Thread.sleep((int)(5000*Math.random()));
        } catch(Exception e){}
    }
}