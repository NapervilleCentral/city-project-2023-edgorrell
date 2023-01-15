import java.io.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.imageio.*;
import java.awt.image.*;

public class thing extends JComponent implements Runnable{
    Image sprite;

    public thing() throws IOException{
        sprite = ImageIO.read(new File("sprites/poker.jpg"));
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
        frame.drawImage(sprite,0,0,null);
    }
    
    public void run(){ // change stuff between frames here

    }
}
