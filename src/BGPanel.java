import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.IOException;
import javax. imageio.ImageIO; 
import java.io.*;
public class BGPanel extends JPanel {
    Timer t = new Timer(10, new RunGame());

    private int player1attempt = 0;
    private int player1score = 0;

    private int meterposition = 825; // starting meter position
    private boolean direction = true;
    private boolean spacebar = false;
    private boolean scored = false;
    private boolean x = true;
    boolean y = true;
    private int m = 820; // ball initial y position
    private int p = 122; // ball initial x position
    private int s = 100;
    private int a = 0;
    private int dist = 5;
    //private final int attempts;
    private Image court;
    private BufferedImage ball;
    
    public BGPanel(int d) {
        super();
        t.start();
        addKeyListener(new Key());
        setFocusable(true);
        dist = d;
        ball = loadImage("basketball.png");
        try {
            ball = ImageIO.read(new File("basketball.png"));
        } catch (IOException e) {
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Image
        ImageIcon ii = new ImageIcon("court.jpg");
        
        court = ii.getImage();
        g.drawImage(court, 0, 0, null);

        this.setBackground(Color.WHITE);
        //cartoon hoop
        // g.setColor(Color.RED);
        // g.fillRect(0, 0, 350, 195); // 225, 125, 350, 225
        // g.setColor(Color.WHITE);
        // g.fillRect(12 + xoffset, 12 + yoffset, 325, 170);
        // g.setColor(Color.RED);
        // g.fillRect(105 + xoffset, 90 + yoffset, 135, 100);
        // g.setColor(Color.WHITE);
        // g.fillRect(117 + xoffset, 102 + yoffset, 110, 75);
        // g.setColor(Color.RED);
        // g.fillOval(101 + xoffset, 174 + yoffset, 142, 90);
        // g.setColor(Color.WHITE);
        // g.fillOval(108 + xoffset, 179 + yoffset, 127, 70);

        // Basketball
        //g.setColor(new Color(240, 151, 17));
        //g.fillOval(p + 720, m, s, s);
        g.drawImage(ball,p+720,m,s,s,null);
        // Meter
        g.setColor(Color.RED);
        g.fillRect(825, 1000, 60, 30);  
        g.fillRect(885 + dist, 1000, 60, 30); 
        
        // Green part
        g.setColor(Color.GREEN);
        g.fillRect(885, 1000, dist, 30);
        g.setColor(Color.WHITE);
        
        // Makes the meter move
        if (meterposition >= 825 && direction && !spacebar) {
            meterposition += 1;
            if(meterposition >= 825 + 120 + dist - 2) {
                direction = false;
            }
        }
        if (meterposition <= 825 + 120 + dist - 2 && !direction && !spacebar) {
            meterposition -= 1;
            if(meterposition <= 825) {
                direction = true;
            }
        }
        g.fillRect(meterposition, 1000, 2, 30);

        // Text
        g.setColor(new Color(240, 151, 17));
        g.setFont(new Font(null, Font.BOLD, 50));
        if(meterposition <= 885 + dist - 2 && meterposition >= 885 
            && spacebar) {
            if (scored) {
                player1score++;
                scored = false;
            }
            g.drawString("Bucket!!!!  Your score is " + player1score 
                + " out of " + player1attempt + " attempts. Press b to continue", 100, 950);
            madeShot();
        }
        else if(meterposition < 885 && spacebar && player1attempt < 10) {
            g.drawString("Missed Left!!!! Your score is " + player1score 
                + " out of " + player1attempt + " attempts. Press b to continue", 100, 950);
            missLeft();
        }
        else if(meterposition > 885 + dist - 2 && spacebar && player1attempt < 10) {
            g.drawString("Missed Right!!!! Your score is " + player1score 
                + " out of " + player1attempt + " attempts. Press b to continue", 100, 950);
            missRight();
        }
        if (player1attempt == 10) {
            g.setFont(new Font(null, Font.BOLD, 100));
            if (player1score >=9)
                g.drawString("Congratulations!!! YOUR SCORE: " + player1score + "/" + player1attempt, 100, 500);
            else
                g.drawString("GAME OVER. YOUR SCORE: " + player1score + "/" + player1attempt, 100, 500);
        }
    }

    private class RunGame implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (player1attempt <= 10)
                repaint();
        }
    }

    private class Key extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            // detects if space is pressed 
            if(e.getKeyCode() == KeyEvent.VK_SPACE && y) {
                spacebar = true;
                scored = true;
                player1attempt++;
                y = false;
            }
            // resets variables and gives player new shot
            if(e.getKeyCode() == KeyEvent.VK_B && player1attempt < 10) {
                spacebar = false;
                p = 140;
                m = 820; 
                s = 100;
                x = true;
                a = 0;
                y = true;
            }
        }
    }

    public BufferedImage loadImage(String FileName)
    {
        BufferedImage i = null;
        try{
            i = ImageIO.read(new File(FileName));
        }
        catch(IOException e){}
        return i;
    }
    
    public void madeShot()
    {
        if (x)
        {
            if (a<55){
                s -= 1;
                m -= 10;
            }
            if (a%2 == 0)
                p += 0;
            a++;
            if (a>=55){
                m+=10;
                
                if (a==95)
                    x = false;
            }
        }
    }

    public void missLeft() {
        if (x){
            if (a<55){
                m -= 10;
                s -= 1;
            }
            s = 60;
            if (a%2 == 0)
                p -= 3;
            a++;
            if (a>=55){
                m+=10;
                if(a==95)
                    x = false;
            }
        }
    }

    public void missRight() {
        if (x)
        {
            if (a<55){
                s -= 1;
                m -= 10;
            }
            s = 60;
            if (a%2 == 0)
                p += 3;
            a++;
            if (a>=55){
                m+=10;
                if(a==95)
                    x = false;
            }
        }
    }
}

