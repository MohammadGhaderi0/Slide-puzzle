
package main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class EASYpage2 extends CodhayeMoshtarak{

    public JButton three;
    public JButton four;
    public JButton five;
    public JButton home;
    

    public EASYpage2(){

        three = new JButton("3 X 3");    
        four = new JButton("4 x 4");
        five = new JButton("5 x 5");    
        home = new JButton("برگشت");
        getContentPane().setBackground(new Color(41, 52, 74)); 
        three.setBounds(67,150,150,50);
        four.setBounds(267,150,150,50);
        five.setBounds(267,350,150,50);
        home.setBounds(67,350,150,50);
        home.setFont(new Font("homa ", Font.BOLD, 25));
        
        
        three.setBackground(new Color(0,160,96));
        four.setBackground(new Color(0,160,96));
        five.setBackground(new Color(0,160,96));
        home.setBackground(new Color(0,160,96));
        three.setForeground(Color.WHITE);
        four.setForeground(Color.WHITE);
        five.setForeground(Color.WHITE);
        home.setForeground(Color.WHITE);
        
        three.setFocusable(false);
        four.setFocusable(false);
        five.setFocusable(false);
        home.setFocusable(false);
        
        add(three);        
        add(four);
        add(five);
        add(home);
        
        

        
        home.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                new SafheyeAval();              
                setVisible(false);
         }
        });
        three.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new game3x3easy();                          
                setVisible(false);
                
         }
        });
        four.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new game4x4easy();                          
                setVisible(false);
         }
        });
        
         five.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new Asan5Dar5();                          
                setVisible(false);
         }
        });
        
		
		
	
        
    }}

