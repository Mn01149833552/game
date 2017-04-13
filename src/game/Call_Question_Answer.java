package game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Call_Question_Answer extends JFrame {

    private String correctChoice ="";
    private JButton jbtAnswer1;
    private JButton jbtAnswer2;
    private JButton jbtAnswer3;
    private JButton jbtAnswer4;
   private String question="", cho1="", cho2="", cho3="", cho4="";
   private int []scores={
   100,200,300,500,1000,
   2000,4000,8000,16000,32000,
   64000,125000,250000,500000,1000000
   };
   private int []visited;
   public static int score=0;
   private int random_Number;
   public static int count;
    public Call_Question_Answer() {
        
        setTitle("من سيربح المليون");
        setSize(550, 625);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
          //Visited 
        visited=new int [50];
        for(int i=0;i<50;i++)
            visited[i]=0;
       //Counter
        count=0;
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        Score s = new Score();
        s.setBackground(Color.BLACK);
        s.setBounds(0, 0, 100, 315);
        
        Helper_Buttons h = new Helper_Buttons();
        h.setBackground(Color.BLACK);
        h.setBounds(100, 0, 450, 315);
        
        Question_Answer q = new Question_Answer();
        q.setBackground(Color.BLACK);
        q.setBounds(0, 315, 550, 310);
        
        panel.add(s);
        panel.add(h);
        panel.add(q);
        add(panel);
    }
    public class Question_Answer extends JPanel {

        private JLabel jlblQuestion;
       

        public Question_Answer() {
            this.setLayout(null);
            Call_Question_Answer.score = 0;
            this.fillQuestion();
            try {
                this.setQuestions_Answer();
            } catch (Exception e) {
            }
            add_Listener();
        }

        public void add_Listener() {
            ButtonsActions listener = new ButtonsActions();
            jbtAnswer1.addActionListener(listener);
            jbtAnswer2.addActionListener(listener);
            jbtAnswer3.addActionListener(listener);
            jbtAnswer4.addActionListener(listener);
        }

        public void fillQuestion() {
            //Question
            jlblQuestion = new JLabel();
            jlblQuestion.setBounds(85, 35, 385, 55);
            jlblQuestion.setFont(new Font("Sans", Font.BOLD + Font.ITALIC, 15));
            jlblQuestion.setForeground(Color.YELLOW);
            jlblQuestion.setHorizontalAlignment(JLabel.RIGHT);
            jlblQuestion.setCursor(new Cursor(Cursor.TEXT_CURSOR));
            add(jlblQuestion);
            //Chioce  1 
            jbtAnswer1 = new JButton();
            jbtAnswer1.setBounds(60, 135, 180, 40);
            jbtAnswer1.setForeground(Color.YELLOW);
            jbtAnswer1.setOpaque(true);
            jbtAnswer1.setCursor(new Cursor(Cursor.HAND_CURSOR));
            jbtAnswer1.setBorderPainted(false);
            jbtAnswer1.setContentAreaFilled(false);
            add(jbtAnswer1);
            //Choice 2
            jbtAnswer2 = new JButton();
            jbtAnswer2.setBounds(310, 135, 190, 40);
            jbtAnswer2.setForeground(Color.YELLOW);
            jbtAnswer2.setOpaque(true);
            jbtAnswer2.setCursor(new Cursor(Cursor.HAND_CURSOR));
            jbtAnswer2.setBorderPainted(false);
            jbtAnswer2.setContentAreaFilled(false);
            add(jbtAnswer2);
            //Choice 3
            jbtAnswer3 = new JButton();
            jbtAnswer3.setBounds(60, 215, 180, 40);
            jbtAnswer3.setForeground(Color.YELLOW);
            jbtAnswer3.setOpaque(true);
            jbtAnswer3.setCursor(new Cursor(Cursor.HAND_CURSOR));
            jbtAnswer3.setBorderPainted(false);
            jbtAnswer3.setContentAreaFilled(false);
            add(jbtAnswer3);
            //choice 4
            jbtAnswer4 = new JButton();
            jbtAnswer4.setBounds(310, 215, 190, 40);
            jbtAnswer4.setForeground(Color.YELLOW);
            jbtAnswer4.setOpaque(true);
            jbtAnswer4.setCursor(new Cursor(Cursor.HAND_CURSOR));
            jbtAnswer4.setBorderPainted(false);
            jbtAnswer4.setContentAreaFilled(false);
            add(jbtAnswer4);
        }
       
        public void setQuestions_Answer() throws FileNotFoundException {
            int number;
            File fileQuest = new File("src/game/folder/question.txt");
            File fileCho = new File("src/game/folder/choice.txt");
            File fileAns = new File("src/game/folder/answer.txt");

            Scanner scnQ = new Scanner(fileQuest);
            Scanner scnC = new Scanner(fileCho);
            Scanner scnA = new Scanner(fileAns);
            random_Number = (int) (Math.random() * 48);
            while(visited[random_Number]==1)
            {
               random_Number = (int) (Math.random() * 48);
            }
            
            //Questions
            number = scnQ.nextInt();
            question = scnQ.nextLine();
            while (random_Number != number) {
                number = scnQ.nextInt();
                question = scnQ.nextLine();
            }
            jlblQuestion.setText(question);
            //Choice 
            number = scnC.nextInt();
            cho1 = scnC.next();
            cho2 = scnC.next();
            cho3 = scnC.next();
            cho4 = scnC.next();
            while (random_Number != number) {
                number = scnC.nextInt();
                cho1 = scnC.next();
                cho2 = scnC.next();
                cho3 = scnC.next();
                cho4 = scnC.next();
            }
            jbtAnswer1.setText(cho1+"  A");
            jbtAnswer2.setText(cho2+"  B");
            jbtAnswer3.setText(cho3+"  C");
            jbtAnswer4.setText(cho4+"  D");
            //Correct Choice 
            number = scnA.nextInt();
            correctChoice  = scnA.next();
            while (random_Number != number) {
                number = scnA.nextInt();
                correctChoice = scnA.next();
            }
            scnQ.close();
            scnC.close();
            scnA.close();
            visited[random_Number]=1;
            if(correctChoice.equals(cho1))
                Chart.correct_Chart=1;
            else if(correctChoice.equals(cho2))
                Chart.correct_Chart=2;
            else if(correctChoice.equals(cho3))
                Chart.correct_Chart=3;
            else if(correctChoice.equals(cho4))
                Chart.correct_Chart=4;
        }

        
        //Graph 
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLUE);

            // Graph Question
            for (int i = 0; i < 10; i++) {
                g.drawLine(0, 50 + i, 75, 50 + i);
                g.drawLine(i + 75, 25, i + 75, 85);
                g.drawLine(75, 20 + i, 475, 20 + i);
                g.drawLine(75, 85 + i, 475, 85 + i);
                g.drawLine(475, 50 + i, 550, 50 + i);
                g.drawLine(475 + i, 20, 475 + i, 94);
            }

            // Graph Frist Two choices
            for (int i = 0; i < 10; i++) {
                g.drawLine(0, 150 + i, 50, 150 + i);
                g.drawLine(50 + i, 125, 50 + i, 175);
                g.drawLine(50, 125 + i, 240, 125 + i);
                g.drawLine(50, 175 + i, 240, 175 + i);
                g.drawLine(240 + i, 125, 240 + i, 184);
                g.drawLine(250, 150 + i, 300, 150 + i);
                g.drawLine(300 + i, 125, 300 + i, 175);
                g.drawLine(300, 125 + i, 500, 125 + i);
                g.drawLine(300, 175 + i, 500, 175 + i);
                g.drawLine(500 + i, 125, 500 + i, 184);
                g.drawLine(510, 150 + i, 550, 150 + i);

            }

            // Graph Second Two choices
            for (int i = 0; i < 10; i++) {
                g.drawLine(0, 230 + i, 50, 230 + i);
                g.drawLine(50 + i, 205, 50 + i, 255);
                g.drawLine(50, 205 + i, 240, 205 + i);
                g.drawLine(50, 255 + i, 240, 255 + i);
                g.drawLine(240 + i, 205, 240 + i, 264);
                g.drawLine(250, 230 + i, 300, 230 + i);
                g.drawLine(300 + i, 205, 300 + i, 255);
                g.drawLine(300, 205 + i, 500, 205 + i);
                g.drawLine(300, 255 + i, 500, 255 + i);
                g.drawLine(500 + i, 205, 500 + i, 264);
                g.drawLine(510, 230 + i, 550, 230 + i);

            }
        }
          
        ////Action Listener
        class ButtonsActions implements ActionListener {
            
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == jbtAnswer1) 
                {
                    if (correctChoice.equals(cho1)) {
                        jbtAnswer1.setBackground(Color.GREEN);
                         if(count<14)
                           Call_Question_Answer.score=scores[count++];
                        
                        else
                        {
                             Call_Question_Answer.score=scores[count++];
                            dispose();
                            new Call_Last_Window();
                        }                        
                        jbtAnswer1.setVisible(true);
                        jbtAnswer2.setVisible(true);
                        jbtAnswer3.setVisible(true);
                        jbtAnswer4.setVisible(true);
                        
                        try {
                            setQuestions_Answer();
                            Score.draw_Count=Call_Question_Answer.count;

                        } catch (Exception ex) {
                        }
                
                    } else {
                        jbtAnswer1.setBackground(Color.RED);
                        dispose();
                        new Call_Last_Window();
                    }
//                   JOptionPane.showMessageDialog(null, jbtAnswer1.getText());
                }
                else if (e.getSource() == jbtAnswer2) 
                {
                    if (correctChoice.equals(cho2)) {
                        jbtAnswer2.setBackground(Color.GREEN);
                        
                         jbtAnswer1.setVisible(true);
                        jbtAnswer2.setVisible(true);
                        jbtAnswer3.setVisible(true);
                        jbtAnswer4.setVisible(true);
                         if(count<14)
                           Call_Question_Answer.score=scores[count++];
                        
                        else
                        {
                             Call_Question_Answer.score=scores[count++];
                            dispose();
                            new Call_Last_Window();
                        }
                        try {
                            setQuestions_Answer();
                             Score.draw_Count=Call_Question_Answer.count;
//                            repaint();
                        } catch (Exception ex) {
                        }
                   
                    } else {
                        jbtAnswer2.setBackground(Color.RED);
                        dispose();
                        new Call_Last_Window();
                    }

                } 
                else if (e.getSource() == jbtAnswer3) 
                {
                    if (correctChoice.equals(cho3)) {
                        jbtAnswer3.setBackground(Color.GREEN);
                        if(count<14)
                           Call_Question_Answer.score=scores[count++];
                        
                        else
                        {
                             Call_Question_Answer.score=scores[count++];
                            dispose();
                            new Call_Last_Window();
                        }
                        jbtAnswer1.setVisible(true);
                        jbtAnswer2.setVisible(true);
                        jbtAnswer3.setVisible(true);
                        jbtAnswer4.setVisible(true);
                        try {
                            
                            setQuestions_Answer();
                             Score.draw_Count=Call_Question_Answer.count;
//                            repaint();
                        } catch (Exception ex) {
                        }
                    
                    } else {
                        jbtAnswer3.setBackground(Color.RED);
                        dispose();
                        new Call_Last_Window();
                    }

                }
                else 
                {
                    if (correctChoice.equals(cho4)) {

                        jbtAnswer4.setBackground(Color.GREEN);
                        jbtAnswer1.setVisible(true);
                        jbtAnswer2.setVisible(true);
                        jbtAnswer3.setVisible(true);
                        jbtAnswer4.setVisible(true);
                        if(count<14)
                           Call_Question_Answer.score=scores[count++];
                        
                        else
                        {
                             Call_Question_Answer.score=scores[count++];
                            dispose();
                            new Call_Last_Window();
                        }
                        try {
                            setQuestions_Answer();
                             Score.draw_Count=Call_Question_Answer.count;
//                            repaint();
                        } catch (Exception ex) {
                        }
                      
                    } else {
                        jbtAnswer4.setBackground(Color.GRAY);
                        dispose();
                        new Call_Last_Window();
                    }

                }

            }
        }
    }

    public class Helper_Buttons extends JPanel {

        ImageIcon image1 = new ImageIcon("src/game/folder/image1.png");
        ImageIcon image2 = new ImageIcon("src/game/folder/image2.png");
        ImageIcon image3 = new ImageIcon("src/game/folder/image3.png");
        ImageIcon image4 = new ImageIcon("src/game/folder/image4.png");
        ImageIcon image5 = new ImageIcon("src/game/folder/image5.png");
        private JButton jbtPeople;
        private JButton jbthalf;
        private JButton jbtTelpone;
        private JButton jbtLeave;
        private JLabel jlblImage;
        private JPanel panel;

        public Helper_Buttons() {
            panel = new JPanel(new GridLayout(4, 1));
            panel.setSize(450, 315);
            setLayout(new BorderLayout());
            jlblImage = new JLabel(image1);
            jlblImage.setBounds(0, 0, 250, 310);

            add(jlblImage, BorderLayout.CENTER);

            jbtPeople = new JButton(image2);
            jbtPeople.setBounds(0, 0, 200, 65);
            jbtPeople.setOpaque(true);
            jbtPeople.setBorderPainted(false);
            jbtPeople.setContentAreaFilled(false);
            jbtPeople.setCursor(new Cursor(Cursor.HAND_CURSOR));
            panel.add(jbtPeople);

            jbtTelpone = new JButton(image4);
            jbtTelpone.setBounds(0, 0, 200, 65);
            jbtTelpone.setOpaque(true);
            jbtTelpone.setBorderPainted(false);
            jbtTelpone.setCursor(new Cursor(Cursor.HAND_CURSOR));
            jbtTelpone.setContentAreaFilled(false);
            panel.add(jbtTelpone);

            jbthalf = new JButton(image3);
            jbthalf.setBounds(0, 0, 200, 65);
            jbthalf.setOpaque(true);
            jbthalf.setCursor(new Cursor(Cursor.HAND_CURSOR));
            jbthalf.setBorderPainted(false);
            jbthalf.setContentAreaFilled(false);
            panel.add(jbthalf);

            jbtLeave = new JButton(image5);
            jbtLeave.setBounds(0, 0, 200, 65);
            jbtLeave.setCursor(new Cursor(Cursor.HAND_CURSOR));
            jbtLeave.setOpaque(true);
            jbtLeave.setBorderPainted(false);
            jbtLeave.setContentAreaFilled(false);
            panel.add(jbtLeave, BorderLayout.NORTH);

            panel.setOpaque(true);
            panel.setBackground(Color.BLACK);
            add(panel, BorderLayout.EAST);
          
            //Add Actions
             HelpButtonLisener help=new HelpButtonLisener();
             jbthalf.addActionListener(help);
             jbtLeave.addActionListener(help);
             jbtPeople.addActionListener(help);
             jbtTelpone.addActionListener(help);
           
        }


        class HelpButtonLisener implements ActionListener {
            boolean clicked_People=true; 
            boolean clicked_Telphone=true; 
            boolean clicked_Half=true; 

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==jbtLeave)
                {
                   dispose();
                   new Call_Last_Window_Leave();
                }
                else if(e.getSource()==jbtPeople) 
                {
                    if(clicked_People)
                    {
                         new Chart();
                         clicked_People=false;
                         jbtPeople.add(new X());
                    }
                }
                else if(e.getSource()==jbtTelpone)
                {
                    if(clicked_Telphone)
                    {
                       JOptionPane.showMessageDialog(null, "الاجابة الصحيحة من المحتمل ان تكون  "+correctChoice);
                       clicked_Telphone=false;
                       jbtTelpone.add(new X());
                    }
                }
                else 
                {
                     if(clicked_Half)
                     {
                        
                          if ((correctChoice.trim()).equals((cho1.trim())))
                          {
                              jbtAnswer2.setVisible(false);
                               jbtAnswer4.setVisible(false);
                           }
                             else if ((correctChoice.trim()).equals((cho2.trim()))) 
                           {
                                 jbtAnswer1.setVisible(false);
                                 jbtAnswer4.setVisible(false);
                             }
                           else if ((correctChoice.trim()).equals((cho3.trim()))) 
                                {
                                  jbtAnswer2.setVisible(false);
                                jbtAnswer4.setVisible(false);
                                }
                                else if ((correctChoice.trim()).equals((cho4.trim())))
                                 {
                                  jbtAnswer1.setVisible(false);
                                   jbtAnswer3.setVisible(false);
                                }

                                       clicked_Half=false;
                                        jbthalf.add(new X());
                     }  
                 }

            }  //actionPerformed
        }//HelperButton Listener

    }//Helper_Buttons
}
