package main;


import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JOptionPane.PLAIN_MESSAGE;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class game3x3easy extends DokmeHa{
    
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
    
    public JLabel timeLabel;
public   boolean random2;

    public game3x3easy(){
	    
	 btn9 =new JButton(" ");
        
         btn1.setFont(new Font("homa", Font.BOLD, 50));
         btn2.setFont(new Font("homa", Font.BOLD, 50));
         btn3.setFont(new Font("homa", Font.BOLD, 50));
         btn4.setFont(new Font("homa", Font.BOLD, 50));
         btn5.setFont(new Font("homa", Font.BOLD, 50));
         btn6.setFont(new Font("homa", Font.BOLD, 50));
         btn7.setFont(new Font("homa", Font.BOLD, 50));
         btn8.setFont(new Font("homa", Font.BOLD, 50));
         btn9.setFont(new Font("homa", Font.BOLD, 50));
        

        btn1.setBounds(87,100,95,95);
        btn2.setBounds(192,100,95,95);
        btn3.setBounds(297,100,95,95);
        btn4.setBounds(87,205,95,95);
        btn5.setBounds(192,205,95,95);
        btn6.setBounds(297,205,95,95);
        btn7.setBounds(87,310,95,95);
        btn8.setBounds(192,310,95,95);
        btn9.setBounds(297,310,95,95);
	    
         add(btn9);
        
        timeLabel = new JLabel();
        timeLabel.setBounds(195,400,200,100);
        timeLabel.setForeground(Color.WHITE);
        timeLabel.setFont(new Font("Verdana",Font.PLAIN,30));
        add(timeLabel);
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
		   random2=false;

		   stop.setText("ادامه");
		   stop();
		                                  back.setBounds(190,420,100,50);
                           stop.setBounds(190,240,100,50);
                            restart.setBounds(190,330,100,50);
                            timeLabel.setBounds(195,120,200,100);
               }
               else if (e.getSource()==stop&& started == false) {
                    started=true;
		     random2=true;
                    stop.setText("توقف");
                    start();  
		                            back.setBounds(310,555,100,50);
                    stop.setBounds(70,555,100,50);
                                       restart.setBounds(190,555,100,50);
                    timeLabel.setBounds(195,470,200,100);
                }
                
            }
        });
        
        
        
        restart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
		    
		    
		     if(random2==false){
                    stop.setText("توقف");
                
		 back.setBounds(310,555,100,50);
                    stop.setBounds(70,555,100,50);
                                       restart.setBounds(190,555,100,50);
                    timeLabel.setBounds(195,470,200,100);
                                            off(b);
                stop.setVisible(true);
                JayeRandomDokme();
                MacaneDorost();
                started=true;
		reset();
                start();
                }
		    
		    
		    
                b=true;
                off(b);
                stop.setVisible(true);
                JayeRandomDokme();
                MacaneDorost();
                started=true;
		reset();
                start();
		     restart.setBounds(190,555,100,50);
                restart.setText("از نو");
            }
        });
        rahnama.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
              new RahnamyeAsan();
              
                        }
        });

    }
    
    
        public void move(JButton button1,JButton button2){
        if (button2.getText() == "")
        {
            button2.setText(button1.getText());
            button1.setText("");
        }}

        
        
        
    public void JayeRandomDokme(){
          Random rand = new Random();

    ArrayList<String> list1=new ArrayList<>();   
    for (int i =1;i<9;i++){    
    list1.add(Integer.toString(i));
    }

    
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

     if (btn9.getText()==""&&btn8.getText()!=""&&btn1.getText()!=""&&btn2.getText()!=""&&btn3.getText()!=""&&btn4.getText()!=""&&btn5.getText()!=""&&btn6.getText()!=""&&btn7.getText()!=""&&1==Integer.parseInt(btn1.getText())&&2==Integer.parseInt(btn2.getText())&&3==Integer.parseInt(btn3.getText())&&4==Integer.parseInt(btn4.getText())&&5==Integer.parseInt(btn5.getText())&&6==Integer.parseInt(btn6.getText())&&7==Integer.parseInt(btn7.getText())&&8==Integer.parseInt(btn8.getText())){
        String name= JOptionPane.showInputDialog(null, "تو بردي  توخيلي خوبي  حالا اسمت رو بنويس:","نام",PLAIN_MESSAGE);

                String zaman = minutes_string+":"+seconds_string;
	      String [][] jadval={{zaman,name}};
              new  RecordHa(jadval);
              setVisible(false);
        } 
     
        
     
        
     
     
     
     
    }
    
}
