
package main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class DokmeHa extends JFrame{
    
    public JButton btn1;
    public JButton btn2;
    public JButton btn3;
    public JButton btn4;
    public JButton btn5;
    public JButton btn6;
    public JButton btn7;
    public JButton btn8;
    public JButton btn9;

    public JButton back;
    public JButton restart;
    
         public   DokmeHa(){
               super("15 Puzzle");
               
               // Andaze Frame
                   setSize(500,700);

// Miare Markaz Safhe ==> https://stackoverflow.com/questions/144892/how-to-center-a-window-in-java
        setLocationRelativeTo(null);

// Chegoonegie Baste Shodan Safhe
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        getContentPane().setBackground(new Color(41, 52, 74));
        
        setLayout(null);
        
        setVisible(true);
               
        btn1 =new JButton("1");
        btn2 =new JButton("2");
        btn3 =new JButton("3");
        btn4 =new JButton("4");
        btn5 =new JButton("5");
        btn6 =new JButton("6");
        btn7 =new JButton("7");
        btn8 =new JButton("8");
        btn9 =new JButton("9");
        back = new JButton("برگشت");
        restart = new JButton("شروع مجدد");

        back.setBounds(320,570,100,50);
        restart.setBounds(200,570,100,50);
        
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn7);
        add(btn8);
        add(btn9);
        add(back);
        add(restart);
        

        
              
         }
         
}
