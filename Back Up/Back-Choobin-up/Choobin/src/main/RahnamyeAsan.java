package main;

import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class RahnamyeAsan extends JFrame{
    
    JLabel tozih;
    
    public RahnamyeAsan(){
                       super("15 Puzzle");
               
               // Andaze Frame
                   setSize(400,550);

// Miare Markaz Safhe ==> https://stackoverflow.com/questions/144892/how-to-center-a-window-in-java
        setLocationRelativeTo(null);
        Image icon = null;
        try{
        icon= ImageIO.read(getClass().getResource("iconVizhe.png"));}catch(IOException e){e.printStackTrace();}
            setIconImage(icon);
// Chegoonegie Baste Shodan Safhe
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        getContentPane().setBackground(new Color(41, 52, 74));

        
        setLayout(null);
        
        setVisible(true);
        tozih = new JLabel();
    }
}
