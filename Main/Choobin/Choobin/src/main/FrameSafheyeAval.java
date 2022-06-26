
package main;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import java.awt.event.*;


public class FrameSafheyeAval extends JFrame implements ActionListener{
    
     // AjZaye Darone Safhe         
        public JButton Asan;
        public JButton Sakht;
        public JButton RekordHa;
        public JButton BarnameNevisan;
        public JPanel panel1;
    
        
    FrameSafheyeAval(){
             
        super("Welcom to Choobin Pazel");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(500,700);
        this.setLocationRelativeTo(null);
        this.add(panel1);
        this.setVisible(true);
        panel1 = new JPanel();

        
// Laye Bandie Panel
        panel1.setLayout(new FlowLayout());

// Andaze Panel ==> https://stackoverflow.com/questions/1594423/setting-the-size-of-panels
        panel1.setPreferredSize(new Dimension(500, 700));
        
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
        panel1.add(Asan);
        panel1.add(Sakht);
        panel1.add(RekordHa);
        panel1.add(BarnameNevisan); 
        
 // Turn off focusable
        Asan.setFocusable(false);
        Sakht.setFocusable(false);
        RekordHa.setFocusable(false);
        BarnameNevisan.setFocusable(false);
        

// Ghabeliat Didane Frame      
        panel1.setVisible(true);
        
        
        // Baraye Emtehan Gozashtam
        panel1.setBackground(Color.pink);
        
        Asan.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Asan){
            System.out.println("aa");
            new EASYpage2();
           
        }
    }
    
}
