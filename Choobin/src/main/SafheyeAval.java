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
        public String[][] AmirVaMohammad={{"12:25","Amir Hossein"},{"12:25","Mohammad Ghadiri"}};        

// Sazandeye Frame      
    public  SafheyeAval(){

        super("15 Puzzle");

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
        BarnameNevisan = new JButton("برنامه‌نويسان");     


        Asan.setBackground(Color.pink);

// Andaze Va Mokhtasate Dokmeha
        Asan.setBounds(67,150,150,50);
        Sakht.setBounds(267,150,150,50);
        RekordHa.setBounds(267,350,150,50);
        BarnameNevisan.setBounds(67,350,150,50);
            
// Halate Focus Az Roye Dokme ha Bardashte Mishe            
        Asan.setFocusable(false);
        Sakht.setFocusable(false);
        RekordHa.setFocusable(false);
        BarnameNevisan.setFocusable(false);
            
// Taghire Font Va Andaze va Style Dokme ha             
        Asan.setFont(new Font("homa", Font.BOLD, 25));
        Sakht.setFont(new Font("homa ", Font.BOLD, 25));
        RekordHa.setFont(new Font("homa ", Font.BOLD, 25));
        BarnameNevisan.setFont(new Font("homa ", Font.BOLD, 25));
            
// Ezafe Kardan Dokmeha Be Panel       
        add(Asan);
        add(Sakht);
        add(RekordHa);
        add(BarnameNevisan);       

// Taghire Rangge Pas Zamine
        getContentPane().setBackground(new Color(41, 52, 74));
        Asan.setBackground(new Color(0,160,96));
        Sakht.setBackground(new Color(0,160,96));
        RekordHa.setBackground(new Color(0,160,96));
        BarnameNevisan.setBackground(new Color(0,160,96));
 // Rangge Pas Zamine Avaz Mishe           
        Asan.setForeground(Color.WHITE);
        Sakht.setForeground(Color.WHITE);
        RekordHa.setForeground(Color.WHITE);
        BarnameNevisan.setForeground(Color.WHITE);

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
                new BakhsheSakht();

// Safheye Ghabli ra Mibandad         
                setVisible(false);
         }
        });


        RekordHa.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new RecordHa(AmirVaMohammad);

// Safheye Ghabli ra Mibandad                 
                setVisible(false);
         }
        });


        BarnameNevisan.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new Developers();

// Safheye Ghabli ra Mibandad                
                setVisible(false);
         }
        });

    }
}
