
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import java.awt.Graphics;
public class main 
{
    public static JPanel room = new JPanel(new CardLayout());
   
    public static void main(String[] args)
    {
        System.out.println("test"); 
        Rooms rooms = new Rooms();
        rooms.getRooms();
        
    }
    
}
