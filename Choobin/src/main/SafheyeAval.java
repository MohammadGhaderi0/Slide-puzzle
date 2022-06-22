package main;

import javax.swing.*;

import java.awt.*;


public class SafheyeAval extends JFrame  {

  // Sazandeye Frame      
    SafheyeAval(){
       
        super("Welcom to Choobin Pazel");
        
// Laye Bandie Frame
        setLayout(new FlowLayout());
        
// Andaze Frame
        setSize(500,700);
        
// Miare Markaz Safhe ==> https://stackoverflow.com/questions/144892/how-to-center-a-window-in-java
        setLocationRelativeTo(null);

// Chegoonegie Baste Shodan Safhe
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

// Ezafe Kardan Panel Be Frame               
        add(new PanelSafheyeAval()); 
        
// Ghabeliat Didane Frame      
        setVisible(true);

    }
    
    
    
}
