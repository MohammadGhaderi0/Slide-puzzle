
package main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;


public class DokmeHa extends CodhayeMoshtarak{
    
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
    public JButton stop;
    public JButton restart;
    public JButton rahnama;
         public   DokmeHa(){
       
            btn1 =new JButton("1");
            btn2 =new JButton("2");
            btn3 =new JButton("3");
            btn4 =new JButton("4");
            btn5 =new JButton("5");
            btn6 =new JButton("6");
            btn7 =new JButton("7");
            btn8 =new JButton("8");
            back = new JButton("برگشت");
            stop = new JButton("توقف");
            restart = new JButton("شروع");
            rahnama =new JButton("?");
             
            back.setFont(new Font("homa ", Font.BOLD, 25));
            restart.setFont(new Font("homa ", Font.BOLD, 25));
            stop.setFont(new Font("homa ", Font.BOLD, 25));
            rahnama.setFont(new Font("Verdana",Font.PLAIN,20));
        
            back.setBounds(310,555,100,50);
            stop.setBounds(70,555,100,50);
            restart.setBounds(70,555,100,50);
            rahnama.setBounds(420,25,50,50);
        
        
        
            back.setBackground(new Color(0,160,96));
            stop.setBackground(new Color(0,160,96));
            restart.setBackground(new Color(0,160,96));
            rahnama.setBackground(new Color(0,160,96));
            back.setForeground(Color.WHITE);
            stop.setForeground(Color.WHITE);
            restart.setForeground(Color.WHITE);
            rahnama.setForeground(Color.WHITE);
        
        
            add(btn1);
            add(btn2);
            add(btn3);
            add(btn4);
            add(btn5);
            add(btn6);
            add(btn7);
            add(btn8);
            add(back);
            add(stop);
            add(restart);
            add(rahnama);
            restart.setFocusable(false);
            stop.setFocusable(false);
            back.setFocusable(false);
            btn1.setFocusable(false);
            btn2.setFocusable(false);
            btn3.setFocusable(false);
            btn4.setFocusable(false);
            btn5.setFocusable(false);
            btn6.setFocusable(false);
            btn7.setFocusable(false);
            btn8.setFocusable(false);
            rahnama.setFocusable(false);
            stop.setVisible(false);
              
         }
         
}
