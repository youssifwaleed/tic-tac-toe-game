
import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author mahmed
 */
public abstract class computer {
     public String name1;
     public String turn="X";
     public  int[] founded=new int[9];
     public boolean full=false;
     public int c=0;
     public boolean win=false;
      public boolean game_ended=false;
  
     public Random rand = new Random();
        public int computer_play ;
        
     public abstract void computer_plays(JButton j1,JButton j2,JButton j3,JButton j4,JButton j5,JButton j6,JButton j7,JButton j8,JButton j9);
public void reset(JButton j1,JButton j2,JButton j3,JButton j4,JButton j5,JButton j6,JButton j7,JButton j8,JButton j9)
{
          enable_btns(j1,j2,j3,j4,j5,j6,j7,j8,j9);
        j1.setText(null);
        j2.setText(null);
        j3.setText(null);
        j4.setText(null);
        j5.setText(null);
        j6.setText(null);
        j7.setText(null);
        j8.setText(null);
        j9.setText(null);
        game_ended=false;
        turn="X";
        c=0;
         for(int i=0;i<9;i++)
  {
  founded[i]=-1;
  }
    }

 public void enable_btns(JButton j1,JButton j2,JButton j3,JButton j4,JButton j5,JButton j6,JButton j7,JButton j8,JButton j9){
        j1.setEnabled(true);
        j2.setEnabled(true);
        j3.setEnabled(true);
        j4.setEnabled(true);
        j5.setEnabled(true);
        j6.setEnabled(true);
        j7.setEnabled(true);
        j8.setEnabled(true);
        j9.setEnabled(true);
        
    }

 
 public void player_Wins(JFrame f,JButton j1,JButton j2,JButton j3,JButton j4,JButton j5,JButton j6,JButton j7,JButton j8,JButton j9){
        JOptionPane.showMessageDialog(f," you wins","Winner!",JOptionPane.INFORMATION_MESSAGE);
        game_ended=true;
        reset(j1,j2,j3,j4,j5,j6,j7,j8,j9);
    }
 
 public void player_lose(JFrame f,JButton j1,JButton j2,JButton j3,JButton j4,JButton j5,JButton j6,JButton j7,JButton j8,JButton j9){
        JOptionPane.showMessageDialog(f," you lose","Game over!",JOptionPane.INFORMATION_MESSAGE);
        game_ended=true;
        reset(j1,j2,j3,j4,j5,j6,j7,j8,j9);
       
    }
  
