package main;

import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class RahnamyeAsan extends JFrame{
    
    JLabel tozih1;
    JLabel tozih2;
    JLabel tozih3;
    
    public RahnamyeAsan(){
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
        tozih1 = new JLabel("خوش اومدي به آموزش تو اين قسمت بايد سعي کني اعداد رو به ترتيب مرتب کني");
        tozih1.setBounds(60,10,620,200);
        add(tozih1);
        tozih1.setForeground(Color.WHITE);
        tozih2 = new JLabel("به نظر ساده مياد ولي گولش رو نخور يه روش که کمکت ميکنه زودتر حلش کني اول عدد يک رو بذار سرجاش");
        tozih2.setBounds(20,30,620,200);
        add(tozih2);
        tozih2.setForeground(Color.WHITE);
        tozih3 = new JLabel("بعدش دو و سه رو به صف بفرست داخل براي رديف دو هم همينه رديف آخر رو ديگه نميگم موفق باشي:)");
        tozih3.setBounds(40,50,600,200);
        add(tozih3);
        tozih3.setForeground(Color.WHITE);
    }
}
