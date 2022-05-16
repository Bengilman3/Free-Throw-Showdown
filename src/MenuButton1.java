import javax.swing.*;
import java.awt.event.*;
/**
 * Write a description of class MenuButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuButton1 extends JButton implements ActionListener
{
    private GameFrame2 x;
    public MenuButton1(String str)
    {
        super(str);  
        addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        x = new GameFrame2();
        x.display();   
    }
}