  public void check_Winner(JFrame f,JButton j1,JButton j2,JButton j3,JButton j4,JButton j5,JButton j6,JButton j7,JButton j8,JButton j9){
       String b1 = j1.getText();
        String b2 = j2.getText();
        String b3 = j3.getText();
        String b6 = j4.getText();
        String b5 = j5.getText();
        String b4 = j6.getText();
        String b7 = j7.getText();
        String b8 = j8.getText();
        String b9 = j9.getText();
        if(b1=="X"&&b2=="X"&&b3=="X"){
           
             
             player_Wins(f,j1,j2,j3,j4,j5,j6,j7,j8,j9);
             
           
        }
        if(b4=="X"&&b5=="X"&&b6=="X"){
           
           
              player_Wins(f,j1,j2,j3,j4,j5,j6,j7,j8,j9);
        }
        if(b7=="X"&&b8=="X"&&b9=="X"){
            
           
              player_Wins(f,j1,j2,j3,j4,j5,j6,j7,j8,j9);
        }
        if(b1=="X"&&b5=="X"&&b9=="X"){
        
        
            player_Wins(f,j1,j2,j3,j4,j5,j6,j7,j8,j9);
        }
        if(b3=="X"&&b5=="X"&&b7=="X"){
            
           
             player_Wins(f,j1,j2,j3,j4,j5,j6,j7,j8,j9);
        }
        if(b1=="X"&&b4=="X"&&b7=="X"){
             
            
               player_Wins(f,j1,j2,j3,j4,j5,j6,j7,j8,j9);
        }
        if(b2=="X"&&b5=="X"&&b8=="X"){
            
            
                player_Wins(f,j1,j2,j3,j4,j5,j6,j7,j8,j9);
        }
        if(b3=="X"&&b6=="X"&&b9=="X"){
           
            
              player_Wins(f,j1,j2,j3,j4,j5,j6,j7,j8,j9);
        }
        if(b1=="O"&&b2=="O"&&b3=="O"){
            player_lose(f,j1,j2,j3,j4,j5,j6,j7,j8,j9);
        }
        if(b4=="O"&&b5=="O"&&b6=="O"){
            player_lose(f,j1,j2,j3,j4,j5,j6,j7,j8,j9);
        }
        if(b7=="O"&&b8=="O"&&b9=="O"){
            player_lose(f,j1,j2,j3,j4,j5,j6,j7,j8,j9);
        }
        if(b1=="O"&&b5=="O"&&b9=="O"){
           player_lose(f,j1,j2,j3,j4,j5,j6,j7,j8,j9);
        }
        if(b3=="O"&&b5=="O"&&b7=="O"){
            player_lose(f,j1,j2,j3,j4,j5,j6,j7,j8,j9);
            
        }
        if(b1=="O"&&b4=="O"&&b7=="O"){
            player_lose(f,j1,j2,j3,j4,j5,j6,j7,j8,j9);
        }
        if(b2=="O"&&b5=="O"&&b8=="O"){
            player_lose(f,j1,j2,j3,j4,j5,j6,j7,j8,j9);
        }
        if(b3=="O"&&b6=="O"&&b9=="O"){
            player_lose(f,j1,j2,j3,j4,j5,j6,j7,j8,j9);
        }
 }
  public void check_Tie(JFrame f,JButton j1,JButton j2,JButton j3,JButton j4,JButton j5,JButton j6,JButton j7,JButton j8,JButton j9){
      if(game_ended==false&&c==9)
      {
            JOptionPane.showMessageDialog(f,"This game is a tie","Tie",JOptionPane.INFORMATION_MESSAGE);
            game_ended=false;
             reset(j1,j2,j3,j4,j5,j6,j7,j8,j9);
        }
     
    }
}


