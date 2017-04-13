package game;

import javax.swing.JFrame;

public class Game extends JFrame{
    public Game()
    {
      add(new Start_Page());  
    }

  
    public static void main(String[] args) {
        
        Call_Start_Page c=new Call_Start_Page();
        c.setVisible(true);
    }
}
