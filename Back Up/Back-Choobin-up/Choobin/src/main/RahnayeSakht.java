package main;

import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Image;
import javax.swing.JFrame;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JLabel;

public class RahnayeSakht extends JFrame{
    
    JLabel tozih1;
    JLabel tozih2;
    JLabel tozih3;
    public RahnayeSakht(){
                       super("15 Puzzle");
               
               // Andaze Frame
                   setSize(480,300);

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
        tozih1 = new JLabel("اين قسمت يذره سخت تر از قبليه بايد اعداد رو مرتب کني ولي اعداد رو فقط وقتي");
        tozih1.setBounds(60,10,620,200);
        add(tozih1);
        tozih1.setForeground(Color.WHITE);
        tozih2 = new JLabel("مي بيني که دکمه موس رو روشون نگه داري اگه نگه داشتي و عددي نديدي پس اين همون");
        tozih2.setBounds(50,30,620,200);
        add(tozih2);
        tozih2.setForeground(Color.WHITE);
        tozih3 = new JLabel("خونه خاليه اس موفق باشي:)");
        tozih3.setBounds(180,50,600,200);
        add(tozih3);
        tozih3.setForeground(Color.WHITE);
    }
}

