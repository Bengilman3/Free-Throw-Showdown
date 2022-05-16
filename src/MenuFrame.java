import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class MenuFrame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuFrame extends JFrame 
{
    private JFrame frame;
    private MenuPanel panel;
    public MenuFrame()
    {
        frame = new JFrame("MENU");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBackground(Color.BLUE);
        panel = new MenuPanel();
        panel.setPreferredSize(new Dimension(1000,1000));
        frame.getContentPane().add(panel);
    }
    
    public void display()
    {
        frame.pack();
        frame.setVisible(true);
    }
}
