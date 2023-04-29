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
public class board {
  
   int[][] ar=new int[3][3];

    public board() {
        for(int i=0;i<3;i++)
         {
         for(int j=0;j<3;j++)
         {
         
         ar[i][j]=-1;
         }
         
         }
        }
        
     public void setplay(int x,int y,int player)
     {
     if(player ==1){ar[x][y]=1;}
     else if(player==2){
        ar[x][y]=0;
     }
     else {   ar[x][y]=-1;}
    }
     public void display()
     {
          
         for(int i=0;i<3;i++)
         {
         for(int j=0;j<3;j++)
         {
         
          System.out.print("  "+ar[i][j]+" ");
         }
          System.out.println("");
         }
     
     
     }
    public int checkwin()
    {
    if(ar[0][0]==ar[0][1]&&ar[0][0]==ar[0][2]&&ar[0][0]!=-1)
    {
    if(ar[0][0]==1){return 1;}
    else {return 2;}
    }
    else if(ar[1][0]==ar[1][1]&&ar[1][0]==ar[1][2]&&ar[1][0]!=-1)
    {
    if(ar[1][0]==1){return 1;}
    else {return 2;}
    }
    else if(ar[2][0]==ar[2][1]&&ar[2][0]==ar[2][2]&&ar[2][0]!=-1)
    {
    if(ar[2][0]==1){return 1;}
    else {return 2;}
    }
    else if(ar[0][0]==ar[1][0]&&ar[0][0]==ar[2][0]&&ar[0][0]!=-1)
    {
    if(ar[0][0]==1){return 1;}
    else {return 2;}
    }
    else if(ar[0][1]==ar[1][1]&&ar[0][1]==ar[2][1]&&ar[0][1]!=-1)
    {
    if(ar[0][1]==1){return 1;}
    else {return 2;}
    }
    else if(ar[0][2]==ar[1][2]&&ar[0][2]==ar[2][2]&&ar[0][2]!=-1)
    {
    if(ar[0][2]==1){return 1;}
    else {return 2;}
    }
    else if(ar[0][0]==ar[1][1]&&ar[0][0]==ar[2][2]&&ar[0][0]!=-1)
    {
    if(ar[0][0]==1){return 1;}
    else {return 2;}
    }
    else if(ar[0][2]==ar[1][1]&&ar[0][2]==ar[2][0]&&ar[0][2]!=-1)
    {
    if(ar[0][2]==1){return 1;}
    else {return 2;}
    }
    
    else if(checktie())return 0;
    return -1;
    }
    
    
    public boolean checktie()
{
 for(int i=0;i<3;i++)
         {
         for(int j=0;j<3;j++)
         {
if(ar[i][j]==-1)return false;

}
}

return true;
}




}
 