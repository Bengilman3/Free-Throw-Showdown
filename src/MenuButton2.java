import javax.swing.*;
import java.awt.event.*;
/**
 * Write a description of class MenuButton2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuButton2 extends JButton implements ActionListener
{
    public MenuButton2(String str)
    {
        super(str);  
        addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        JOptionPane.showMessageDialog(null,"Press the space bar when the meter is in the green to make a shot.\nPress B to take a new shot.\nTake 10 shots and see how many you can make.");
    }
}
