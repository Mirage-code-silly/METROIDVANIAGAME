import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.*;

public class player 
{
    public int x = 100, y = 100;
    private int width = 50, hight = 50;
    public boolean issprinting = false;
    public player(){
        
    }
    public void Movment(){
        if(issprinting == false){
           if(Game.keys[0]){
            y--;
             }
            if(Game.keys[1]){
            x--;
            }
             if(Game.keys[2]){
            y++;
            }
            if(Game.keys[3]){
            x++;
            } 
        }
        if(issprinting == true){
            if(Game.keys[0]){
            y -= 2;
             }
            if(Game.keys[1]){
            x -= 2;
            }
             if(Game.keys[2]){
            y += 2;
            }
            if(Game.keys[3]){
            x += 2;
            } 
        }
        


    }
    public void draw(Graphics g){
        g.setColor(Color.red);
        g.fillRect(x,y,width,hight);
    }
    public int getXPosition(){
        return x;
        
    }
    public int getYPosition(){
        return y;
    }
   
}
