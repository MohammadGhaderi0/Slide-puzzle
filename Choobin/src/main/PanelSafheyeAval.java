
package main;

import javax.swing.*;

import java.awt.*;

//import java.awt.event.*;


public class PanelSafheyeAval extends JPanel  {
    
     // AjZaye Darone Safhe         
        public JButton Asan;
        public JButton Sakht;
        public JButton RekordHa;
        public JButton BarnameNevisan;
    
        
    PanelSafheyeAval(){

        
// Laye Bandie Panel
        setLayout(new FlowLayout());

// Andaze Panel ==> https://stackoverflow.com/questions/1594423/setting-the-size-of-panels
        setPreferredSize(new Dimension(500, 700));
        
// Sakhte Yek Nemone Az Dokmeha
        Asan = new JButton();
        Sakht = new JButton();
        RekordHa = new JButton();
        BarnameNevisan = new JButton();
        
// Name Namayeshie Dokmeha Bad Az Ejra 
        Asan.setText("آسان");
        Sakht.setText("سخت");
        RekordHa.setText("رکوردها");
        BarnameNevisan.setText("برنامه نويسان");
        
// Andaze Va Mokhtasate Dokmeha


// Ezafe Kardan Dokmeha Be Panel       
        add(Asan);
        add(Sakht);
        add(RekordHa);
        add(BarnameNevisan);        

// Ghabeliat Didane Frame      
        setVisible(true);
        
        
        // Baraye Emtehan Gozashtam
        setBackground(Color.pink);

    }
    
}
