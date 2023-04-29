import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Player {
     public String name1;
     public String name2;
     public String turn;
     public int x_Count;
     public int o_Count;
     public int tie_Count;
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
        turn="X";
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
 public void player_Wins(JPanel f,JButton j1,JButton j2,JButton j3,JButton j4,JButton j5,JButton j6,JButton j7,JButton j8,JButton j9,JLabel jLabel2,JLabel jLabel4,JLabel jLabel6){
        JOptionPane.showMessageDialog(f,name1+" wins","Winner!",JOptionPane.INFORMATION_MESSAGE);
        x_Count++;
        reset(j1,j2,j3,j4,j5,j6,j7,j8,j9);
        set_Score(jLabel2, jLabel4, jLabel6);
    }
 public void player_lose(JPanel f,JButton j1,JButton j2,JButton j3,JButton j4,JButton j5,JButton j6,JButton j7,JButton j8,JButton j9,JLabel jLabel2,JLabel jLabel4,JLabel jLabel6){
        JOptionPane.showMessageDialog(f,name2+" wins","Winner!",JOptionPane.INFORMATION_MESSAGE);
        o_Count++;
        reset(j1,j2,j3,j4,j5,j6,j7,j8,j9);
        set_Score(jLabel2, jLabel4, jLabel6);
    }
 public void check_Winner(JPanel f,JButton j1,JButton j2,JButton j3,JButton j4,JButton j5,JButton j6,JButton j7,JButton j8,JButton j9,JLabel jLabel2,JLabel jLabel4,JLabel jLabel6){
        String b1 = j1.getText();
        String b2 = j2.getText();
        String b3 = j3.getText();
        String b4 = j4.getText();
        String b5 = j5.getText();
        String b6 = j6.getText();
        String b7 = j7.getText();
        String b8 = j8.getText();
        String b9 = j9.getText();
        if(b1=="X"&&b2=="X"&&b3=="X"){
             player_Wins(f,j1,j2,j3,j4,j5,j6,j7,j8,j9,jLabel2, jLabel4, jLabel6);
        }
        if(b4=="X"&&b5=="X"&&b6=="X"){
            player_Wins(f,j1,j2,j3,j4,j5,j6,j7,j8,j9,jLabel2, jLabel4, jLabel6);        
        }
        if(b7=="X"&&b8=="X"&&b9=="X"){
             player_Wins(f,j1,j2,j3,j4,j5,j6,j7,j8,j9,jLabel2, jLabel4, jLabel6);
        }
        if(b1=="X"&&b5=="X"&&b9=="X"){
            player_Wins(f,j1,j2,j3,j4,j5,j6,j7,j8,j9,jLabel2, jLabel4, jLabel6);
        }
        if(b3=="X"&&b5=="X"&&b7=="X"){
            player_Wins(f,j1,j2,j3,j4,j5,j6,j7,j8,j9,jLabel2, jLabel4, jLabel6);
        }
        if(b1=="X"&&b4=="X"&&b7=="X"){
            player_Wins(f,j1,j2,j3,j4,j5,j6,j7,j8,j9,jLabel2, jLabel4, jLabel6);
        }
        if(b2=="X"&&b5=="X"&&b8=="X"){
            player_Wins(f,j1,j2,j3,j4,j5,j6,j7,j8,j9,jLabel2, jLabel4, jLabel6);
        }
        if(b3=="X"&&b6=="X"&&b9=="X"){
            player_Wins(f,j1,j2,j3,j4,j5,j6,j7,j8,j9,jLabel2, jLabel4, jLabel6);
        }
        if(b1=="O"&&b2=="O"&&b3=="O"){
            player_lose(f,j1,j2,j3,j4,j5,j6,j7,j8,j9,jLabel2, jLabel4, jLabel6);
        }
        if(b4=="O"&&b5=="O"&&b6=="O"){
            player_lose(f,j1,j2,j3,j4,j5,j6,j7,j8,j9,jLabel2, jLabel4, jLabel6);
        }
        if(b7=="O"&&b8=="O"&&b9=="O"){
            player_lose(f,j1,j2,j3,j4,j5,j6,j7,j8,j9,jLabel2, jLabel4, jLabel6);
        }
        if(b1=="O"&&b5=="O"&&b9=="O"){
           player_lose(f,j1,j2,j3,j4,j5,j6,j7,j8,j9,jLabel2, jLabel4, jLabel6);
        }
        if(b3=="O"&&b5=="O"&&b7=="O"){
           player_lose(f,j1,j2,j3,j4,j5,j6,j7,j8,j9,jLabel2, jLabel4, jLabel6);
        }
        if(b1=="O"&&b4=="O"&&b7=="O"){
           player_lose(f,j1,j2,j3,j4,j5,j6,j7,j8,j9,jLabel2, jLabel4, jLabel6);
        }
        if(b2=="O"&&b5=="O"&&b8=="O"){
           player_lose(f,j1,j2,j3,j4,j5,j6,j7,j8,j9,jLabel2, jLabel4, jLabel6);
        }
        if(b3=="O"&&b6=="O"&&b9=="O"){
           player_lose(f,j1,j2,j3,j4,j5,j6,j7,j8,j9,jLabel2, jLabel4, jLabel6);
        }
 }
 public void check_Tie(JPanel f,JButton j1,JButton j2,JButton j3,JButton j4,JButton j5,JButton j6,JButton j7,JButton j8,JButton j9,JLabel jLabel2,JLabel jLabel4,JLabel jLabel6){
      if(j1.getText()!=null&&j2.getText()!=null&&j3.getText()!=null&&j4.getText()!=null&&j5.getText()!=null&&j6.getText()!=null&&j7.getText()!=null&&j8.getText()!=null&&j9.getText()!=null){
            JOptionPane.showMessageDialog(f,"This game is a tie","Tie",JOptionPane.INFORMATION_MESSAGE);
            tie_Count++;
            reset(j1,j2,j3,j4,j5,j6,j7,j8,j9);
            set_Score(jLabel2, jLabel4, jLabel6);
       }
    }
 public void setplayersnames(JLabel jLabel1,JLabel jLabel3){
     jLabel1.setText(name1);
     jLabel3.setText(name2);
 }
 public void set_Score(JLabel jLabel2,JLabel jLabel4,JLabel jLabel6){
    jLabel2.setText(String.valueOf(x_Count));
    jLabel4.setText(String.valueOf(o_Count));
    jLabel6.setText(String.valueOf(tie_Count));
    }
 public void determine_turn(){
        if(turn.equalsIgnoreCase("X"))
            turn="O";
        else 
            turn="X";
    }
 public Player(JPanel f) {
           name1=JOptionPane.showInputDialog(f, "Player X's Name:","Player X",JOptionPane.INFORMATION_MESSAGE);
           name2=JOptionPane.showInputDialog(f, "Player O's Name:","Player O",JOptionPane.INFORMATION_MESSAGE);
           if(name1.equals(""))
            name1="Player1";
           if(name2.equals(""))
            name2="Player2";
           tie_Count=0;
           x_Count=0;
           o_Count=0;
           turn = "X";
    }
}
