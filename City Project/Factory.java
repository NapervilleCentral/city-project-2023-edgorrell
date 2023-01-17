import java.io.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.imageio.*;
import java.awt.image.*;

public class Factory extends JComponent{
    private Thread t1, t2, t3, t4, t5, t6, t7, t8;
    
    private Ground ground;
    private Lab lab;
    private BeltManager beltManager;
    private ScienceManager scienceManager;
    private InserterManager inserterManager;
    private Biter biter;
    private Bot bot;
    
    public Factory() throws IOException{
        ground = new Ground();
        lab = new Lab(207,120);
        beltManager = new BeltManager();
        scienceManager = new ScienceManager();
        inserterManager = new InserterManager();
        biter = new Biter();
        bot = new Bot();
        
        t1 = new Thread(ground);
        t2 = new Thread(lab);
        t3 = new Thread(beltManager);
        t4 = new Thread(scienceManager);
        t5 = new Thread(inserterManager);
        t6 = new Thread(biter);
        t7 = new Thread(bot);
        
        t1.start(); t2.start(); t3.start();
        t4.start(); t5.start(); t6.start();
        t7.start();
    }
    public void paintComponent(Graphics g){
        Graphics2D frame = (Graphics2D) g;
        
        ground.draw(frame);
        lab.draw(frame);
        beltManager.draw(frame);
        scienceManager.draw(frame);
        inserterManager.draw(frame);
        biter.draw(frame);
        bot.draw(frame);
    }
    public void nextFrame(){
        repaint();
    }
    public void run(){}
}