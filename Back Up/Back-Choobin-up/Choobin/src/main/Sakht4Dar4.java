package main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import static javax.swing.JOptionPane.PLAIN_MESSAGE;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Sakht4Dar4 extends DokmeHa {


    public JButton btn10;
    public JButton btn11;
    public JButton btn12;
    public JButton btn13;
    public JButton btn14;
    public JButton btn15;
    public JButton btn16;

    
    public Sakht4Dar4 (){


                                       

        btn9 =new JButton("9");
        btn10 =new JButton("10");
        btn11 =new JButton("11");
        btn12 =new JButton("12");
        btn13 =new JButton("13");
        btn14 =new JButton("14");
        btn15 =new JButton("15");
        btn16 =new JButton(" ");

 btn1.setFont(new Font("homa", Font.BOLD, 40));
                                btn2.setFont(new Font("homa", Font.BOLD, 40));
                                btn3.setFont(new Font("homa", Font.BOLD, 40));
                                btn4.setFont(new Font("homa", Font.BOLD, 40));
                                btn5.setFont(new Font("homa", Font.BOLD, 40));
                                btn6.setFont(new Font("homa", Font.BOLD, 40));
                                btn7.setFont(new Font("homa", Font.BOLD, 40));
                                btn8.setFont(new Font("homa", Font.BOLD, 40));
                                btn9.setFont(new Font("homa", Font.BOLD, 40));
                                btn10.setFont(new Font("homa", Font.BOLD, 40));
                                btn11.setFont(new Font("homa", Font.BOLD, 40));
                                btn12.setFont(new Font("homa", Font.BOLD, 40));
                                btn13.setFont(new Font("homa", Font.BOLD, 40));
                                btn14.setFont(new Font("homa", Font.BOLD, 40));
                                btn15.setFont(new Font("homa", Font.BOLD, 40));
                                btn16.setFont(new Font("homa", Font.BOLD, 40));
        

        
        
        btn1.setBounds(68,100,85,85);
        btn2.setBounds(158,100,85,85);
        btn3.setBounds(248,100,85,85);
        btn4.setBounds(338,100,85,85);
        btn5.setBounds(68,190,85,85);
        btn6.setBounds(158,190,85,85);
        btn7.setBounds(248,190,85,85);
        btn8.setBounds(338,190,85,85);
        btn9.setBounds(68,280,85,85);
        btn10.setBounds(158,280,85,85);
        btn11.setBounds(248,280,85,85);
        btn12.setBounds(338,280,85,85);
        btn13.setBounds(68,370,85,85);
        btn14.setBounds(158,370,85,85);
        btn15.setBounds(248,370,85,85);
        btn16.setBounds(338,370,85,85);



        MacaneDorost();
        
        MakhfiKardaneDokmeha();

        

        add(btn10);
        add(btn11);
        add(btn12);
        add(btn13);
        add(btn14);
        add(btn15);
        add(btn16);


        
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn1, btn2);
                move(btn1, btn5);
                MacaneDorost();
                MakhfiKardaneDokmeha();


                        }
        });
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn2, btn1);
                move(btn2, btn3);
                move(btn2, btn6);                
                MacaneDorost();
                MakhfiKardaneDokmeha();


                        }
        });
        btn3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn3, btn2);
                move(btn3, btn4);
                move(btn3, btn7);
                MacaneDorost();
                MakhfiKardaneDokmeha();


                        }
        });
        btn4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn4, btn8);
                move(btn4, btn3);
                MacaneDorost();
                MakhfiKardaneDokmeha();


                                        }
        });
        btn5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn5, btn1);
                move(btn5, btn6);
                move(btn5, btn9);
                MacaneDorost();
                MakhfiKardaneDokmeha();


                        }
        });
        btn6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn6, btn2);
                move(btn6, btn5);
                move(btn6, btn7);
                move(btn6, btn10);
                MacaneDorost();
                MakhfiKardaneDokmeha();


                        }
        });
        btn7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn7, btn3);
                move(btn7, btn6);
                move(btn7, btn8);
                move(btn7, btn11);
                MacaneDorost();
                MakhfiKardaneDokmeha();


                        }
        });
        btn8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn8, btn4);
                move(btn8, btn7);
                move(btn8, btn12);
                MacaneDorost();
                MakhfiKardaneDokmeha();


                        }
        });
        btn9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn9, btn5);
                move(btn9, btn10);
                move(btn9, btn13);
                MacaneDorost();
                MakhfiKardaneDokmeha();


                        }
        });
        btn10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn10, btn6);
                move(btn10, btn9);
                move(btn10, btn11);
                move(btn10, btn14);
                MacaneDorost();
                MakhfiKardaneDokmeha();


                        }
        });
        btn11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn11, btn10);
                move(btn11, btn12);
                move(btn11, btn7);
                move(btn11, btn15);
                MacaneDorost();
                MakhfiKardaneDokmeha();


                        }
        });
        btn12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn12, btn8);
                move(btn12, btn11);
                move(btn12, btn16);
                MacaneDorost();
                MakhfiKardaneDokmeha();


                        }
        });
        btn13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn13, btn9);
                move(btn13, btn14);
                MacaneDorost();
                MakhfiKardaneDokmeha();


                        }
        });
        btn14.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn14, btn10);
                move(btn14, btn13);
                move(btn14, btn15);
                MacaneDorost();
                MakhfiKardaneDokmeha();


                        }
        });
        btn15.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn15, btn14);
                move(btn15, btn16);
                move(btn15, btn11);
                MacaneDorost();
                MakhfiKardaneDokmeha();


                        }
        });
        btn16.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn16, btn15);
                move(btn16, btn12);
                MacaneDorost();
                MakhfiKardaneDokmeha();

                        }
        });
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int a =JOptionPane.showConfirmDialog(null,"خواهش ميکنم خارج نشو!!");
   
                if (a ==0){
                    JOptionPane.showMessageDialog(null, "اي بابا!!");
                    new EASYpage2();
                    setVisible(false);
                    
                }else{
                    JOptionPane.showMessageDialog(null, "اي ول!!");

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
        
 public void JayeRandomDokme (){
          Random rand = new Random();

    ArrayList<String> list1=new ArrayList<>();   
    for (int i =1;i<16;i++){    
    list1.add(Integer.toString(i));
    }
            System.out.println(list1.toString());

    
    int Adad1 = rand.nextInt(15);
    String Number1 = list1.get(Adad1);
    list1.remove(Number1);

    int Adad2 = rand.nextInt(14);
    String Number2 = list1.get(Adad2);
    list1.remove(Number2);

    int Adad3 = rand.nextInt(13);
    String Number3 = list1.get(Adad3);
    list1.remove(Number3);

    int Adad4 = rand.nextInt(12);
    String Number4 = list1.get(Adad4);
    list1.remove(Number4);

    int Adad5 = rand.nextInt(11);
    String Number5 = list1.get(Adad5);
    list1.remove(Number5);

    int Adad6 = rand.nextInt(10);
    String Number6 = list1.get(Adad6);
    list1.remove(Number6);

    int Adad7 = rand.nextInt(9);
    String Number7 = list1.get(Adad7);
    list1.remove(Number7);

    int Adad8 = rand.nextInt(8);
    String Number8 = list1.get(Adad8);
    list1.remove(Number8);
    
    int Adad9 = rand.nextInt(7);
    String Number9 = list1.get(Adad9);
    list1.remove(Number9);
    
    int Adad10 = rand.nextInt(6);
    String Number10 = list1.get(Adad10);
    list1.remove(Number10);
    
    int Adad11 = rand.nextInt(5);
    String Number11 = list1.get(Adad11);
    list1.remove(Number11);
    
    int Adad12 = rand.nextInt(4);
    String Number12 = list1.get(Adad12);
    list1.remove(Number12);
    
    int Adad13 = rand.nextInt(3);
    String Number13 = list1.get(Adad13);
    list1.remove(Number13);
    
    int Adad14 = rand.nextInt(2);
    String Number14 = list1.get(Adad14);
    list1.remove(Number14);
    
    int Adad15 = rand.nextInt(1);
    String Number15 = list1.get(Adad15);
    list1.remove(Number15);

    String Number16 = "";
    
        btn1.setText(Number1);
        btn2.setText(Number2);
        btn3.setText(Number3);    
        btn4.setText(Number4);
        btn5.setText(Number5);
        btn6.setText(Number6);         
        btn7.setText(Number7);
        btn8.setText(Number8);        
        btn9.setText(Number9);        
        btn10.setText(Number10);        
        btn11.setText(Number11);        
        btn12.setText(Number12);        
        btn13.setText(Number13);        
        btn14.setText(Number14);        
        btn15.setText(Number15);        
        btn16.setText(Number16);        

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
         
         if((btn9.getText()!="")&&(9==Integer.parseInt(btn9.getText()))){                 
                    btn9.setBackground(new Color(110, 200, 74));
         }else{btn9.setBackground(new Color(250, 200, 0));}
         
         if((btn10.getText()!="")&&(10==Integer.parseInt(btn10.getText()))){                 
                    btn10.setBackground(new Color(110, 200, 74));
         }else{btn10.setBackground(new Color(250, 200, 0));}
         
         if((btn11.getText()!="")&&(11==Integer.parseInt(btn11.getText()))){                 
                    btn11.setBackground(new Color(110, 200, 74));
         }else{btn11.setBackground(new Color(250, 200, 0));}
         
         if((btn12.getText()!="")&&(12==Integer.parseInt(btn12.getText()))){                 
                    btn12.setBackground(new Color(110, 200, 74));
         }else{btn12.setBackground(new Color(250, 200, 0));}
         
         if((btn13.getText()!="")&&(13==Integer.parseInt(btn13.getText()))){                 
                    btn13.setBackground(new Color(110, 200, 74));
         }else{btn13.setBackground(new Color(250, 200, 0));}
         
         if((btn14.getText()!="")&&(14==Integer.parseInt(btn14.getText()))){                 
                    btn14.setBackground(new Color(110, 200, 74));
         }else{btn14.setBackground(new Color(250, 200, 0));}
         
         if((btn15.getText()!="")&&(15==Integer.parseInt(btn15.getText()))){                 
                    btn15.setBackground(new Color(110, 200, 74));
         }else{btn15.setBackground(new Color(250, 200, 0));}
         
         
    }

         btn16.setBackground(new Color(250, 200, 0));
     if (btn16.getText()!=""&&btn8.getText()!=""&&btn1.getText()!=""&&btn2.getText()!=""&&btn3.getText()!=""&&btn4.getText()!=""&&btn5.getText()!=""&&btn6.getText()!=""&&btn7.getText()!=""&&btn9.getText()!=""&&btn10.getText()!=""&&btn11.getText()!=""&&btn13.getText()!=""&&btn14.getText()!=""&&btn15.getText()!=""&&btn12.getText()!=""&&1==Integer.parseInt(btn1.getText())&&2==Integer.parseInt(btn2.getText())&&3==Integer.parseInt(btn3.getText())&&4==Integer.parseInt(btn4.getText())&&5==Integer.parseInt(btn5.getText())&&6==Integer.parseInt(btn6.getText())&&7==Integer.parseInt(btn7.getText())&&8==Integer.parseInt(btn8.getText())&&9==Integer.parseInt(btn9.getText())&&10==Integer.parseInt(btn10.getText())&&11==Integer.parseInt(btn11.getText())&&12==Integer.parseInt(btn12.getText())&&13==Integer.parseInt(btn13.getText())&&14==Integer.parseInt(btn14.getText())&&15==Integer.parseInt(btn15.getText())) {
                String ssss= JOptionPane.showInputDialog(null, "تو بردي  توخيلي خوبي  حالا اسمت رو بنويس:","نام",PLAIN_MESSAGE);

                System.out.println(ssss);        } 
        
    }
        
    
        public void move(JButton button1,JButton button2){
        if (button2.getText() == "")
        {
            button2.setText(button1.getText());
            button1.setText("");
        }
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

             if((btn9.getText()!="")&&(9==Integer.parseInt(btn9.getText()))){                 
                    btn9.setForeground(new Color(110, 200, 74));
         }else{btn9.setForeground(new Color(250, 200, 0));}
         
         if((btn10.getText()!="")&&(10==Integer.parseInt(btn10.getText()))){                 
                    btn10.setForeground(new Color(110, 200, 74));
         }else{btn10.setForeground(new Color(250, 200, 0));}
         
         if((btn11.getText()!="")&&(11==Integer.parseInt(btn11.getText()))){                 
                    btn11.setForeground(new Color(110, 200, 74));
         }else{btn11.setForeground(new Color(250, 200, 0));}
         
         if((btn12.getText()!="")&&(12==Integer.parseInt(btn12.getText()))){                 
                    btn12.setForeground(new Color(110, 200, 74));
         }else{btn12.setForeground(new Color(250, 200, 0));}
         
         if((btn13.getText()!="")&&(13==Integer.parseInt(btn13.getText()))){                 
                    btn13.setForeground(new Color(110, 200, 74));
         }else{btn13.setForeground(new Color(250, 200, 0));}
         
         if((btn14.getText()!="")&&(14==Integer.parseInt(btn14.getText()))){                 
                    btn14.setForeground(new Color(110, 200, 74));
         }else{btn14.setForeground(new Color(250, 200, 0));}
         
         if((btn15.getText()!="")&&(15==Integer.parseInt(btn15.getText()))){                 
                    btn15.setForeground(new Color(110, 200, 74));
         }else{btn15.setForeground(new Color(250, 200, 0));}
    }
    }
    
}
