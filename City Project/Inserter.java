import java.io.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.imageio.*;
import java.awt.image.*;

public class Inserter extends JComponent{
    BufferedImage base, armOpen, armClosed, item;
    int x,y,xOffset,yOffset;
    int angle,id,wait;

    public Inserter(int x, int y) throws IOException{
        this.x = x;
        this.y = y;
        this.wait = (int)(5000*Math.random());
        this.angle = 180;
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
        if(this.item == null){
            frame.drawImage(rotate(this.armOpen,this.angle),this.x,this.y,null);
        } else {
            frame.drawImage(rotate(this.armClosed,this.angle),this.x,this.y,null);
            this.xOffset = (int)(33*Math.cos(Math.toRadians(-this.angle+90)));
            this.yOffset = (int)(33*Math.sin(Math.toRadians(-this.angle+90)));
            frame.drawImage(this.item,this.x+44 + this.xOffset,this.y+40 - this.yOffset,null);
        }
    }
    public void run(){
        if(this.wait != 0){
            this.wait--;
            return;
        }
        try{
            if(this.angle == 179){
                this.wait = (int)(100*Math.random());
            }
            if(this.angle == 180){
                this.id = (int) Math.round(Math.random()) + 1;
                this.id += 2*InserterManager.inserters.indexOf(this);
                this.item = ImageIO.read(new File("sprites/science-packs/id-" + this.id + ".png"));
                ScienceManager.update(this.id);
            }
            if(this.angle == 0){
                this.item = null;
            }
            if(this.item == null){
                this.angle++;
            } else {
                this.angle--;
            }
        } catch(Exception e){}
    }
}