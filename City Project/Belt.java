import java.io.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.imageio.*;
import java.awt.image.*;

// image stats
// start 16,143, end 49,175, total size 33,34
// buffer: 30 between
// hiehgt of end: 7, !end: 32
public class Belt extends JComponent{
    public Image sprite;
    public int x, y;
    public boolean end;
    
    public Belt(int x, int y, boolean end) throws IOException{
        this.sprite = ImageIO.read(new File("sprites/transport-belt.png"));
        this.x = x;
        this.y = y;
        this.end = end;
    }
    public void draw (Graphics2D frame){ // actually draw stuff here
        if(this.end){
            frame.drawImage(this.sprite,x,y,x+33,y+7,16+64*BeltManager.tick,1129,49+64*BeltManager.tick,1135,null);
        } else if(!this.end){
            frame.drawImage(this.sprite,x,y,x+33,y+34,16+64*BeltManager.tick,143,49+64*BeltManager.tick,175,null);
        }
    }
}
