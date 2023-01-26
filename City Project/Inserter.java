import java.io.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.imageio.*;
import java.awt.image.*;

public class Inserter extends JComponent implements Runnable{
    BufferedImage base, armOpen, armClosed, item;
    int x,y,angle;
    boolean turnDirection;

    public Inserter(int x, int y) throws IOException{
        this.x = x;
        this.y = y;
        this.base = ImageIO.read(new File("sprites/inserter/inserter-base.png"));
        this.armOpen = ImageIO.read(new File("sprites/inserter/inserter-hand-open.png"));
        this.armClosed = ImageIO.read(new File("sprites/inserter/inserter-hand-closed.png"));
    }
    public BufferedImage rotate(BufferedImage img, double theta){

        int width = img.getWidth();
        int height = img.getHeight();

        int nWidth = 100;
        int nHeight = 100;

        BufferedImage rotatedImage = new BufferedImage(nWidth, nHeight, BufferedImage.TYPE_INT_ARGB);

        Graphics2D graphics = rotatedImage.createGraphics();

        graphics.setRenderingHint(
            RenderingHints.KEY_INTERPOLATION,
            RenderingHints.VALUE_INTERPOLATION_BICUBIC
        );

        graphics.translate((nWidth - width) / 2, (nHeight - height) / 2);
        graphics.rotate(Math.toRadians(theta), width/2.0, height/2.0);
        graphics.drawImage(img, 0, 0, null);
        graphics.dispose();

        return rotatedImage;
    }
    public void draw (Graphics2D frame, boolean first){ // actually draw stuff here
        if(first){
            frame.drawImage(this.base,this.x+34,this.y+38,null);
            return;
        }
        if(this.angle < 180){
            frame.drawImage(rotate(this.armOpen,this.angle),this.x,this.y,null);
        } else {
            frame.drawImage(rotate(this.armClosed,this.angle),this.x,this.y,null);
        }
        frame.fillRect(74*(int)Math.cos(this.angle), 74*(int)Math.sin(this.angle)+this.y,10,10);
    }
    public void run(){
        this.angle++;
        this.angle %= 360;
    }
}