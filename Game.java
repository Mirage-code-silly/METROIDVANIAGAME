import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.KeyListener;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

public class Game extends JPanel implements KeyListener{
    player player0 = new player();
    static boolean[] keys = new boolean[4];
    roomtransitoner e = new roomtransitoner();
    public Game(){
        this.addKeyListener(this);
        setFocusable(true);
    }
    @Override
    protected void paintComponent(Graphics g){
        
        super.paintComponent(g);
        e.drawexit(g);
        player0.draw(g);
        player0.Movment();
        SleepRefresh();
    }
    public void SleepRefresh(){
        try{
            Thread.sleep(1000/30);
        }catch(Exception e){
            
        }

        repaint();
    }
    public void keyPressed(KeyEvent arg0){
        if(arg0.getKeyCode() == KeyEvent. VK_W){
            keys[0] = true;
        }
        if(arg0.getKeyCode() == KeyEvent. VK_A){
            keys[1] = true;
        }
        if(arg0.getKeyCode() == KeyEvent. VK_S){
            keys[2] = true;
        }
        if(arg0.getKeyCode() == KeyEvent. VK_D){
            keys[3] = true;
        }
        if(arg0.getKeyCode() == KeyEvent.VK_SHIFT){
            player0.issprinting = true;
        }
        
}
 public void keyReleased(KeyEvent arg0){
        if(arg0.getKeyCode() == KeyEvent. VK_W){
            keys[0] = false;
        }
        if(arg0.getKeyCode() == KeyEvent. VK_A){
            keys[1] = false;
        }
        if(arg0.getKeyCode() == KeyEvent. VK_S){
            keys[2] = false;
        }
        if(arg0.getKeyCode() == KeyEvent. VK_D){
            keys[3] = false;
        }
        if(arg0.getKeyCode() == KeyEvent.VK_SHIFT){
            player0.issprinting = false;
        }
} 
public void keyTyped(KeyEvent arg0){

}
public int GetXPos(){
    return player0.getXPosition();
}
public int GetYPos(){
    return player0.getYPosition();
}


}