class hard extends computer
{
board b=new board();
ai hard=new ai();
aimoves move=new aimoves();
    @Override
    public void computer_plays(JButton j1, JButton j2, JButton j3, JButton j4, JButton j5, JButton j6, JButton j7, JButton j8, JButton j9) {
    
     for(int i=0;i<3;i++)
         {
         for(int j=0;j<3;j++)
         {
         
         b.ar[i][j]=-1;
         }
         
         }
        if(j1.getText()=="X"){b.setplay(0, 0, 1);}
        else if(j1.getText()=="O"){b.setplay(0, 0, 2);}
    
    
        if(j2.getText()=="X"){b.setplay(0, 1, 1);}
        else  if(j2.getText()=="O"){b.setplay(0, 1, 2);}
    
 
        if(j3.getText()=="X"){b.setplay(0, 2, 1);}
        else  if(j3.getText()=="O"){b.setplay(0, 2, 2);}
    
   
        if(j4.getText()=="X"){b.setplay(1, 2, 1);}
        else if(j4.getText()=="O"){b.setplay(1, 2, 2);}
   
        if(j5.getText()=="X"){b.setplay(1, 1, 1);}
        else if(j5.getText()=="O"){b.setplay(1, 1, 2);}
    
    
        if(j6.getText()=="X"){b.setplay(1, 0, 1);}
        else if(j6.getText()=="O"){b.setplay(1, 0, 2);}
    
        if(j7.getText()=="X"){b.setplay(2, 0, 1);}
        else if(j7.getText()=="O"){b.setplay(2, 0, 2);}
    
    
        if(j8.getText()=="X"){b.setplay(2, 1, 1);}
        else if(j8.getText()=="O"){b.setplay(2, 1, 2);}
   
        if(j9.getText()=="X"){b.setplay(2,2, 1);}
        else if(j9.getText()=="O"){b.setplay(2, 2, 2);}
    
    move=hard.getbestmove(b, 2);
   
    
    if(move.x==0&&move.y==0){j1.setText("O"); j1.setEnabled(false);   founded[c]=0; c++; }
    if(move.x==0&&move.y==1){j2.setText("O");  j2.setEnabled(false);  founded[c]=1; c++;}
    if(move.x==0&&move.y==2){j3.setText("O"); j3.setEnabled(false);      founded[c]=2; c++;}
    if(move.x==1&&move.y==0){j6.setText("O");     j6.setEnabled(false);     founded[c]=3; c++; }
    if(move.x==1&&move.y==1){j5.setText("O");    j5.setEnabled(false); founded[c]=4; c++;}
    if(move.x==1&&move.y==2){j4.setText("O");     j4.setEnabled(false); founded[c]=5; c++;}
    if(move.x==2&&move.y==0){j7.setText("O");      j7.setEnabled(false); founded[c]=6; c++;}
    if(move.x==2&&move.y==1){j8.setText("O");    j8.setEnabled(false);   founded[c]=7; c++;}
    if(move.x==2&&move.y==2){j9.setText("O");    j9.setEnabled(false);   founded[c]=8; c++;}
    }

    
    
}
     
      
class medium extends computer
{
board b=new board();
ai hard=new ai();
aimoves move=new aimoves();
    @Override
    public void computer_plays(JButton j1, JButton j2, JButton j3, JButton j4, JButton j5, JButton j6, JButton j7, JButton j8, JButton j9) {
     
        if(c<6){
       
    for(int i=0;i<3;i++)
         {
         for(int j=0;j<3;j++)
         {
         
         b.ar[i][j]=-1;
         }
         
         }
        if(j1.getText()=="X"){b.setplay(0, 0, 1);}
        else if(j1.getText()=="O"){b.setplay(0, 0, 2);}
    
    
        if(j2.getText()=="X"){b.setplay(0, 1, 1);}
        else  if(j2.getText()=="O"){b.setplay(0, 1, 2);}
    
 
        if(j3.getText()=="X"){b.setplay(0, 2, 1);}
        else  if(j3.getText()=="O"){b.setplay(0, 2, 2);}
    
   
        if(j4.getText()=="X"){b.setplay(1, 2, 1);}
        else if(j4.getText()=="O"){b.setplay(1, 2, 2);}
   
        if(j5.getText()=="X"){b.setplay(1, 1, 1);}
        else if(j5.getText()=="O"){b.setplay(1, 1, 2);}
    
    
        if(j6.getText()=="X"){b.setplay(1, 0, 1);}
        else if(j6.getText()=="O"){b.setplay(1, 0, 2);}
    
        if(j7.getText()=="X"){b.setplay(2, 0, 1);}
        else if(j7.getText()=="O"){b.setplay(2, 0, 2);}
    
    
        if(j8.getText()=="X"){b.setplay(2, 1, 1);}
        else if(j8.getText()=="O"){b.setplay(2, 1, 2);}
   
        if(j9.getText()=="X"){b.setplay(2,2, 1);}
        else if(j9.getText()=="O"){b.setplay(2, 2, 2);}
    
    move=hard.getbestmove(b, 2);
   
    
    if(move.x==0&&move.y==0){j1.setText("O"); j1.setEnabled(false);   founded[c]=0; c++; }
    if(move.x==0&&move.y==1){j2.setText("O");  j2.setEnabled(false);  founded[c]=1; c++;}
    if(move.x==0&&move.y==2){j3.setText("O"); j3.setEnabled(false);      founded[c]=2; c++;}
    if(move.x==1&&move.y==0){j6.setText("O");     j6.setEnabled(false);     founded[c]=5; c++; }
    if(move.x==1&&move.y==1){j5.setText("O");    j5.setEnabled(false); founded[c]=4; c++;}
    if(move.x==1&&move.y==2){j4.setText("O");     j4.setEnabled(false); founded[c]=3; c++;}
    if(move.x==2&&move.y==0){j7.setText("O");      j7.setEnabled(false); founded[c]=6; c++;}
    if(move.x==2&&move.y==1){j8.setText("O");    j8.setEnabled(false);   founded[c]=7; c++;}
    if(move.x==2&&move.y==2){j9.setText("O");    j9.setEnabled(false);    founded[c]=8; c++;}
    }
    else{
    
        computer_play= rand.nextInt(9);
      
        for(int i=0;i<9;i++)
        {
        if(computer_play==founded[i])
        { computer_play= rand.nextInt(9);
         i=-1;
   
        }
        }
        System.out.println(c+"   "+computer_play);
         for(int i=0;i<9;i++)
        {
        System.out.println(founded[i]);
        }
       
         
      if(computer_play==0) {j1.setText("O");   j1.setEnabled(false);   founded[c]=0; c++;   }
      else if(computer_play==1){j2.setText("O");   j2.setEnabled(false);  founded[c]=1; c++;}
       else if(computer_play==2){j3.setText("O");   j3.setEnabled(false);      founded[c]=2; c++;}
       else if(computer_play==3){j4.setText("O");       j4.setEnabled(false);     founded[c]=3; c++; }
       else if(computer_play==4){j5.setText("O");    j5.setEnabled(false); founded[c]=4; c++;   }
       else if(computer_play==5){j6.setText("O");   j6.setEnabled(false); founded[c]=5; c++;}
       else if(computer_play==6){j7.setText("O");   j7.setEnabled(false); founded[c]=6; c++;}
       else if(computer_play==7){j8.setText("O");         j8.setEnabled(false);   founded[c]=7; c++;}
       else if(computer_play==8){ j9.setText("O");          j9.setEnabled(false);    founded[c]=8; c++;}

      
      full=false;     
     
       }
         
          for(int i=0;i<9;i++)
        {
        System.out.println(founded[i]);
        }
    
    }
    
    
    
    
    }

      class easy extends computer {

    @Override
    public void computer_plays(JButton j1,JButton j2,JButton j3,JButton j4,JButton j5,JButton j6,JButton j7,JButton j8,JButton j9)
{
       if(c<9&&c!=0)
       {
       computer_play= rand.nextInt(9);
      
        for(int i=0;i<9;i++)
        {
        if(computer_play==founded[i])
        { computer_play= rand.nextInt(9);
         i=-1;
        }
        }
         
       
      if(computer_play==0) {j1.setText("O");   j1.setEnabled(false);   founded[c]=0; c++;   }
      else if(computer_play==1){j2.setText("O");   j2.setEnabled(false);  founded[c]=1; c++;}
       else if(computer_play==2){j3.setText("O");   j3.setEnabled(false);      founded[c]=2; c++;}
       else if(computer_play==3){j4.setText("O");       j4.setEnabled(false);     founded[c]=3; c++; }
       else if(computer_play==4){j5.setText("O");    j5.setEnabled(false); founded[c]=4; c++;   }
       else if(computer_play==5){j6.setText("O");   j6.setEnabled(false); founded[c]=5; c++;}
       else if(computer_play==6){j7.setText("O");   j7.setEnabled(false); founded[c]=6; c++;}
       else if(computer_play==7){j8.setText("O");         j8.setEnabled(false);   founded[c]=7; c++;}
       else if(computer_play==8){ j9.setText("O");          j9.setEnabled(false);    founded[c]=8; c++;}

      full=false;     
      
       }
} 
  
}
