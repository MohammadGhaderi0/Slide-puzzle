
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
    public JButton start;
    public JButton stop;
    public JButton restart;
    
         public   DokmeHa(){

               
        btn1 =new JButton("1");
        btn2 =new JButton("2");
        btn3 =new JButton("3");
        btn4 =new JButton("4");
        btn5 =new JButton("5");
        btn6 =new JButton("6");
        btn7 =new JButton("7");
        btn8 =new JButton("8");
        btn9 =new JButton(" ");
        back = new JButton("برگشت");
        start = new JButton("شروع");
        stop = new JButton("توقف");
        restart = new JButton("از نو");
             
        back.setFont(new Font("homa ", Font.BOLD, 25));
        start.setFont(new Font("homa ", Font.BOLD, 25));
        restart.setFont(new Font("homa ", Font.BOLD, 25));
        stop.setFont(new Font("homa ", Font.BOLD, 25));
             
        back.setBounds(310,570,100,50);
        start.setBounds(165,510,150,50);
        stop.setBounds(70,570,100,50);
        restart.setBounds(190,570,100,50);
        
        
        
        back.setBackground(new Color(0,160,96));
        start.setBackground(new Color(0,160,96));
        stop.setBackground(new Color(0,160,96));
        restart.setBackground(new Color(0,160,96));
        back.setForeground(Color.WHITE);
        stop.setForeground(Color.WHITE);
        start.setForeground(Color.WHITE);
        restart.setForeground(Color.WHITE);
        
        
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
        add(start);
        add(stop);
        add(restart);

        
              
         }
         
}
