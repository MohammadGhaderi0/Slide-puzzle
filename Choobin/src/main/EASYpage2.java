
package main;

import java.awt.*;
import javax.swing.*;

public class EASYpage2 extends JFrame{ // بجاي پنل از فريم استفاده ميکنيم

    public JButton three;
    public JButton four;
    public JButton five;

    public EASYpage2(){
        super("Welcom to Choobin Pazel"); // نام تايتل ما

        setSize(500,700);        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // اين رو حتما بنويس تا با ضربدر قرمز بسته شه

        setLayout(null); 
        //setPreferredSize(new Dimension(500, 700));
        setLocationRelativeTo(null); // اين رو حتما بنويس تا بياره مرکز
        three = new JButton("3*3");    
        four = new JButton("4 x 4");
        five = new JButton("5x5");        
        getContentPane().setBackground(Color.GREEN); 
        three.setBounds(100,100,100,100);
        four.setBounds(100,2,100,100);
        five.setBounds(2,100,100,100);
        add(three);        
        add(four);
        add(five);
        setVisible(true);
    }
}
