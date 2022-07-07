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
    int elapsedTime = 0;
	int seconds =0;
	int minutes =0;
	int hours =0;
	boolean started = false;
        String seconds_string = String.format("%02d", seconds);
	String minutes_string = String.format("%02d", minutes);
	String hours_string = String.format("%02d", hours);
        
    
    Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            elapsedTime=elapsedTime+1000;
	    hours = (elapsedTime/3600000);
	    minutes = (elapsedTime/60000) % 60;
	    seconds = (elapsedTime/1000) % 60;
            seconds_string = String.format("%02d", seconds);
	    minutes_string = String.format("%02d", minutes);
	    hours_string = String.format("%02d", hours);
	    timeLabel.setText(hours_string+":"+minutes_string+":"+seconds_string);
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
		hours=0;
		seconds_string = String.format("%02d", seconds);
		minutes_string = String.format("%02d", minutes);
		hours_string = String.format("%02d", hours);
		timeLabel.setText(hours_string+":"+minutes_string+":"+seconds_string);
	}
    
    public JLabel timeLabel;

    public game3x3easy(){
        

        
        JayeRandomDokme();
        btn1.setBounds(87,100,95,95);
        btn2.setBounds(192,100,95,95);
        btn3.setBounds(297,100,95,95);
        btn4.setBounds(87,205,95,95);
        btn5.setBounds(192,205,95,95);
        btn6.setBounds(297,205,95,95);
        btn7.setBounds(87,310,95,95);
        btn8.setBounds(192,310,95,95);
        btn9.setBounds(297,310,95,95);
        
        
        timeLabel = new JLabel();
        timeLabel.setBounds(170,400,200,100);
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
                start.setVisible(false);
                if (e.getSource()==start){
                    started=true;
		    start();
                    }
                else{
                    
                }
                          
                        }
        });
        stop.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               started=false;
		stop.setText("ادامه");
		stop();
                if (e.getSource() == stop&& "ادامه".equals(stop.getText())){
                    started=true;
                    start();
                    
                }
            }
        });
        
        
        
        restart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JayeRandomDokme();
                MacaneDorost();
                started=false;
	        start.setText("شروع");
		reset();
                start();
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

         if (1==Integer.parseInt(btn1.getText())&&2==Integer.parseInt(btn2.getText())&&3==Integer.parseInt(btn3.getText())&&4==Integer.parseInt(btn4.getText())&&5==Integer.parseInt(btn5.getText())&&6==Integer.parseInt(btn6.getText())&&7==Integer.parseInt(btn7.getText())&&8==Integer.parseInt(btn8.getText())){
        String ssss= JOptionPane.showInputDialog(null, "تو بردي  توخيلي خوبي  حالا اسمت رو بنويس:","نام",PLAIN_MESSAGE);

                System.out.println(ssss);
        } 
     
        
     
        
     
     
     
     
    }
    
}
