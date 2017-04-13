
package game;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Help extends JFrame{
    
        ImageIcon icon1=new ImageIcon("src/game/folder/image2.png");
        ImageIcon icon2=new ImageIcon("src/game/folder/image4.png");
        ImageIcon icon3=new ImageIcon("src/game/folder/image3.png");
        
        Image image1=icon1.getImage();
        Image image2=icon2.getImage();
        Image image3=icon3.getImage();
         private JButton jbtClose=new JButton("Close");
    public Help()
    {
        setTitle("من سيربح المليون");
       setSize(550, 625);
       setResizable(false);
       setDefaultCloseOperation(DISPOSE_ON_CLOSE);
       setLocationRelativeTo(null);
       setVisible(true);
       Help_panel h=new Help_panel();
       h.setBackground(Color.BLACK);
       add(h);
    }
    
    public class Help_panel extends JPanel
     {
          
        public Help_panel()
        {
           setLayout(null);
           jbtClose.setBounds(225, 525, 100, 50);
           jbtClose.setOpaque(true);
           jbtClose.setBorderPainted(false);
           jbtClose.setContentAreaFilled(false);
           jbtClose.setCursor(new Cursor(Cursor.HAND_CURSOR));
           jbtClose.setForeground(Color.YELLOW);
           jbtClose.setFont(new Font("Sans",Font.ITALIC+Font.BOLD,20));
           add(jbtClose);
           CloseListener close=new CloseListener();
           jbtClose.addActionListener(close);
         }
        @Override
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            g.setColor(Color.YELLOW);
            g.setFont(new Font("Sans",Font.ITALIC+Font.BOLD,30));
            g.drawString("عليك قراة الاسئلة", 120, 100);
            g.drawString(" ثم اختيار الاجابة الصحيحة", 100, 150);
            g.drawString(" يمكنك الاستعانة بما يلي", 100, 200);
            g.drawString("  الجمهور", 400, 300);
            g.drawString("  صديقك", 400, 400);
            g.drawString(" حذف اجابتين ", 300, 500);
            g.drawImage(image1, 200, 275, 75, 75,this);
            g.drawImage(image2, 200, 350, 75, 75,this);
            g.drawImage(image3, 200, 425, 75, 75,this);
        }
                
     }
    
    public class CloseListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
         dispose();
        }
    
    }
    
}
