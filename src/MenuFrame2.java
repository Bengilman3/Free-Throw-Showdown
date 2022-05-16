import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class MenuFrame2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MenuFrame2 extends JFrame
{
    private JFrame frame2;
    private MenuPanel2 panel2;
    public MenuFrame2()
    {
        frame2 = new JFrame("MENU2");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBackground(Color.BLUE);
        panel2 = new MenuPanel2();
        panel2.setPreferredSize(new Dimension(1000, 1000));
        frame2.getContentPane().add(panel2);
    }
    
    public void display()
    {
        frame2.pack();
        frame2.setVisible(true);
    }
}
