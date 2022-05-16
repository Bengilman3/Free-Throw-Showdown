/**
 * Author: Ben G.
 * Filename: GameFrame.java
 * Purpose: This is the frame holding the panel
 */
import javax.swing.JFrame;
import java.awt.*;
public class GameFrame2 extends JFrame
{
    private MenuPanel2 pavan;
    private JFrame frame;
    public GameFrame2()
    {
        frame = new JFrame("TITLE");
        frame.setDefaultLookAndFeelDecorated(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        pavan = new MenuPanel2();
        pavan.setPreferredSize(new Dimension(800,600));
        add(pavan);
    }
    
    public void display()
    {
        pack(); //helps make frame visible, you need pack and setVisible
        setVisible(true);
    }
}

