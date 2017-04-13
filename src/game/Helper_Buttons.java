
package game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Helper_Buttons extends JPanel{
    
    
    ImageIcon image1=new ImageIcon("src/game/folder/image1.png");
    ImageIcon image2=new ImageIcon("src/game/folder/image2.png");
    ImageIcon image3=new ImageIcon("src/game/folder/image3.png");
    ImageIcon image4=new ImageIcon("src/game/folder/image4.png");
    ImageIcon image5=new ImageIcon("src/game/folder/image5.png");
    
    private JButton jbtPeople;
    private JButton jbthalf;
    private JButton jbtTelpone;
    private JButton jbtLeave;
    private  JLabel jlblImage;
    private JPanel panel;
    public Helper_Buttons()
    {
        panel=new JPanel(new GridLayout(4,1));
        panel.setSize(450, 315);
        setLayout(new BorderLayout ());
        jlblImage=new JLabel( image1);
       jlblImage.setBounds(0, 0, 250, 310);
    
       add(jlblImage,BorderLayout.CENTER);
       
       jbtPeople =new JButton(image2);
       jbtPeople.setBounds(0, 0, 200, 65);
       jbtPeople.setOpaque(true);
       jbtPeople.setBorderPainted(false);
       jbtPeople.setContentAreaFilled(false);
       jbtPeople.setCursor(new Cursor(Cursor.HAND_CURSOR));
       panel.add(jbtPeople);
       
       jbtTelpone =new JButton(image4);
       jbtTelpone.setBounds(0, 0, 200, 65);
       jbtTelpone.setOpaque(true);
       jbtTelpone.setBorderPainted(false);
       jbtTelpone.setCursor(new Cursor(Cursor.HAND_CURSOR));
       jbtTelpone.setContentAreaFilled(false);
       panel.add(jbtTelpone);
       
       jbthalf =new JButton(image3);
       jbthalf.setBounds(0, 0, 200, 65);
       jbthalf.setOpaque(true);
       jbthalf.setCursor(new Cursor(Cursor.HAND_CURSOR));
       jbthalf.setBorderPainted(false);
       jbthalf.setContentAreaFilled(false);
       panel.add(jbthalf);
       
       jbtLeave =new JButton(image5);
       jbtLeave.setBounds(0, 0, 200, 65);
       jbtLeave.setCursor(new Cursor(Cursor.HAND_CURSOR));
       jbtLeave.setOpaque(true);
       jbtLeave.setBorderPainted(false);
       jbtLeave.setContentAreaFilled(false);
       panel.add(jbtLeave);
       
       
       panel.setOpaque(true);
       panel.setBackground(Color.BLACK);
       add(panel,BorderLayout.EAST);
    }
//    @Override 
//    protected void paintComponent(Graphics g)
//    {
//       super.paintComponent(g);
//       g.setColor(Color.BLUE);
////       for(int i=0;i<10;i++)
////           g.drawLine(0, 300+i, 75, 300+i);
//    
//       
//    }

//    @Override
//    public Dimension getPreferredSize()
//    {
//        return new Dimension(101,315);
//    }
}
