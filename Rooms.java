
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Rooms 
{
    public Rooms(){
        
    }
    public void startRoom()
    {
        JFrame Room1 = new JFrame("Starting Room");

        
        Room1.setSize(500, 500);

        Room1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Room1.setVisible(true);

        
    }
}
