
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
        
        super("Welcom to Choobin Pazel"); 
        
// Andaze Frame       
        setSize(500,700);        
        
// Chegoonegie Baste Shodan Safhe        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

// Miare Markaz Safhe ==> https://stackoverflow.com/questions/144892/how-to-center-a-window-in-java  
        setLocationRelativeTo(null);
        
// Sakhte Yek Nemone Az Dokmeha Be Hamrahe Nameshoon        
        SeDarSe= new JButton("3x3");    
        ChaharDarChahar = new JButton("4x4");
        PanjDarPanj = new JButton("5x5");  
        Khane = new JButton("خانه");  
        
        
        getContentPane().setBackground(Color.lightGray);
        
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
