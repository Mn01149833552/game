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


public class Call_Start_Page extends JFrame {

    public Call_Start_Page() {
        setTitle("من سيربح المليون");
        setSize(550, 625);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        add(new Start_Page());
    }

    public class Start_Page extends JPanel {

        private JButton jbtStart; 
        private JButton jbtHelp;
        private JButton jbtExit;
        ImageIcon icon = new ImageIcon("src/game/folder/image8.jpeg");
        Image image = icon.getImage();

        public Start_Page() {
            setLayout(null);
            define_component();
           //Actions 
            Buttons_Listener btn = new Buttons_Listener();
            jbtExit.addActionListener(btn);
             jbtStart.addActionListener(btn);
            jbtHelp.addActionListener(btn);
        }

        public void define_component() {
           
            jbtStart = new JButton("Start");
            jbtStart.setBounds(170, 200, 200, 70);
            jbtStart.setOpaque(true);
            jbtStart.setFont(new Font("Sans", Font.BOLD + Font.ITALIC, 35));
            jbtStart.setForeground(Color.YELLOW);
            jbtStart.setBorderPainted(false);
            jbtStart.setContentAreaFilled(false);
            jbtStart.setCursor(new Cursor(Cursor.HAND_CURSOR));
            add(jbtStart);


            jbtHelp = new JButton("Help");
            jbtHelp.setBounds(170, 300, 200, 70);
            jbtHelp.setOpaque(true);
            jbtHelp.setFont(new Font("Sans", Font.BOLD + Font.ITALIC, 35));
            jbtHelp.setForeground(Color.YELLOW);
            jbtHelp.setBorderPainted(false);
            jbtHelp.setContentAreaFilled(false);
            jbtHelp.setCursor(new Cursor(Cursor.HAND_CURSOR));
            add(jbtHelp);

            jbtExit = new JButton("Exit");
            jbtExit.setBounds(170, 400, 200, 70);
            jbtExit.setOpaque(true);
            jbtExit.setFont(new Font("Sans", Font.BOLD + Font.ITALIC, 35));
            jbtExit.setForeground(Color.YELLOW);
            jbtExit.setBorderPainted(false);
            jbtExit.setContentAreaFilled(false);
            jbtExit.setCursor(new Cursor(Cursor.HAND_CURSOR));
            add(jbtExit);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        }

        class Buttons_Listener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==jbtExit)
                   System.exit(0);
                else if(e.getSource()==jbtHelp)
                    new Help();
                else if(e.getSource()==jbtStart)
                {  
                        dispose();
                        new Call_Question_Answer();

                }
            }
        }

        
        
    }
}
