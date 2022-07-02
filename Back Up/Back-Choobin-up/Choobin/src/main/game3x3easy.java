package main;


import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class game3x3easy extends JFrame{
    

    
    
    
    
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
    
    
    public game3x3easy(){
        
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

        
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn1, btn4);
                move(btn1, btn2);
                MacaneDorost();
                        }
        });
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn2, btn3);
                move(btn2, btn5);
                move(btn2, btn1);
                MacaneDorost();
                        }
        });
        btn3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn3, btn6);
                move(btn3, btn2);
                MacaneDorost();
                        }
        });
        btn4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn4, btn5);
                move(btn4, btn1);
                move(btn4, btn7);
                MacaneDorost();
                        }
        });
        btn5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn5, btn2);
                move(btn5, btn4);
                move(btn5, btn6);
                move(btn5, btn8);
                MacaneDorost();
                        }
        });
        btn6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn6, btn3);
                move(btn6, btn5);
                move(btn6, btn9);
                MacaneDorost();
                        }
        });
        btn7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn7, btn8);
                move(btn7, btn4);
                MacaneDorost();
                        }
        });
        btn8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn8, btn9);
                move(btn8, btn7);
                move(btn8, btn5);
                MacaneDorost();
                        }
        });
        btn9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn9, btn6);
                move(btn9, btn8);
                MacaneDorost();
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
                Random rand = new Random();
        int[] array = new int[8];

        int r = 0;
        int count = 0;
        boolean fill;

        int low = 1;
        int high = 8;
        int range = high - low + 1;

        do
        {
          fill = true;
          r = rand.nextInt(8) + 1;

           for (int i = 0; i < array.length; i++)//loop for random number between 1 to 10
           {          
              if (array[i] == r)
              {
                 fill = false;
              }
           }

           if (fill == true)
           {
              array[count] = r;
              count++;
           }
         }
         while (count < 8);
        
        
        btn1.setText(Integer.toString(array[0]));
        btn2.setText(Integer.toString(array[1]));
        btn3.setText(Integer.toString(array[2]));    
        btn4.setText(Integer.toString(array[3]));
        btn5.setText(Integer.toString(array[4]));
        btn6.setText(Integer.toString(array[5]));         
        btn7.setText(Integer.toString(array[6]));
        btn8.setText(Integer.toString(array[7]));
        btn9.setText("");         
                MacaneDorost();
                        }
        });   
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
        public void move(JButton button1,JButton button2){
        if (button2.getText() == "")
        {
            button2.setText(button1.getText());
            button1.setText("");
        }
}
    public void shuffle(int []array){
        Random rand = new Random();
    int r = 0;
    int count = 0;
    boolean fill;

    int low = 1;
    int high = 9;
    int range = high - low + 1;

    do
    {
      fill = true;
      r = rand.nextInt(10) + 1;

       for (int i = 0; i < array.length; i++)//loop for random number between 1 to 10
       {          
          if (array[i] == r)
          {
             fill = false;
          }
       }

       if (fill == true)
       {
          array[count] = r;
          count++;
       }
     }
     while (count < 9);
    
    MacaneDorost();

      }
    

    
    public void MacaneDorost(){
        
         if (("1"==btn1.getText())){             
                    btn1.setBackground(new Color(110, 200, 74));
          }else{btn1.setBackground(new Color(250, 200, 0));}
         if("2"==btn2.getText()){
                    btn2.setBackground(new Color(110, 200, 74));
          }else{btn2.setBackground(new Color(250, 200, 0)); }
 
        if("3"==btn3.getText()){                   
                    btn3.setBackground(new Color(110, 200, 74));
         }else{btn3.setBackground(new Color(250, 200, 0));}
        
        if("4"==btn4.getText()){                   
                    btn4.setBackground(new Color(110, 200, 74));
         }else{btn4.setBackground(new Color(250, 200, 0));}
        
         if("5"==btn5.getText()){                   
                    btn5.setBackground(new Color(110, 200, 74));
         }else{btn5.setBackground(new Color(250, 200, 0));}
         
         if("6"==btn6.getText()){                   
                    btn6.setBackground(new Color(110, 200, 74));
         }else{btn6.setBackground(new Color(250, 200, 0));}
         
          if("7"==btn7.getText()){                   
                    btn7.setBackground(new Color(110, 200, 74));
         }else{btn7.setBackground(new Color(250, 200, 0));}
          
         if("8"==btn8.getText()){                   
                    btn8.setBackground(new Color(110, 200, 74));
         }else{btn8.setBackground(new Color(250, 200, 0));}
        
        
         btn9.setBackground(new Color(250, 200, 0));

    
     if (("1"==btn1.getText())&&("2"==btn2.getText())&&("3"==btn3.getText())&&("4"==btn4.getText())&&("5"==btn5.getText())&&("6"==btn6.getText())&&("7"==btn7.getText())&&("8"==btn8.getText())&&(""==btn9.getText())) {
            JOptionPane.showMessageDialog(null, "تو بردي توخيلي خوبي");
        } 
    
    }
    
}
