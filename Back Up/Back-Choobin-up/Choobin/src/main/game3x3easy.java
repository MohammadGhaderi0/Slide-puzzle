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



public class game3x3easy extends JFrame{
    
    public void move(JButton button1,JButton button2){
        if (button2.getText() == "")
        {
            button2.setText(button1.getText());
            button1.setText("");
        }
}
    
    
    
    public void TabeyeRandomKardaneJayeDokmehaBaZadaneDokmeRestart(){
    
    
ArrayList<String > table = new ArrayList<String>();

table.add("80 100");
table.add("80 210");
table.add("80 320");
table.add("190 100");
table.add("190 210");
table.add("190 320");
table.add("300 100");
table.add("300 210");
table.add("300 320");
  
      
        int AdadeYek=RandomKardaneJayeDokmeha.nextInt(8);
        String AdadeOne = table.get(AdadeYek);
        table.remove(AdadeOne);
        String[] MokhtasateAdadeYek = AdadeOne.split(" ");
        int MokhtasateXAdadeYek =Integer.parseInt(MokhtasateAdadeYek[0]) ;
        int MokhtasateYAdadeYek =Integer.parseInt(MokhtasateAdadeYek[1]) ; 
         
        int AdadeDo=RandomKardaneJayeDokmeha.nextInt(7);
        String AdadeTwo = table.get(AdadeDo);
        table.remove(AdadeTwo);
        String[] MokhtasateAdadeDo = AdadeTwo.split(" ");
        int MokhtasateXAdadeDo =Integer.parseInt(MokhtasateAdadeDo[0]) ;
        int MokhtasateYAdadeDo =Integer.parseInt(MokhtasateAdadeDo[1]) ; 
        
        int AdadeSe=RandomKardaneJayeDokmeha.nextInt(6);
        String AdadeThree = table.get(AdadeSe);
        table.remove(AdadeThree);
        String[] MokhtasateAdadeSe= AdadeThree.split(" ");
        int MokhtasateXAdadeSe =Integer.parseInt(MokhtasateAdadeSe[0]) ;
        int MokhtasateYAdadeSe =Integer.parseInt(MokhtasateAdadeSe[1]) ; 
   
        int AdadeChahar=RandomKardaneJayeDokmeha.nextInt(5);
        String Adadefour = table.get(AdadeChahar);
        table.remove(Adadefour);
        String[] MokhtasateAdadeChahar = Adadefour.split(" ");
        int MokhtasateXAdadeChahar =Integer.parseInt(MokhtasateAdadeChahar[0]) ;
        int MokhtasateYAdadeChahar =Integer.parseInt(MokhtasateAdadeChahar[1]) ; 
        
        int AdadePanj=RandomKardaneJayeDokmeha.nextInt(4);
        String AdadeFive = table.get(AdadePanj);
        table.remove(AdadeFive);
        String[] MokhtasateAdadePanj = AdadeFive.split(" ");
        int MokhtasateXAdadePanj =Integer.parseInt(MokhtasateAdadePanj[0]) ;
        int MokhtasateYAdadePanj =Integer.parseInt(MokhtasateAdadePanj[1]) ; 
        
        int AdadeShesh=RandomKardaneJayeDokmeha.nextInt(3);
        String AdadeSix = table.get(AdadeShesh);
        table.remove(AdadeSix);
        String[] MokhtasateAdadeShesh = AdadeSix.split(" ");
        int MokhtasateXAdadeShesh =Integer.parseInt(MokhtasateAdadeShesh[0]) ;
        int MokhtasateYAdadeShesh =Integer.parseInt(MokhtasateAdadeShesh[1]) ; 

        
        int AdadeHaft=RandomKardaneJayeDokmeha.nextInt(2);
        String AdadeSeven = table.get(AdadeHaft);
        table.remove(AdadeSeven);
        String[] MokhtasateAdadeHaft = AdadeSeven.split(" ");
        int MokhtasateXAdadeHaft =Integer.parseInt(MokhtasateAdadeHaft[0]) ;
        int MokhtasateYAdadeHaft =Integer.parseInt(MokhtasateAdadeHaft[1]) ; 
  
        int AdadeHasht=RandomKardaneJayeDokmeha.nextInt(1);
        String AdadeEight = table.get(AdadeHasht);
        table.remove(AdadeEight);
        String[] MokhtasateAdadeHasht= AdadeEight.split(" ");
        int MokhtasateXAdadeHasht =Integer.parseInt(MokhtasateAdadeHasht[0]) ;
        int MokhtasateYAdadeHasht =Integer.parseInt(MokhtasateAdadeHasht[1]) ; 
        
        String AdadeEmpty = table.get(0); 
        String[] MokhtasateAdadeEmpty = AdadeEmpty.split(" ");
        int MokhtasateXAdadeEmpty =Integer.parseInt(MokhtasateAdadeEmpty[0]) ;
        int MokhtasateYAdadeEmpty =Integer.parseInt(MokhtasateAdadeEmpty[1]) ; 

        
        btn1.setBounds(MokhtasateXAdadeYek,MokhtasateYAdadeYek,70,70);        
        btn2.setBounds(MokhtasateXAdadeDo,MokhtasateYAdadeDo,70,70);
        btn3.setBounds(MokhtasateXAdadeSe,MokhtasateYAdadeSe,70,70);
        btn4.setBounds(MokhtasateXAdadeChahar, MokhtasateYAdadeChahar, 70, 70);
        btn5.setBounds(MokhtasateXAdadePanj,MokhtasateYAdadePanj,70,70);
        btn6.setBounds(MokhtasateXAdadeShesh,MokhtasateYAdadeShesh,70,70);
        btn7.setBounds(MokhtasateXAdadeHaft,MokhtasateYAdadeHaft,70,70);
        btn8.setBounds(MokhtasateXAdadeHasht,MokhtasateYAdadeHasht,70,70);
        btn9.setBounds(MokhtasateXAdadeEmpty,MokhtasateYAdadeEmpty,70,70);
       
    
    
    }
    

    public Random RandomKardaneJayeDokmeha = new Random();
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
    public JButton Restart;


    
    
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
        Restart = new JButton("از نو");

        TabeyeRandomKardaneJayeDokmehaBaZadaneDokmeRestart();
        back.setBounds(320,570,100,50);
        Restart.setBounds(100,570,100,50);
        
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
        add(Restart);

       

        
        
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn1, btn4);
                move(btn1, btn2);
                        }
        });
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn2, btn3);
                move(btn2, btn5);
                move(btn2, btn1);
                        }
        });
        btn3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn3, btn4);
                move(btn3, btn2);
                        }
        });
        btn4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn4, btn5);
                move(btn4, btn1);
                move(btn4, btn7);
                        }
        });
        btn5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn5, btn2);
                move(btn5, btn4);
                move(btn5, btn6);
                move(btn5, btn8);
                        }
        });
        btn6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn6, btn3);
                move(btn6, btn5);
                move(btn6, btn9);
                        }
        });
        btn7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn7, btn8);
                move(btn7, btn4);
                        }
        });
        btn8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn8, btn9);
                move(btn8, btn7);
                move(btn8, btn5);
                        }
        });
        btn9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn9, btn6);
                move(btn9, btn8);
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
        
        
        
        Restart.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                                TabeyeRandomKardaneJayeDokmehaBaZadaneDokmeRestart();

                        }
        });
        
      
    
    }
    
}
