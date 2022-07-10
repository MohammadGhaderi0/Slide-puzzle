
package main;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 */
public class CodhayeMoshtarak extends JFrame{
         public  int Emtiaz=0;
     JLabel CadreEmtiaz;
    public  CodhayeMoshtarak() {
        
               super("15 Puzzle");
               
               // Andaze Frame
                   setSize(500,700);

// Miare Markaz Safhe ==> https://stackoverflow.com/questions/144892/how-to-center-a-window-in-java
        setLocationRelativeTo(null);

// Chegoonegie Baste Shodan Safhe
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        getContentPane().setBackground(new Color(41, 52, 74));
                       CadreEmtiaz = new JLabel();
               CadreEmtiaz.setText("امتياز شما "+Integer.toString(Emtiaz));
               CadreEmtiaz.setFont(new Font("homa ", Font.BOLD, 25));
               CadreEmtiaz.setBounds(175,30,200,50);
               CadreEmtiaz.setForeground(Color.yellow);
               add(CadreEmtiaz);
        
        setLayout(null);
        
        setVisible(true);
}}
