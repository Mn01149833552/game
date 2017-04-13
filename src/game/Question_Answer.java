package game;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Question_Answer extends JPanel{
    private JLabel jlblQuestion;
    private JButton jbtAnswer1;
    private JButton jbtAnswer2;
    private JButton jbtAnswer3;
    private JButton jbtAnswer4;
    public Question_Answer()
    {
        this.setLayout(null);
       // add(jbtAnswer1);    
        this.fillQuestion();
    }
    
    public void fillQuestion()
    {
          jlblQuestion=new JLabel("ما هي بلد المليون شهيد؟");
          jlblQuestion.setBounds(85, 35, 385 , 55);
          jlblQuestion.setFont(new Font("Sans",Font.BOLD+Font.ITALIC,20));
 //         jlblQuestion.setBackground(Color.YELLOW);
          jlblQuestion.setForeground(Color.YELLOW);
          jlblQuestion.setHorizontalAlignment(JLabel.RIGHT);
          add(jlblQuestion);
        
          jbtAnswer1 =new JButton("مصر");
          jbtAnswer1.setBounds(60, 135, 180, 40);
          jbtAnswer1.setForeground(Color.YELLOW);
          jbtAnswer1.setOpaque(true);
          jbtAnswer1.setCursor(new Cursor(Cursor.HAND_CURSOR));
          jbtAnswer1.setBorderPainted(false);
          jbtAnswer1.setContentAreaFilled(false);
          add(jbtAnswer1);
          
          jbtAnswer2 =new JButton("تونس");
          jbtAnswer2.setBounds(310, 135, 190, 40);
          jbtAnswer2.setForeground(Color.YELLOW);
          jbtAnswer2.setOpaque(true);
          jbtAnswer2.setCursor(new Cursor(Cursor.HAND_CURSOR));
          jbtAnswer2.setBorderPainted(false);
          jbtAnswer2.setContentAreaFilled(false);
          add(jbtAnswer2);
          
          jbtAnswer3 =new JButton("الجزائر");
          jbtAnswer3.setBounds(60, 215, 180, 40);
          jbtAnswer3.setForeground(Color.YELLOW);
          jbtAnswer3.setOpaque(true);
          jbtAnswer3.setCursor(new Cursor(Cursor.HAND_CURSOR));
          jbtAnswer3.setBorderPainted(false);
          jbtAnswer3.setContentAreaFilled(false);
          add(jbtAnswer3);
          
          jbtAnswer4 =new JButton("ليبيا");
          jbtAnswer4.setBounds(310, 215, 190, 40);
          jbtAnswer4.setForeground(Color.YELLOW);
          jbtAnswer4.setOpaque(true);
          jbtAnswer4.setCursor(new Cursor(Cursor.HAND_CURSOR));
          jbtAnswer4.setBorderPainted(false);
          jbtAnswer4.setContentAreaFilled(false);
          add(jbtAnswer4);
    }
    
     @Override 
    protected void paintComponent(Graphics g)
    {
       super.paintComponent(g);
       g.setColor(Color.BLUE);
       
       // Graph Question
       for(int i=0;i<10;i++)
       {
           g.drawLine(0, 50+i, 75, 50+i);
           g.drawLine(i+75, 25, i+75, 85);
           g.drawLine(75, 20+i, 475, 20+i);
           g.drawLine(75, 85+i, 475, 85+i);
           g.drawLine(475, 50+i, 550, 50+i);
           g.drawLine(475+i, 20, 475+i, 94);
       }
       
       // Graph Frist Two choices
       for(int i=0;i<10;i++)
       {
           g.drawLine(0, 150+i, 50, 150+i);
           g.drawLine(50+i, 125, 50+i, 175);
           g.drawLine(50, 125+i, 240, 125+i);
           g.drawLine(50, 175+i, 240, 175+i);
           g.drawLine(240+i, 125, 240+i, 184);
           g.drawLine(250, 150+i, 300, 150+i);
           g.drawLine(300+i, 125, 300+i, 175);
           g.drawLine(300, 125+i, 500, 125+i);
           g.drawLine(300, 175+i, 500, 175+i);
           g.drawLine(500+i, 125, 500+i, 184);
           g.drawLine(510, 150+i, 550, 150+i);
         
       }
       
       // Graph Second Two choices
       for(int i=0;i<10;i++)
       {
           g.drawLine(0, 230+i, 50, 230+i);
           g.drawLine(50+i, 205, 50+i, 255);
           g.drawLine(50, 205+i, 240, 205+i);
           g.drawLine(50, 255+i, 240, 255+i);
           g.drawLine(240+i, 205, 240+i, 264);
           g.drawLine(250, 230+i, 300, 230+i);
           g.drawLine(300+i, 205, 300+i, 255);
           g.drawLine(300, 205+i, 500, 205+i);
           g.drawLine(300, 255+i, 500, 255+i);
           g.drawLine(500+i, 205, 500+i, 264);
           g.drawLine(510, 230+i, 550, 230+i);
           
       }
       
      
    }
     
}
