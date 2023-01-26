import java.io.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.imageio.*;
import java.awt.image.*;

public class Ground extends JComponent implements Runnable {
    BufferedImage sprite;
    
    public Ground() throws IOException{
        this.sprite = ImageIO.read(new File("sprites/concrete.png"));
    }
    public void draw (Graphics2D frame){
        frame.drawImage(this.sprite,0,0,null);
        frame.drawImage(this.sprite,0,256,null);
    }
    public void run(){}
}
