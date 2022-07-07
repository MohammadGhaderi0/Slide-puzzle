
package main;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class RecordHa extends  CodhayeMoshtarak{  
    
// AjZaye Darone Safhe           
        public JButton Khane; 
        public JTable Recordha;                    
        public String[] RadifeAval=new String[] {"زمان","نام"};
        
// Sazandeye Frame      
        public RecordHa(String[][] BaghiyeRadifHa)  {        
                                
                
                    
// Sakhte Yek Nemone Az Dokmeha Be Hamrahe Nameshoon     
                    Khane = new JButton("برگشت");
                    Recordha=new JTable(BaghiyeRadifHa,RadifeAval);
                    
// Andaze Va Mokhtasate Dokmeha
                    Khane.setBounds(150,500,150,50);
            
// Taghire Font Va Andaze va Style Dokme ha             
                    Khane.setFont(new Font("homa", Font.BOLD, 25));
                    
// Halate Focus Ra Az Dokmeha Bar Midarad                 
                    Khane.setFocusable(false);                    
                  
// Ezafe Kardan Ajza Be Frame => Aval Bayad Dokme Ezafe Shavad Ta Be Error Nakhorim                 
                     add(Khane);
                     add (new JScrollPane(Recordha));

                     getContentPane().setBackground(Color.BLUE);
        
// Ghabeliat Didane Frame      
                     setVisible(true);    

                     
// Baraye Dokme Ha Yek Action  Ezafe Mikonam                          
                      Khane.addActionListener(new ActionListener(){
                                public void actionPerformed(ActionEvent e){
                
                                new SafheyeAval();

// Safheye Ghabli ra Mibandad                
                                setVisible(false);
         }
        });
                   
    }
        
}
