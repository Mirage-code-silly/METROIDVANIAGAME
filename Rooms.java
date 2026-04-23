
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.CardLayout;
public class Rooms extends JPanel
{ 
   
    JPanel room = new JPanel(new CardLayout());
    Game panel = new Game();
    roomtransitoner trans = new roomtransitoner();
    int checker = 1;
    public Rooms() {
    
       JPanel room1 = new JPanel();
       JPanel room2 = new JPanel();
       room.add(room1,"start room");
       room.add(room2,"second room");
       if(panel.GetXPos() >= trans.getX() && panel.GetYPos() >= trans.getY());
    }
    public void startRoom() 
    {
          
        JFrame Room1 = new JFrame("Start Room");
        
        Room1.add(panel); 
        
        
    
        Room1.setSize(800, 600);
        Room1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        Room1.setVisible(true);
        room.add(Room1,"StartingRoom");
        
        while(checker > 0){
            roomtransitoner();
        }


        
        
        

    }
    public void SecondRoom(){
        JFrame Room2 = new JFrame("Second Room");
        Room2.add(new Game());
        Room2.setSize(800,600);
        Room2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        Room2.setVisible(true);
        room.add(Room2,"SecondRoom");
    }
    // public void changeRoom(String s,int startX, int Starty){
    //     panel.setX(startX);
    //     panel.setY(Starty);


    // }
    public void roomtransitoner(){
       if(panel.GetXPos() >= trans.getX() && panel.GetYPos() >= trans.getY()){
            CardLayout cl = (CardLayout)(room.getLayout());
            cl.show(room, "SecondRoom");
       }
    }
    public JPanel getRooms(){
        return room;
    }
    
   
}
