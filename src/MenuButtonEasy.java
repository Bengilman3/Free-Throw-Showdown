import javax.swing.*;
import java.awt.event.*;
/**
 * Write a description of class MenuButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuButtonEasy extends JButton implements ActionListener
{
    private GameFrameEasy x;
    public MenuButtonEasy(String str)
    {
        super(str);  
        addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        x = new GameFrameEasy();
        x.display();   
    }
}
