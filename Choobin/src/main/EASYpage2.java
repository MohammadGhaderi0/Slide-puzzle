package main;

import java.awt.*;
import javax.swing.*;

public class EASYpage2 extends JPanel{
    public JButton three;
    public JButton four;
    public JButton five;
    
    public EASYpage2(){
        this.setSize(500,700);
        this.setVisible(true);
        
        this.setLayout(new FlowLayout());
        this.setPreferredSize(new Dimension(500, 700));
        three = new JButton();    
        four = new JButton();
        five = new JButton();
        this.add(three);
        this.add(four);
        this.add(five);
        this.setVisible(true);
        this.setBackground(Color.pink);
    }
}
