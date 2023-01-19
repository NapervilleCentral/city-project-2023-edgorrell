import java.io.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.imageio.*;
import java.awt.image.*;

public class Viewer{
    public static void main(String[] args) throws InterruptedException, IOException{
        JFrame frame = new JFrame();
        // actually 528/423, not 512/384
        // diff of 16,39??? homepc, check w/ school
        frame.setSize(528, 423);
        frame.setTitle("Factorio");
        frame.setIconImage(ImageIO.read(new File("sprites/icon.png")));
        frame.setBackground(Color.black);
        //frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Factory factory = new Factory();
        frame.add(factory);
        
        while(true){
            factory.nextFrame();
            Thread.sleep(17); // approx 30fps
        }
    }
}