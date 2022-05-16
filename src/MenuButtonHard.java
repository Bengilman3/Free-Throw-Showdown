import javax.swing.*;
import java.awt.event.*;
/**
 * Write a description of class MenuButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuButtonHard extends JButton implements ActionListener
{
    private GameFrameHard x;
    public MenuButtonHard(String str)
    {
        super(str);  
        addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        x = new GameFrameHard();
        x.display();   
    }
}
