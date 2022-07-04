package main;


import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class Sakht3Dar3 extends JFrame{
    

    
    
    
    
    public JButton btn1;
    public JButton btn2;
    public JButton btn3;
    public JButton btn4;
    public JButton btn5;
    public JButton btn6;
    public JButton btn7;
    public JButton btn8;
    public JButton btn9;
    public JButton back;
    public JButton start;
    
    
    public Sakht3Dar3(){
        
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
        btn9 =new JButton("");
        back = new JButton("برگشت");
        start = new JButton("شروع");
         JayeRandomDokme();


        btn1.setBounds(80,100,100,100);
        btn2.setBounds(190,100,100,100);
        btn3.setBounds(300,100,100,100);
        btn4.setBounds(80, 210, 100, 100);
        btn5.setBounds(190,210,100,100);
        btn6.setBounds(300,210,100,100);
        btn7.setBounds(80,320,100,100);
        btn8.setBounds(190,320,100,100);
        btn9.setBounds(300,320,100,100);
        back.setBounds(320,570,100,50);
        start.setBounds(200,570,100,50);
                MacaneDorost();
                MakhfiKardaneDokmeha();
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn7);
        add(btn8);
        add(btn9);
        add(back);
        add(start);


        
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn1, btn4);
                move(btn1, btn2);
