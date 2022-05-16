import javax.swing.*;
import java.awt.event.*;
/**
 * Write a description of class MenuButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuButtonImpossible extends JButton implements ActionListener
{
    private GameFrameImpossible x;
    public MenuButtonImpossible(String str)
    {
        super(str);  
        addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        x = new GameFrameImpossible();
        x.display();   
    }
}
