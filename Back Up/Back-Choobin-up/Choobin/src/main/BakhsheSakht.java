
package main;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class BakhsheSakht extends JFrame{ 

        public JButton SeDarSe;
        public JButton ChaharDarChahar;
        public JButton PanjDarPanj;
        public JButton Khane;
        

        public BakhsheSakht(){
        
        super("15 Puzzle"); 
              // Andaze Frame
                   setSize(500,700);

// Miare Markaz Safhe ==> https://stackoverflow.com/questions/144892/how-to-center-a-window-in-java
        setLocationRelativeTo(null);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        getContentPane().setBackground(new Color(41, 52, 74));
        
   
        
// Sakhte Yek Nemone Az Dokmeha Be Hamrahe Nameshoon        
        SeDarSe= new JButton("3 X 3");    
        ChaharDarChahar = new JButton("4 x 4");
        PanjDarPanj = new JButton("5 x 5");  
        Khane = new JButton("برگشت");  
        
        
        
        getContentPane().setBackground(new Color(41, 52, 74));
        
// Andaze Va Mokhtasate Dokmeha        
        SeDarSe.setBounds(67,150,150,50);
        ChaharDarChahar.setBounds(267,150,150,50);
        PanjDarPanj.setBounds(267,350,150,50);
        Khane.setBounds(67,350,150,50);
        
                
// Taghire Font Va Andaze va Style Dokme ha             
        Khane.setFont(new Font("homa", Font.BOLD, 25));
                
                
 // Rangge Pas Zamine Avaz Mishe                        
        SeDarSe.setBackground(new Color(0,160,96));
        ChaharDarChahar.setBackground(new Color(0,160,96));
        PanjDarPanj.setBackground(new Color(0,160,96));
        Khane.setBackground(new Color(0,160,96));
        

// Halate Focus Az Roye Dokme ha Bardashte Mishe            
        SeDarSe.setFocusable(false);
        ChaharDarChahar.setFocusable(false);
        PanjDarPanj.setFocusable(false);
        Khane.setFocusable(false);
        
        
 // Ranggesh Avaz Mishe                        
        SeDarSe.setForeground(Color.WHITE);
        ChaharDarChahar.setForeground(Color.WHITE);
        PanjDarPanj.setForeground(Color.WHITE);
        Khane.setForeground(Color.WHITE);
        
// Ezafe Kardan Dokmeha Be Frame       
        add(SeDarSe);        
        add(ChaharDarChahar);
        add(PanjDarPanj);       
        add(Khane); 
        
        
// Laye Bandie Panel
        setLayout(null); 
        
// Ghabeliat Didane Frame      
        setVisible(true);

                
        
// Baraye Dokme Ha Yek  Ezafe Mikonam     

        SeDarSe.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                new Sakht3Dar3();

// Safheye Ghabli ra Mibandad         
                setVisible(false);
         }
        });


        ChaharDarChahar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                new Sakht4Dar4();


// Safheye Ghabli ra Mibandad         
                setVisible(false);
         }
        });


        PanjDarPanj.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                new Sahkt5Dar5();

// Safheye Ghabli ra Mibandad                 
                setVisible(false);
         }
        });


        Khane.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                new SafheyeAval();

// Safheye Ghabli ra Mibandad                
                setVisible(false);
         }
        });
        
    }
}
