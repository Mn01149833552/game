
package game;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Call_Last_Window_Leave extends JFrame{
      private JButton jbtContinue;
    private JButton jbtExit;
    public Call_Last_Window_Leave()
    {
        setTitle("من سيربح المليون");
        setSize(550, 625);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true); 
         Call_Last_Window_Leave.LastWindow_Leave l=new Call_Last_Window_Leave.LastWindow_Leave();
        l.setBackground(Color.BLACK);
        add(l);
    }
    
    public class LastWindow_Leave extends JPanel{
    
    public LastWindow_Leave()
    {
        setLayout(null);
       jbtContinue=new JButton("Restart");
       jbtContinue.setBounds(170, 400, 175, 50);
       jbtContinue.setForeground(Color.YELLOW);
       jbtContinue.setCursor(new Cursor(Cursor.HAND_CURSOR));
       jbtContinue.setFont(new Font("Sans",Font.BOLD+Font.ITALIC,30));
       jbtContinue.setOpaque(true);
       jbtContinue.setContentAreaFilled(false);
       jbtContinue.setBorderPainted(false);
       add(jbtContinue);
       
       jbtExit=new JButton("Exit");
       jbtExit.setBounds(170, 500, 175, 50);
       jbtExit.setForeground(Color.YELLOW);
       jbtExit.setCursor(new Cursor(Cursor.HAND_CURSOR));
       jbtExit.setFont(new Font("Sans",Font.BOLD+Font.ITALIC,30));
       jbtExit.setOpaque(false);
       jbtExit.setContentAreaFilled(false);
       jbtExit.setBorderPainted(false);
       add(jbtExit);
       
       Call_Last_Window_Leave.ContinueListener cl=new Call_Last_Window_Leave.ContinueListener();
       jbtContinue.addActionListener(cl);
       jbtExit.addActionListener(cl);
       
    }
    @Override 
    public void paintComponent(Graphics g)
    {
       super.paintComponent(g);
       g.setColor(Color.YELLOW);
       g.setFont(new Font("Sans",Font.BOLD+Font.ITALIC,35));
       g.drawString("You Won "+Call_Question_Answer.score+" $", getWidth()/2-125, getHeight()/2);
    }
 }
    class ContinueListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==jbtExit)
                System.exit(1);
            else if(e.getSource()==jbtContinue)
            {
               dispose();
               new Call_Question_Answer();
            }
        }
    }
    
    
}

