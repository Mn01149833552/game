
package game;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Start_Page extends JPanel{
    
    private JButton jbtStart;
    private JButton jbtHelp;
    private JButton jbtExit;  
    ImageIcon icon=new ImageIcon("src/game/folder/image6.jpg");
    Image image=icon.getImage();
    
    public Start_Page()
    {
        setLayout(null);
     
       jbtStart=new JButton("Start");
       jbtStart.setBounds(170, 180, 200 , 70);
       jbtStart.setOpaque(true);
       jbtStart.setBorderPainted(false);
       jbtStart.setContentAreaFilled(false);
        jbtStart.setFont(new Font("Sans",Font.BOLD+Font.ITALIC,35));
       jbtStart.setForeground(Color.YELLOW);
        
       jbtStart.setCursor(new Cursor(Cursor.HAND_CURSOR));
       add(jbtStart);
         
       jbtHelp=new JButton("Help");
       jbtHelp.setBounds(170, 380, 200 , 70);
       jbtHelp.setOpaque(true);
        jbtHelp.setFont(new Font("Sans",Font.BOLD+Font.ITALIC,35));
       jbtHelp.setForeground(Color.YELLOW);
        jbtHelp.setBorderPainted(false);
       jbtHelp.setContentAreaFilled(false);
       jbtHelp.setCursor(new Cursor(Cursor.HAND_CURSOR));
       add(jbtHelp);
       
       jbtExit=new JButton("Exit");
      jbtExit.setBounds(170, 480, 200 , 70);
       jbtExit.setOpaque(true);
       jbtExit.setFont(new Font("Sans",Font.BOLD+Font.ITALIC,35));
       jbtExit.setForeground(Color.YELLOW);
        jbtExit.setBorderPainted(false);
       jbtExit.setContentAreaFilled(false);
       jbtExit.setCursor(new Cursor(Cursor.HAND_CURSOR));
       add(jbtExit);   
    }
     @Override 
    protected void paintComponent(Graphics g)
    {
       super.paintComponent(g);
       g.drawImage(image, 0, 0,getWidth(),getHeight(),this);
    }
}
