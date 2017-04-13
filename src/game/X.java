
package game;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class X extends JPanel{
    public X()
    {
        setSize(180, 65);
        setOpaque(false);
    }

            @Override
             public void paintComponent(Graphics g)
             {
                 super.paintComponent(g);
                  g.setColor(Color.RED);
                 for(int i=0;i<10;i++)
                 {      
                    g.drawLine(i+0, 0,(getWidth()-10)+i, getHeight());
                     g.drawLine(i+(getWidth()-10), 0,0+i, getHeight());
                   }
               }           
}