MakhfiKardaneDokmeha();
                MacaneDorost();
                        }
        });
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn2, btn3);
                move(btn2, btn5);
                move(btn2, btn1);
                MakhfiKardaneDokmeha();

                MacaneDorost();
                        }
        });
        btn3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn3, btn6);
                move(btn3, btn2);
                MakhfiKardaneDokmeha();

                MacaneDorost();
                        }
        });
        btn4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn4, btn5);
                move(btn4, btn1);
                move(btn4, btn7);
                MacaneDorost();
                MakhfiKardaneDokmeha();

                        }
        });
        btn5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn5, btn2);
                move(btn5, btn4);
                move(btn5, btn6);
                move(btn5, btn8);
                MacaneDorost();
                MakhfiKardaneDokmeha();

                        }
        });
        btn6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn6, btn3);
                move(btn6, btn5);
                move(btn6, btn9);
                MacaneDorost();
                MakhfiKardaneDokmeha();

                        }
        });
        btn7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn7, btn8);
                move(btn7, btn4);
                MacaneDorost();
                MakhfiKardaneDokmeha();

                        }
        });
        btn8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn8, btn9);
                move(btn8, btn7);
                move(btn8, btn5);
                MacaneDorost();
                MakhfiKardaneDokmeha();

                        }
        });
        btn9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn9, btn6);
                move(btn9, btn8);
                MacaneDorost();
                MakhfiKardaneDokmeha();

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
        start.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JayeRandomDokme();
                MacaneDorost();
                MakhfiKardaneDokmeha();
                        }
        });   
    }
    
    
    
    
    
    
    
    
    
    
    
    
    public void MakhfiKardaneDokmeha(){
    
                 System.out.println(btn8.getText());
                 System.out.println(btn1.getText());

    for (int i=0; i<2;i++){
         if ((btn1.getText()!="")&&(1==Integer.parseInt(btn1.getText()))){              
                    btn1.setForeground(new Color(110, 200, 74));
          }else {btn1.setForeground(new Color(250, 200, 0));}
     
         if((btn2.getText()!="")&&(2==Integer.parseInt(btn2.getText()))){
                    btn2.setForeground(new Color(110, 200, 74));
          }else{btn2.setForeground(new Color(250, 200, 0)); }
 
        if((btn3.getText()!="")&&(3==Integer.parseInt(btn3.getText()))){                   
                    btn3.setForeground(new Color(110, 200, 74));
         }else{btn3.setForeground(new Color(250, 200, 0));}
        
        if((btn4.getText()!="")&&(4==Integer.parseInt(btn4.getText()))){                   
                    btn4.setForeground(new Color(110, 200, 74));
         }else{btn4.setForeground(new Color(250, 200, 0));}
        
         if((btn5.getText()!="")&&(5==Integer.parseInt(btn5.getText()))){                   
                    btn5.setForeground(new Color(110, 200, 74));
         }else{btn5.setForeground(new Color(250, 200, 0));}
         
         if((btn6.getText()!="")&&(6==Integer.parseInt(btn6.getText()))){                   
                    btn6.setForeground(new Color(110, 200, 74));
         }else{btn6.setForeground(new Color(250, 200, 0));}
         
          if((btn7.getText()!="")&&(7==Integer.parseInt(btn7.getText()))){                   
                    btn7.setForeground(new Color(110, 200, 74));
         }else{btn7.setForeground(new Color(250, 200, 0));}
          
         if((btn8.getText()!="")&&(8==Integer.parseInt(btn8.getText()))){                 
                    btn8.setForeground(new Color(110, 200, 74));
         }else{btn8.setForeground(new Color(250, 200, 0));}
    }
    
    }
    
    
    
    
    
    
    public void JayeRandomDokme(){
          Random rand = new Random();

    ArrayList<String> list1=new ArrayList<>();   
    for (int i =1;i<9;i++){    
    list1.add(Integer.toString(i));
    }
            System.out.println(list1.toString());

    
    int Adad1 = rand.nextInt(8);
    String Number1 = list1.get(Adad1);
    list1.remove(Number1);

    int Adad2 = rand.nextInt(7);
    String Number2 = list1.get(Adad2);
    list1.remove(Number2);

    int Adad3 = rand.nextInt(6);
    String Number3 = list1.get(Adad3);
    list1.remove(Number3);

    int Adad4 = rand.nextInt(5);
    String Number4 = list1.get(Adad4);
    list1.remove(Number4);

    int Adad5 = rand.nextInt(4);
    String Number5 = list1.get(Adad5);
    list1.remove(Number5);

    int Adad6 = rand.nextInt(3);
    String Number6 = list1.get(Adad6);
    list1.remove(Number6);

    int Adad7 = rand.nextInt(2);
    String Number7 = list1.get(Adad7);
    list1.remove(Number7);

    int Adad8 = rand.nextInt(1);
    String Number8 = list1.get(Adad8);
    list1.remove(Number8);

    String Number9 = "";
    
        btn1.setText(Number1);
        btn2.setText(Number2);
        btn3.setText(Number3);    
        btn4.setText(Number4);
        btn5.setText(Number5);
        btn6.setText(Number6);         
        btn7.setText(Number7);
        btn8.setText(Number8);        
        btn9.setText(Number9);        

    }
    
    
    
    
    
    
    
        public void move(JButton button1,JButton button2){
        if (button2.getText() == "")
        {
            button2.setText(button1.getText());
            button1.setText("");
        }
}

    

    
    public void MacaneDorost(){

        for (int i=0; i<2;i++){
         if ((btn1.getText()!="")&&(1==Integer.parseInt(btn1.getText()))){              
                    btn1.setBackground(new Color(110, 200, 74));
          }else {btn1.setBackground(new Color(250, 200, 0));}
     
         if((btn2.getText()!="")&&(2==Integer.parseInt(btn2.getText()))){
                    btn2.setBackground(new Color(110, 200, 74));
          }else{btn2.setBackground(new Color(250, 200, 0)); }
 
        if((btn3.getText()!="")&&(3==Integer.parseInt(btn3.getText()))){                   
                    btn3.setBackground(new Color(110, 200, 74));
         }else{btn3.setBackground(new Color(250, 200, 0));}
        
        if((btn4.getText()!="")&&(4==Integer.parseInt(btn4.getText()))){                   
                    btn4.setBackground(new Color(110, 200, 74));
         }else{btn4.setBackground(new Color(250, 200, 0));}
        
         if((btn5.getText()!="")&&(5==Integer.parseInt(btn5.getText()))){                   
                    btn5.setBackground(new Color(110, 200, 74));
         }else{btn5.setBackground(new Color(250, 200, 0));}
         
         if((btn6.getText()!="")&&(6==Integer.parseInt(btn6.getText()))){                   
                    btn6.setBackground(new Color(110, 200, 74));
         }else{btn6.setBackground(new Color(250, 200, 0));}
         
          if((btn7.getText()!="")&&(7==Integer.parseInt(btn7.getText()))){                   
                    btn7.setBackground(new Color(110, 200, 74));
         }else{btn7.setBackground(new Color(250, 200, 0));}
          
         if((btn8.getText()!="")&&(8==Integer.parseInt(btn8.getText()))){                 
                    btn8.setBackground(new Color(110, 200, 74));
         }else{btn8.setBackground(new Color(250, 200, 0));}
    }
        
        
         btn9.setBackground(new Color(250, 200, 0));

    
     if (("1"==btn1.getText())&&("2"==btn2.getText())&&("3"==btn3.getText())&&("4"==btn4.getText())&&("5"==btn5.getText())&&("6"==btn6.getText())&&("7"==btn7.getText())&&("8"==btn8.getText())&&(""==btn9.getText())) {
         //JOptionPane.showMessageDialog(null, "تو بردي توخيلي خوبي");
        } 
        
    }
    
}
