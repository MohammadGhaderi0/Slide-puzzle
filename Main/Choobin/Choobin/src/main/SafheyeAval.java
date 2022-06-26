package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SafheyeAval extends JFrame{
    
// AjZaye Darone Safhe        
        public JButton Asan;
        public JButton Sakht;
        public JButton RekordHa;
        public JButton BarnameNevisan;
        
// Sazandeye Frame      
    public  SafheyeAval(){
       
        super("Welcom to Choobin Pazel");
                
// Andaze Frame
        setSize(500,700);
       
// Miare Markaz Safhe ==> https://stackoverflow.com/questions/144892/how-to-center-a-window-in-java
        setLocationRelativeTo(null);

// Chegoonegie Baste Shodan Safhe
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
// Sakhte Yek Nemone Az Dokmeha Be Hamrahe Nameshoon
        Asan = new JButton("آسان");
        Sakht = new JButton("سخت");
        RekordHa = new JButton("رکوردها"); 
        BarnameNevisan = new JButton("برنامه نويسان");     
 
        
        Asan.setBackground(Color.pink);
        
// Andaze Va Mokhtasate Dokmeha
        Asan.setBounds(100,100,100,100);
        Sakht.setBounds(200,200,100,100);
        RekordHa.setBounds(300,300,100,100);
        BarnameNevisan.setBounds(40,400,100,100);
//        Asan.setFocusable(false);
//        Sakht.setFocusable(false);
//        RekordHa.setFocusable(false);
//        BarnameNevisan.setFocusable(false);
// Ezafe Kardan Dokmeha Be Panel       
        add(Asan);
        add(Sakht);
        add(RekordHa);
        add(BarnameNevisan);       
        
// Taghire Rangge Pas Zamine
        getContentPane().setBackground(Color.pink);
        
// Laye Bandie Panel
        setLayout(null);

// Ghabeliat Didane Frame      
        setVisible(true);
 
        
// Baraye Dokme Ha Yek  Ezafe Mikonam     

        Asan.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new EASYpage2();

// Safheye Ghabli ra Mibandad         
                setVisible(false);
         }
        });
        
        
        Sakht.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new EASYpage2();
          
// Safheye Ghabli ra Mibandad         
                setVisible(false);
         }
        });
        
        
        RekordHa.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new EASYpage2();

// Safheye Ghabli ra Mibandad                 
                setVisible(false);
         }
        });
        
        
        BarnameNevisan.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new EASYpage2();

// Safheye Ghabli ra Mibandad                
                setVisible(false);
         }
        });

    }
}
