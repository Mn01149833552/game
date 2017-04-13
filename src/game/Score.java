
package game;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Score extends JPanel{
    public static  int draw_Count;
    public Score()
    {
       draw_Count=0;
    }
    @Override
    protected void paintComponent(Graphics g)
    {

       super.paintComponent(g);
       g.setFont(new Font("Sans",Font.BOLD,15));
       g.setColor(Color.YELLOW);
       g.drawString("1,000,000", 10, 30);
       g.setColor(Color.WHITE);
       g.drawString("500,000", 20, 50);
       g.drawString("250,000", 20, 70);
       g.drawString("125,000", 20, 90);
       g.drawString("64,000", 25, 110);
       g.setColor(Color.YELLOW);
       g.drawString("32,000", 27, 130);
       g.setColor(Color.WHITE);
       g.drawString("16,000", 27, 150);
       g.drawString("8,000", 30, 170);
       g.drawString("4,000", 30, 190);
       g.drawString("2,000", 30, 210);
       g.setColor(Color.YELLOW);
       g.drawString("1,000", 30, 230);
       g.setColor(Color.WHITE);
       g.drawString("500", 35, 250);
       g.drawString("300", 35, 270);
       g.drawString("200", 35, 290);
       g.drawString("100", 35, 310);
       g.setColor(Color.YELLOW);
       g.setColor(Color.RED);
       g.fillOval(60+(draw_Count+3),300-(draw_Count*20),10,10);
       repaint();
    }
    
}
