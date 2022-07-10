package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.PLAIN_MESSAGE;
import javax.swing.Timer;

public class Asan5Dar5 extends DokmeHa{
    
    void off(boolean a){
        if(a==false){
           btn1.setVisible(false);
            btn2.setVisible(false);
            btn3.setVisible(false);
            btn4.setVisible(false);
            btn5.setVisible(false);
            btn6.setVisible(false);
            btn7.setVisible(false);
            btn8.setVisible(false);
            btn9.setVisible(false);
            btn10.setVisible(false);
            btn11.setVisible(false);
            btn12.setVisible(false);
            btn13.setVisible(false);
            btn14.setVisible(false);
            btn15.setVisible(false);
            btn16.setVisible(false);
            btn17.setVisible(false);
            btn18.setVisible(false);
            btn19.setVisible(false);
            btn20.setVisible(false);
            btn21.setVisible(false);
            btn22.setVisible(false);
            btn23.setVisible(false);
            btn24.setVisible(false);
            btn25.setVisible(false);
        } 
        if (a==true) {
            btn1.setVisible(true);
            btn2.setVisible(true);
            btn3.setVisible(true);
            btn4.setVisible(true);
            btn5.setVisible(true);
            btn6.setVisible(true);
            btn7.setVisible(true);
            btn8.setVisible(true);
            btn9.setVisible(true);
            btn10.setVisible(true);
            btn11.setVisible(true);
            btn12.setVisible(true);
            btn13.setVisible(true);
            btn14.setVisible(true);
            btn15.setVisible(true);
            btn16.setVisible(true);
            btn17.setVisible(true);
            btn18.setVisible(true);
            btn19.setVisible(true);
            btn20.setVisible(true);
            btn21.setVisible(true);
            btn22.setVisible(true);
            btn23.setVisible(true);
            btn24.setVisible(true);
            btn25.setVisible(true);
        }}
    public boolean b =true;
    
    
    public int elapsedTime = 0;
    public int seconds =0;
    public int minutes =0;
    public boolean started = false;
    public String seconds_string = String.format("%02d", seconds);
    public String minutes_string = String.format("%02d", minutes);
        
    
    Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            elapsedTime=elapsedTime+1000;
	    minutes = (elapsedTime/60000) % 60;
	    seconds = (elapsedTime/1000) % 60;
            seconds_string = String.format("%02d", seconds);
	    minutes_string = String.format("%02d", minutes);
	    timeLabel.setText(minutes_string+":"+seconds_string);
        }
    });
    void start() {
		timer.start();
	}
	
	void stop() {
		timer.stop();
	}
	
	void reset() {
		timer.stop();
		elapsedTime=0;
		seconds =0;
		minutes=0;
		seconds_string = String.format("%02d", seconds);
		minutes_string = String.format("%02d", minutes);
		timeLabel.setText(minutes_string+":"+seconds_string);
	}
    
    
   
    public JButton btn10;
    public JButton btn11;
    public JButton btn12;
    public JButton btn13;
    public JButton btn14;
    public JButton btn15;
    public JButton btn16;
    public JButton btn17;
    public JButton btn18;
    public JButton btn19;
    public JButton btn20;
    public JButton btn21;
    public JButton btn22;
    public JButton btn23;
    public JButton btn24;
    public JButton btn25;
    public JLabel timeLabel;

    
    public Asan5Dar5(){

        timeLabel = new JLabel();
        timeLabel.setBounds(195,470,200,100);
        timeLabel.setForeground(Color.WHITE);
        timeLabel.setFont(new Font("Verdana",Font.PLAIN,30));
        add(timeLabel);
    
        
        btn9 =new JButton("9");
        btn10 =new JButton("10");
        btn11 =new JButton("11");
        btn12 =new JButton("12");
        btn13 =new JButton("13");
        btn14 =new JButton("14");
        btn15 =new JButton("15");
        btn16 =new JButton("16");
        btn17 =new JButton("17");
        btn18 =new JButton("18");
        btn19 =new JButton("19");
        btn20 =new JButton("20");
        btn21 =new JButton("21");
        btn22 =new JButton("22");
        btn23 =new JButton("23");
        btn24 =new JButton("24");
        btn25 =new JButton(" ");


 btn1.setFont(new Font("homa", Font.BOLD, 30));
                        btn2.setFont(new Font("homa", Font.BOLD, 30));
                        btn3.setFont(new Font("homa", Font.BOLD, 30));
                        btn4.setFont(new Font("homa", Font.BOLD, 30));
                        btn5.setFont(new Font("homa", Font.BOLD, 30));
                        btn6.setFont(new Font("homa", Font.BOLD, 30));
                        btn7.setFont(new Font("homa", Font.BOLD, 30));
                        btn8.setFont(new Font("homa", Font.BOLD, 30));
                        btn9.setFont(new Font("homa", Font.BOLD, 30));
                        btn10.setFont(new Font("homa", Font.BOLD, 30));
                        btn11.setFont(new Font("homa", Font.BOLD, 30));
                        btn12.setFont(new Font("homa", Font.BOLD, 30));
                        btn13.setFont(new Font("homa", Font.BOLD, 30));
                        btn14.setFont(new Font("homa", Font.BOLD, 30));
                        btn15.setFont(new Font("homa", Font.BOLD, 30));
                        btn16.setFont(new Font("homa", Font.BOLD, 30));
                        btn17.setFont(new Font("homa", Font.BOLD, 30));
                        btn18.setFont(new Font("homa", Font.BOLD, 30));
                        btn19.setFont(new Font("homa", Font.BOLD, 30));
                        btn20.setFont(new Font("homa", Font.BOLD, 30));
                        btn21.setFont(new Font("homa", Font.BOLD, 30));
                        btn22.setFont(new Font("homa", Font.BOLD, 30));
                        btn23.setFont(new Font("homa", Font.BOLD, 30));
                        btn24.setFont(new Font("homa", Font.BOLD, 30));
                        btn25.setFont(new Font("homa", Font.BOLD, 30));
        
 
   
        
        
        btn1.setBounds(48,100,75,75);
        btn2.setBounds(128,100,75,75);
        btn3.setBounds(208,100,75,75);
        btn4.setBounds(288,100,75,75);
        btn5.setBounds(368,100,75,75);
        btn6.setBounds(48,180,75,75);
        btn7.setBounds(128,180,75,75);
        btn8.setBounds(208,180,75,75);
        btn9.setBounds(288,180,75,75);
        btn10.setBounds(368,180,75,75);
        btn11.setBounds(48,260,75,75);
        btn12.setBounds(128,260,75,75);
        btn13.setBounds(208,260,75,75);
        btn14.setBounds(288,260,75,75);
        btn15.setBounds(368,260,75,75); 
        btn16.setBounds(48,340,75,75);
        btn17.setBounds(128,340,75,75);
        btn18.setBounds(208,340,75,75);
        btn19.setBounds(288,340,75,75);
        btn20.setBounds(368,340,75,75);
        btn21.setBounds(48,420,75,75);
        btn22.setBounds(128,420,75,75);
        btn23.setBounds(208,420,75,75);
        btn24.setBounds(288,420,75,75);
        btn25.setBounds(368,420,75,75);



                
         MacaneDorost();                

        
        add(btn9);
        add(btn10);
        add(btn11);
        add(btn12);
        add(btn13);
        add(btn14);
        add(btn15);
        add(btn16);
        add(btn17);
        add(btn18);
        add(btn19);
        add(btn20);
        add(btn21);
        add(btn22);
        add(btn23);
        add(btn24);
        add(btn25);
      

        
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn1, btn2);
                move(btn1, btn6);
                MacaneDorost();                


                        }
        });
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn2, btn1);
                move(btn2, btn3);
                move(btn2, btn7);
                MacaneDorost();                


                        }
        });
        btn3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn3, btn2);
                move(btn3, btn4);
                move(btn3, btn8);
                MacaneDorost();                


                        }
        });
        btn4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn4, btn3);
                move(btn4, btn5);
                move(btn4, btn9);
                MacaneDorost();                


                                        }
        });
        btn5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn5, btn4);
                move(btn5, btn10);
                
                MacaneDorost();                


                        }
        });
        btn6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn6, btn1);
                move(btn6, btn7);
                move(btn6, btn11);
                MacaneDorost();                


                        }
        });
        btn7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn7, btn2);
                move(btn7, btn6);
                move(btn7, btn8);
                move(btn7, btn12);
                MacaneDorost();                


                        }
        });
        btn8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn8, btn3);
                move(btn8, btn7);
                move(btn8, btn9);
                move(btn8, btn13);
                MacaneDorost();                


                        }
        });
        btn9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn9, btn4);
                move(btn9, btn8);
                move(btn9, btn10);
                move(btn9, btn14);
                MacaneDorost();                

                        }
        });
        btn10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn10, btn5);
                move(btn10, btn9);
                move(btn10, btn15);
                
                MacaneDorost();                

                        }
        });
        btn11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn11, btn6);
                move(btn11, btn12);
                move(btn11, btn16);
                MacaneDorost();                

                        }
        });
        btn12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn12, btn7);
                move(btn12, btn11);
                move(btn12, btn13);
                move(btn12, btn17);
                MacaneDorost();                

                        }
        });
        btn13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn13, btn12);
                move(btn13, btn8);
                move(btn13, btn14);
                move(btn13, btn18);
                MacaneDorost();                


                        }
        });
        btn14.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn14, btn13);
                move(btn14, btn9);
                move(btn14, btn15);
                move(btn14, btn19);
                MacaneDorost();                


                        }
        });
        btn15.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn15, btn10);
                move(btn15, btn14);
                move(btn15, btn20);
                MacaneDorost();                


                        }
        });
        btn16.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn16, btn11);
                move(btn16, btn17);
                move(btn16, btn21);
                MacaneDorost();                


                        }
        });
        btn17.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn17, btn12);
                move(btn17, btn16);
                move(btn17, btn18);
                move(btn17, btn22);
                MacaneDorost();                

                        }
        });
        btn18.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn18, btn13);
                move(btn18, btn17);
                move(btn18, btn19);
                move(btn18, btn23);
                MacaneDorost();                


                        }
        });
        btn19.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn19, btn14);
                move(btn19, btn18);
                move(btn19, btn20);
                move(btn19, btn24);
                MacaneDorost();                


                        }
        });
        btn20.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn20, btn15);
                move(btn20, btn19);
                move(btn20, btn25);
                MacaneDorost();                


                        }
        });
        btn21.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn21, btn16);
                move(btn21, btn22);
                MacaneDorost();                


                        }
        });
        btn22.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn22, btn17);
                move(btn22, btn21);
                move(btn22, btn23);
                MacaneDorost();                

                        }
        });
        btn23.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn23, btn18);
                move(btn23, btn22);
                move(btn23, btn24);
                MacaneDorost();


                        }
        });
        btn24.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn24, btn19);
                move(btn24, btn23);
                move(btn24, btn25);
                MacaneDorost();

                        }
        });
        btn25.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn25, btn20);
                move(btn25, btn24);
                MacaneDorost();

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
        stop.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 if (b==true){
                    b=false;
                    off(b);
                            
                }
                else{
                    b=true;
                    off(b);
                }
               if (e.getSource()==stop && started == true){
                   started=false;
		   stop.setText("ادامه");
		   stop();
		           back.setBounds(190,420,100,50);
                           stop.setBounds(190,240,100,50);
                            restart.setBounds(190,330,100,50);
                            timeLabel.setBounds(195,120,200,100);
               }
               else if (e.getSource()==stop&& started == false) {
                    started=true;
                    stop.setText("توقف");
                    start();  
		    back.setBounds(310,555,100,50);
                    stop.setBounds(70,555,100,50);
                    restart.setBounds(70,555,100,50);
                    timeLabel.setBounds(195,470,200,100);
                }
                
            }
        });
        
        
        
        restart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b=true;
                off(b);
                stop.setVisible(true);
                JayeRandomDokme();
                MacaneDorost();
                started=true;
		reset();
                start();
		restart.setBounds(190,555,100,50);
            }
        });
        
    }
        
 public void JayeRandomDokme(){
          Random rand = new Random();

    ArrayList<String> list1=new ArrayList<>();   
    for (int i =1;i<25;i++){    
    list1.add(Integer.toString(i));
    }
            System.out.println(list1.toString());

    
    int Adad1 = rand.nextInt(24);
    String Number1 = list1.get(Adad1);
    list1.remove(Number1);

    int Adad2 = rand.nextInt(23);
    String Number2 = list1.get(Adad2);
    list1.remove(Number2);

    int Adad3 = rand.nextInt(22);
    String Number3 = list1.get(Adad3);
    list1.remove(Number3);

    int Adad4 = rand.nextInt(21);
    String Number4 = list1.get(Adad4);
    list1.remove(Number4);

    int Adad5 = rand.nextInt(20);
    String Number5 = list1.get(Adad5);
    list1.remove(Number5);

    int Adad6 = rand.nextInt(19);
    String Number6 = list1.get(Adad6);
    list1.remove(Number6);

    int Adad7 = rand.nextInt(18);
    String Number7 = list1.get(Adad7);
    list1.remove(Number7);

    int Adad8 = rand.nextInt(17);
    String Number8 = list1.get(Adad8);
    list1.remove(Number8);
    
    int Adad9 = rand.nextInt(16);
    String Number9 = list1.get(Adad9);
    list1.remove(Number9);
    
    int Adad10 = rand.nextInt(15);
    String Number10 = list1.get(Adad10);
    list1.remove(Number10);
    
    int Adad11 = rand.nextInt(14);
    String Number11 = list1.get(Adad11);
    list1.remove(Number11);
    
    int Adad12 = rand.nextInt(13);
    String Number12 = list1.get(Adad12);
    list1.remove(Number12);
    
    int Adad13 = rand.nextInt(12);
    String Number13 = list1.get(Adad13);
    list1.remove(Number13);
    
    int Adad14 = rand.nextInt(11);
    String Number14 = list1.get(Adad14);
    list1.remove(Number14);
    
    int Adad15 = rand.nextInt(10);
    String Number15 = list1.get(Adad15);
    list1.remove(Number15);
    
    int Adad16 = rand.nextInt(9);
    String Number16 = list1.get(Adad16);
    list1.remove(Number16);
    
    int Adad17 = rand.nextInt(8);
    String Number17 = list1.get(Adad17);
    list1.remove(Number17);
    
    int Adad18 = rand.nextInt(7);
    String Number18 = list1.get(Adad18);
    list1.remove(Number18);
    
    int Adad19 = rand.nextInt(6);
    String Number19 = list1.get(Adad19);
    list1.remove(Number19);
    
    int Adad20 = rand.nextInt(5);
    String Number20 = list1.get(Adad20);
    list1.remove(Number20);
    
    int Adad21 = rand.nextInt(4);
    String Number21 = list1.get(Adad21);
    list1.remove(Number21);
    
    int Adad22 = rand.nextInt(3);
    String Number22 = list1.get(Adad22);
    list1.remove(Number22);
    
    int Adad23 = rand.nextInt(2);
    String Number23 = list1.get(Adad23);
    list1.remove(Number23);
    
    int Adad24 = rand.nextInt(1);
    String Number24 = list1.get(Adad24);
    list1.remove(Number24);

    String Number25 = "";
    
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
        btn17.setText(Number17);        
        btn18.setText(Number18);        
        btn19.setText(Number19);        
        btn20.setText(Number20);        
        btn21.setText(Number21);        
        btn22.setText(Number22);        
        btn23.setText(Number23);        
        btn24.setText(Number24);        
        btn25.setText(Number25);        

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
         
         if((btn16.getText()!="")&&(16==Integer.parseInt(btn16.getText()))){                 
                    btn16.setBackground(new Color(110, 200, 74));
         }else{btn16.setBackground(new Color(250, 200, 0));}
         
         if((btn17.getText()!="")&&(17==Integer.parseInt(btn17.getText()))){                 
                    btn17.setBackground(new Color(110, 200, 74));
         }else{btn17.setBackground(new Color(250, 200, 0));}
         
         if((btn18.getText()!="")&&(18==Integer.parseInt(btn18.getText()))){                 
                    btn18.setBackground(new Color(110, 200, 74));
         }else{btn18.setBackground(new Color(250, 200, 0));}
         
         if((btn19.getText()!="")&&(19==Integer.parseInt(btn19.getText()))){                 
                    btn19.setBackground(new Color(110, 200, 74));
         }else{btn19.setBackground(new Color(250, 200, 0));}
         
         if((btn20.getText()!="")&&(20==Integer.parseInt(btn20.getText()))){                 
                    btn20.setBackground(new Color(110, 200, 74));
         }else{btn20.setBackground(new Color(250, 200, 0));}
         
         if((btn21.getText()!="")&&(21==Integer.parseInt(btn21.getText()))){                 
                    btn21.setBackground(new Color(110, 200, 74));
         }else{btn21.setBackground(new Color(250, 200, 0));}
         
         if((btn22.getText()!="")&&(22==Integer.parseInt(btn22.getText()))){                 
                    btn22.setBackground(new Color(110, 200, 74));
         }else{btn22.setBackground(new Color(250, 200, 0));}
         
         if((btn23.getText()!="")&&(23==Integer.parseInt(btn23.getText()))){                 
                    btn23.setBackground(new Color(110, 200, 74));
         }else{btn23.setBackground(new Color(250, 200, 0));}
         
         if((btn24.getText()!="")&&(24==Integer.parseInt(btn24.getText()))){                 
                    btn24.setBackground(new Color(110, 200, 74));
         }else{btn24.setBackground(new Color(250, 200, 0));}
         
         
    }

         btn25.setBackground(new Color(250, 200, 0));

     if (btn16.getText()!=""&&btn8.getText()!=""&&btn1.getText()!=""&&btn2.getText()!=""&&btn3.getText()!=""&&btn4.getText()!=""&&btn5.getText()!=""&&btn6.getText()!=""&&btn7.getText()!=""&&btn9.getText()!=""&&btn10.getText()!=""&&btn11.getText()!=""&&btn13.getText()!=""&&btn14.getText()!=""&&btn15.getText()!=""&&btn12.getText()!=""&&1==Integer.parseInt(btn1.getText())&&2==Integer.parseInt(btn2.getText())&&3==Integer.parseInt(btn3.getText())&&4==Integer.parseInt(btn4.getText())&&5==Integer.parseInt(btn5.getText())&&6==Integer.parseInt(btn6.getText())&&7==Integer.parseInt(btn7.getText())&&8==Integer.parseInt(btn8.getText())&&9==Integer.parseInt(btn9.getText())&&10==Integer.parseInt(btn10.getText())&&11==Integer.parseInt(btn11.getText())&&12==Integer.parseInt(btn12.getText())&&13==Integer.parseInt(btn13.getText())&&14==Integer.parseInt(btn14.getText())&&15==Integer.parseInt(btn15.getText())) {
     if (btn25.getText()==""&&btn17.getText()!=""&&btn18.getText()!=""&&btn21.getText()!=""&&btn22.getText()!=""&&btn23.getText()!=""&&btn24.getText()!=""&&btn19.getText()!=""&&btn20.getText()!=""&&16==Integer.parseInt(btn16.getText())&&17==Integer.parseInt(btn17.getText())&&18==Integer.parseInt(btn18.getText())&&19==Integer.parseInt(btn19.getText())&&20==Integer.parseInt(btn20.getText())&&21==Integer.parseInt(btn21.getText())&&22==Integer.parseInt(btn22.getText())&&23==Integer.parseInt(btn23.getText())&&24==Integer.parseInt(btn24.getText())){
                String ssss= JOptionPane.showInputDialog(null, "تو بردي  توخيلي خوبي  حالا اسمت رو بنويس:","نام",PLAIN_MESSAGE);
                Emtiaz+=10;

                System.out.println(ssss);
     
     }} 
        
    }
        
    
        public void move(JButton button1,JButton button2){
        if (button2.getText() == "")
        {
            button2.setText(button1.getText());
            button1.setText("");
        }
}
    
    
    
    
        
   
    
    
    
}
