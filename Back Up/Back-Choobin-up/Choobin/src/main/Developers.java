package main;

import java.awt.Color;
import javax.swing.BorderFactory;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

public class Developers extends CodhayeMoshtarak{
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JButton back;

 //   Border lineborder;
    public Developers(){
    
        getContentPane().setBackground(new Color(41, 52, 74));

        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        back = new JButton("برگشت");  

        
        
        label1.setText("سازندگان:");
        label2.setText("محمد قادري");
        label4.setText("<=>");
        label3.setText("اميرحسين حسين زاده فخاري");
        
        label1.setFont(new Font("homa", Font.BOLD, 40));
        label2.setFont(new Font("homa ", Font.BOLD, 25));
        label3.setFont(new Font("homa ", Font.BOLD, 25));
        label4.setFont(new Font("homa ", Font.BOLD, 25));
        
        
         back.setBounds(320,570,100,50);
         back.setFocusable(false);
         back.setFont(new Font("homa ", Font.BOLD, 25));
         back.setBackground(new Color(0,160,96));
         back.setForeground(Color.WHITE);




        
        add(label1);
        add(label2);
        add(label3);
        add(label4);
        add(back);

        
        
        label1.setBounds(165,180,200,100);
        label2.setBounds(340,250,400,100);
        label3.setBounds(30,250,300,100);
        label4.setBounds(280,250,50,100);
        
        
        label4.setForeground(Color.CYAN);
        label3.setForeground(Color.YELLOW);
        label2.setForeground(Color.red);
        label1.setForeground(Color.GREEN);
        
        
       // lineborder = BorderFactory.createLineBorder(Color.green);
        
        
         back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                new SafheyeAval();

                setVisible(false);
         }
        });
        
        
}}
