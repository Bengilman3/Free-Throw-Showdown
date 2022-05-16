/**
 * Author: Ben G.
 * Filename: GameFrame.java
 * Purpose: This is the frame holding the panel
 */
import javax.swing.JFrame;
import java.awt.*;
public class GameFrameEasy extends JFrame
{
    private BGPanel pavan;
    private JFrame frame;
    public GameFrameEasy()
    {
        frame = new JFrame("TITLE");
        frame.setDefaultLookAndFeelDecorated(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        pavan = new BGPanel(14);
        pavan.setPreferredSize(new Dimension(1200,1000));
        add(pavan);
    }
    
    public void display()
    {
        pack(); //helps make frame visible, you need pack and setVisible
        setVisible(true);
    }
}

