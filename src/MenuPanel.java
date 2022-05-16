import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class MenuPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuPanel extends JPanel 
{
    private MenuButton1 button1;
    private MenuButton2 button2;
    //private MenuButton3 button3;
    private Image court;

    public MenuPanel()
    {
        setLayout(null);
        button1 = new MenuButton1("PLAY");
        button1.setBounds(20, 20, 675, 250);
        add(button1);
        button2 = new MenuButton2("TUTORIAL");
        button2.setBounds(20, 400, 675, 250);
        add(button2);
        // button3 = new MenuButton3("OPTIONS");
        // button3.setBounds(20,380, 300, 100);
        // add(button3);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Image
        ImageIcon ii = new ImageIcon("d_rose.jpg");
        court = ii.getImage();
        g.drawImage(court, 0, 0, null);
    }
}
