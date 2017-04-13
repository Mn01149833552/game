
package game;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Chart extends JFrame
{
    public static int correct_Chart=0;
    public Chart()
    {
        setTitle("من سيربح المليون");
        setSize(200, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
         Chart_panel c=new Chart_panel(Chart.correct_Chart);
         add(c);
    }
public class Chart_panel extends JPanel{

    public Chart_panel(int cor)
    {  
        Chart.correct_Chart=cor;
        this.setSize(150, 150);
        this.setBackground(Color.BLACK);
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
       super.paintComponent(g);
       g.setColor(Color.YELLOW);
       g.drawLine(30, 10, 30, 130);
       g.drawLine(30, 130, 140, 130);
       g.setColor(Color.red);
       for(int i=0,y=100;i<5;i++,y-=20)
       {
          g.drawString(y+"", 5, 20+24*i);
       }
       g.drawString("0", 5, 130);
       g.drawString("A", 50, 145);
       g.drawString("B", 75, 145);
       g.drawString("C", 100, 145);
       g.drawString("D", 125, 145);
       
       switch(Chart.correct_Chart)
       {
           case 1:
               
               g.fill3DRect(45, 40, 15, 90, true);
               g.fill3DRect(70, 120, 15, 10, true);
               g.fill3DRect(95, 125, 15, 5, true);
               g.fill3DRect(120, 125, 15, 5, true);
               break;
           case 2:
               g.fill3DRect(45, 120, 15, 10, true);
               g.fill3DRect(70, 40, 15, 90, true);
               g.fill3DRect(95, 125, 15, 5, true);
               g.fill3DRect(120, 125, 15, 5, true);
               break;
           case 3:
                g.fill3DRect(45, 120, 15, 10, true);
               g.fill3DRect(70, 125, 15, 5, true);
               g.fill3DRect(95, 40, 15, 90, true);
               g.fill3DRect(120, 125, 15, 5, true);
               break;
           case 4:
               
               g.fill3DRect(45, 120, 15, 10, true);
               g.fill3DRect(70, 125, 15, 5, true);
               g.fill3DRect(95, 125, 15, 5, true);
               g.fill3DRect(120, 40, 15, 90, true);
               break;
       }
       
       
    }
            
}
}