package main;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

public class Developers extends JFrame{
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JButton back;

    Border lineborder;
    public Developers(){
        super("15 Puzzle");
        setSize(500,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(41, 52, 74));
        setLayout(null);
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        back = new JButton("برگشت");  

        
        
        label1.setText(":کاری‌از");
        label2.setText("    امیر‌حسین‌ حسین‌زاده‌ فخاری");
        label3.setText("   محمد قادری");
        
        label1.setFont(new Font("homa", Font.BOLD, 25));
        label2.setFont(new Font("homa ", Font.BOLD, 25));
        label3.setFont(new Font("homa ", Font.BOLD, 25));
        
        
         back.setBounds(100,400,150,50);
         back.setFocusable(false);
         back.setFont(new Font("homa ", Font.BOLD, 25));
         back.setBackground(new Color(0,160,96));
         back.setForeground(Color.WHITE);





        
        
        setVisible(true);
        
        add(label1);
        add(label2);
        add(label3);
        add(back);

        
        
        label1.setBounds(190,200,100,100);
        label2.setBounds(175,220,140,100);
        label3.setBounds(175,240,150,100);
        
        
        label3.setForeground(Color.red);
        label2.setForeground(Color.red);
        label1.setForeground(Color.red);
        
        
        lineborder = BorderFactory.createLineBorder(Color.green);
        label2.setBorder(lineborder);
        
        
         back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                new SafheyeAval();

                setVisible(false);
         }
        });
        
        
}}
