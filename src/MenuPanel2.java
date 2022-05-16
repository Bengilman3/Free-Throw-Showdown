import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class MenuPanel2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MenuPanel2 extends JPanel
{
    private MenuButtonEasy buttonA;
    private MenuButtonHard buttonB;
    private MenuButtonImpossible buttonC;
    private Image court;
    public MenuPanel2()
    {
        setLayout(null);
        buttonA = new MenuButtonEasy("EASY");
        buttonA.setBounds(20, 20, 500, 200);
        add(buttonA);
        buttonB = new MenuButtonHard("HARD");
        buttonB.setBounds(20, 300, 500, 200);
        add(buttonB);
        buttonC = new MenuButtonImpossible("IMPOSSIBLE");
        buttonC.setBounds(20, 620, 500, 200);
        add(buttonC);
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Image
        ImageIcon ii = new ImageIcon("derrick_rose.jpg");
        court = ii.getImage();
        g.drawImage(court, 0, 0, null);
    }
}
