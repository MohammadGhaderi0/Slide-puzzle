package main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class game4x4easy extends JFrame{
    public void move(JButton button1,JButton button2){
        if (button2.getText() == "")
        {
            button2.setText(button1.getText());
            button1.setText("");
        }
}
    public JButton btn1;
    public JButton btn2;
    public JButton btn3;
    public JButton btn4;
    public JButton btn5;
    public JButton btn6;
    public JButton btn7;
    public JButton btn8;
    public JButton btn9;
    public JButton btn10;
    public JButton btn11;
    public JButton btn12;
    public JButton btn13;
    public JButton btn14;
    public JButton btn15;
    public JButton btn16;
    public JButton back;
    
    public game4x4easy(){
        super("15 Puzzle");

// Andaze Frame
        setSize(500,700);

// Miare Markaz Safhe ==> https://stackoverflow.com/questions/144892/how-to-center-a-window-in-java
        setLocationRelativeTo(null);

// Chegoonegie Baste Shodan Safhe
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        getContentPane().setBackground(new Color(41, 52, 74));
        
        setLayout(null);
        
        setVisible(true);
        
        btn1 =new JButton("1");
        btn2 =new JButton("2");
        btn3 =new JButton("3");
        btn4 =new JButton("4");
        btn5 =new JButton("5");
        btn6 =new JButton("6");
        btn7 =new JButton("7");
        btn8 =new JButton("8");
        btn9 =new JButton("9");
        btn10 =new JButton("10");
        btn11 =new JButton("11");
        btn12 =new JButton("12");
        btn13 =new JButton("13");
        btn14 =new JButton("14");
        btn15 =new JButton("15");
        btn16 =new JButton("");
        back = new JButton("برگشت");
        
        
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn7);
        add(btn8);
        add(btn9);
        add(btn10);
        add(btn11);
        add(btn12);
        add(btn13);
        add(btn14);
        add(btn15);
        add(btn16);
        add(back);
        
        
        btn1.setBounds(70,100,80,80);
        btn2.setBounds(160,100,80,80);
        btn3.setBounds(250,100,80,80);
        btn4.setBounds(340,100,80,80);
        btn5.setBounds(70,190,80,80);
        btn6.setBounds(160,190,80,80);
        btn7.setBounds(250,190,80,80);
        btn8.setBounds(340,190,80,80);
        btn9.setBounds(70,280,80,80);
        btn10.setBounds(160,280,80,80);
        btn11.setBounds(250,280,80,80);
        btn12.setBounds(340,280,80,80);
        btn13.setBounds(70,370,80,80);
        btn14.setBounds(160,370,80,80);
        btn15.setBounds(250,370,80,80);
        btn16.setBounds(340,370,80,80);
        back.setBounds(320,570,100,50);
                
        
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn1, btn2);
                move(btn1, btn5);
                        }
        });
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn2, btn1);
                move(btn2, btn3);
                move(btn2, btn6);
                        }
        });
        btn3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn3, btn2);
                move(btn3, btn4);
                move(btn3, btn7);
                        }
        });
        btn4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn4, btn8);
                move(btn4, btn3);
                                        }
        });
        btn5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn5, btn1);
                move(btn5, btn6);
                move(btn5, btn9);
                        }
        });
        btn6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn6, btn2);
                move(btn6, btn5);
                move(btn6, btn7);
                move(btn6, btn10);
                        }
        });
        btn7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn7, btn3);
                move(btn7, btn6);
                move(btn7, btn8);
                move(btn7, btn11);
                        }
        });
        btn8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn8, btn4);
                move(btn8, btn7);
                move(btn8, btn12);
                        }
        });
        btn9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn9, btn5);
                move(btn9, btn10);
                move(btn9, btn13);
                        }
        });
        btn10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn10, btn6);
                move(btn10, btn9);
                move(btn10, btn11);
                move(btn10, btn14);
                        }
        });
        btn11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn11, btn10);
                move(btn11, btn12);
                move(btn11, btn7);
                move(btn11, btn15);
                        }
        });
        btn12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn12, btn8);
                move(btn12, btn11);
                move(btn12, btn16);
                        }
        });
        btn13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn13, btn9);
                move(btn13, btn14);
                        }
        });
        btn14.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn14, btn10);
                move(btn14, btn13);
                move(btn14, btn15);
                        }
        });
        btn15.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn15, btn14);
                move(btn15, btn16);
                move(btn15, btn11);
                        }
        });
        btn16.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn16, btn15);
                move(btn16, btn12);
                        }
        });
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int a =JOptionPane.showConfirmDialog(null,"Are you sure?");
                if (a ==0){
                    new EASYpage2();
                    setVisible(false);
                    
                }
                        }
        });
    }
    
    
    
    
    
    
    
    
    
}
