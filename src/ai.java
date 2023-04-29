/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mahmed
 */

public class ai {
  
    public void preformmove(board b) 
    {
    aimoves a=new aimoves();
    
    a=getbestmove(b, 2);
    b.setplay(a.x, a.y, 2);
    
    }
    
    public aimoves getbestmove(board b,int player)
    { 
    int x=b.checkwin();
    if(x==2){aimoves m=new aimoves(10);   return m; }
    else if (x==1){aimoves m=new aimoves(-10);   return m;}
    else if(x==0){aimoves m=new aimoves(0);   return m;}
           List<aimoves> best=new ArrayList<aimoves>();
         for(int i=0;i<3;i++)
         {
         for(int j=0;j<3;j++)
         {
         point p=new point(i, j);
         if(b.ar[i][j]==-1){ 
         aimoves moves =new aimoves();
         moves.x=i;
         moves.y=j;
        
         b.setplay(i, j, player); 
         if(player==2){
              
         moves.score=getbestmove(b,1).score;
         }
         else{
         moves.score=getbestmove(b,2).score;
         
         }
         best.add(moves);
         
          b.setplay(i, j,0);
         }
         }
         
         }int bestmove=0;
  
    if(player==2){
    int bestscore=-10000;
      for(int i=0;i<best.size();i++)
    {
     if(best.get(i).score > bestscore){
         bestmove=i;
         bestscore=best.get(i).score;
     
     }   
    }
    }
    else
    {
    int bestscore=10000;
      for(int i=0;i<best.size();i++)
    {
     if(best.get(i).score < bestscore){
         bestmove=i;
         bestscore=best.get(i).score;
     
     }   
    }
    
    }
   
    return best.get(bestmove);
    }
    
    
    
    
    
    }
    

