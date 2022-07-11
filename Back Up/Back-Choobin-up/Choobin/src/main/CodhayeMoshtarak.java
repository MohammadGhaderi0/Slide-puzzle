
package main;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 */
public class CodhayeMoshtarak extends JFrame{

    public  CodhayeMoshtarak() {
        
               super("15 Puzzle");
               
               // Andaze Frame
                   setSize(500,700);

// Miare Markaz Safhe ==> https://stackoverflow.com/questions/144892/how-to-center-a-window-in-java
        setLocationRelativeTo(null);
        Image icon = null;
        try{
        icon= ImageIO.read(getClass().getResource("iconVizhe.png"));}catch(IOException e){e.printStackTrace();}
            setIconImage(icon);
// Chegoonegie Baste Shodan Safhe
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        getContentPane().setBackground(new Color(41, 52, 74));

        
        setLayout(null);
        
        setVisible(true);
}}
