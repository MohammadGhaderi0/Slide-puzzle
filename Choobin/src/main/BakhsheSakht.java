
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
        
// Chegoonegie Baste Shodan Safhe        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

// Miare Markaz Safhe ==> https://stackoverflow.com/questions/144892/how-to-center-a-window-in-java  
        setLocationRelativeTo(null);
        
// Sakhte Yek Nemone Az Dokmeha Be Hamrahe Nameshoon        
        SeDarSe= new JButton("3 X 3");    
        ChaharDarChahar = new JButton("4 x 4");
        PanjDarPanj = new JButton("5 x 5");  
        Khane = new JButton("برگشت");  
        
        
        getContentPane().setBackground(new Color(41, 52, 74));
        
// Andaze Va Mokhtasate Dokmeha        
        SeDarSe.setBounds(100,100,100,100);
        ChaharDarChahar.setBounds(100,2,100,100);
        PanjDarPanj.setBounds(2,100,100,100);
        Khane.setBounds(2,10,100,100);
        
// Ezafe Kardan Dokmeha Be Frame       
        add(SeDarSe);        
        add(ChaharDarChahar);
        add(PanjDarPanj);       
        add(Khane);       
        
// Laye Bandie Panel
        setLayout(null); 
        
// Ghabeliat Didane Frame      
        setVisible(true);
        
        SeDarSe.setBackground(new Color(0,160,96));
        ChaharDarChahar.setBackground(new Color(0,160,96));
        PanjDarPanj.setBackground(new Color(0,160,96));
        Khane.setBackground(new Color(0,160,96));
        
        SeDarSe.setBounds(180,100,100,100);
        ChaharDarChahar.setBounds(180,210,100,100);
        PanjDarPanj.setBounds(180,320,100,100);
        Khane.setBounds(180,440,100,100);
        
        SeDarSe.setFocusable(false);
        ChaharDarChahar.setFocusable(false);
        PanjDarPanj.setFocusable(false);
        Khane.setFocusable(false);
        
        
        
        SeDarSe.setForeground(Color.WHITE);
        ChaharDarChahar.setForeground(Color.WHITE);
        PanjDarPanj.setForeground(Color.WHITE);
        Khane.setForeground(Color.WHITE);
        
        
// Baraye Dokme Ha Yek  Ezafe Mikonam     

        SeDarSe.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                new EASYpage2();

// Safheye Ghabli ra Mibandad         
                setVisible(false);
         }
        });


        ChaharDarChahar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                new BakhsheSakht();

// Safheye Ghabli ra Mibandad         
                setVisible(false);
         }
        });


        PanjDarPanj.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                new EASYpage2();

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
