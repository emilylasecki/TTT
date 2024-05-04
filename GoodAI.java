package TTTbroke;

public class GoodAI extends AI { 

    public GoodAI(String[] plays, boolean xturn) {
   }

    public static void playMove(String[] plays, boolean xturn) { 
      while(!xturn) {
        //see if any plays will cause AI to win and do it
        if (plays[3]=="X" && plays[6]=="X" && plays[0]=="1") {
            plays[0]="O"; 
            xturn =true;
            break;
            } else if (plays[0]=="O" && plays[6]=="O" && plays[3]=="1") {
            plays[3]="O"; 
            xturn =true;
            break;
            } else if (plays[0]=="O" && plays[3]=="O" && plays[6]=="1") {
            plays[6]="O"; 
            xturn =true;
            break;
            } else if (plays[0]=="O" && plays[1]=="O" && plays[2]=="1") {
            plays[2]="O"; 
            xturn =true;
            break;
            } else if (plays[1]=="O" && plays[2]=="O" && plays[0]=="1") {
            plays[0]="O"; 
            xturn =true;
            break;
            } else if (plays[0]=="O" && plays[2]=="O" && plays[1]=="1") {
            plays[1]="O"; 
            xturn =true;
            break;
            } else if (plays[0]=="O" && plays[3]=="O" && plays[6]=="1") {
            plays[6]="O"; 
            xturn =true;
            break;
            } else if (plays[4]=="O" && plays[7]=="O" && plays[1]=="1") {
            plays[1]="O"; 
            xturn =true;
            break;
            } else if (plays[1]=="O" && plays[7]=="O" && plays[4]=="1") {
            plays[4]="O"; 
            xturn =true;
            break;
            } else if (plays[1]=="O" && plays[4]=="O" && plays[7]=="1") {
            plays[7]="O"; 
            xturn =true;
            break;
            } else if (plays[2]=="O" && plays[8]=="O" && plays[5]=="1") {
            plays[5]="O"; 
            xturn =true;
            break;
            } else if (plays[2]=="O" && plays[5]=="O" && plays[8]=="1") {
            plays[8]="O"; 
            xturn =true;
            break;
            } else if (plays[0]=="O" && plays[3]=="O" && plays[6]=="1") {
            plays[6]="O"; 
            xturn =true;
            break;
            } else if (plays[5]=="O" && plays[8]=="O" && plays[2]=="1") {
            plays[2]="O"; 
            xturn =true;
            break;
            } else if (plays[3]=="O" && plays[5]=="O" && plays[4]=="1") {
            plays[4]="O"; 
            xturn =true;
            break;
            } else if (plays[3]=="O" && plays[4]=="O" && plays[5]=="1") {
            plays[5]="O"; 
            xturn =true;
            break;
            } else if (plays[4]=="O" && plays[5]=="O" && plays[3]=="1") {
            plays[3]="O"; 
            xturn =true;
            break;
            } else if (plays[7]=="O" && plays[8]=="O" && plays[6]=="1") {
            plays[6]="O"; 
            xturn =true;
            break;
            } else if (plays[6]=="O" && plays[7]=="O" && plays[8]=="1") {
            plays[8]="O"; 
            xturn =true;
            break;
            } else if (plays[6]=="O" && plays[8]=="O" && plays[7]=="1") {
            plays[7]="O"; 
            xturn =true;
            break;
            } else if (plays[0]=="O" && plays[4]=="O" && plays[8]=="1") {
            plays[8]="O"; 
            xturn =true;
            break;
            } else if (plays[4]=="O" && plays[8]=="O" && plays[0]=="1") {
            plays[0]="O"; 
            xturn =true;
            break;
            } else if (plays[0]=="O" && plays[8]=="O" && plays[4]=="1") {
            plays[4]="O"; 
            xturn =true;
            break;
            } else if (plays[2]=="O" && plays[6]=="O" && plays[4]=="1") {
            plays[4]="O"; 
            xturn =true;
            break;
            } else if (plays[4]=="O" && plays[6]=="O" && plays[2]=="1") {
            plays[2]="O"; 
            xturn =true;
            break;
            } else if (plays[2]=="O" && plays[4]=="O" && plays[6]=="1") {
            plays[6]="O"; 
            xturn =true;
            break;
        //see if player is about to win and stop it
            } else if (plays[3]=="X" && plays[6]=="X" && plays[0]=="1") {
            plays[0]="O"; 
            xturn =true;
            break;
            } else if (plays[0]=="X" && plays[6]=="X" && plays[3]=="1") {
            plays[3]="O"; 
            xturn =true;
            break;
            } else if (plays[0]=="X" && plays[3]=="X" && plays[6]=="1") {
            plays[6]="O"; 
            xturn =true;
            break;
            } else if (plays[0]=="X" && plays[1]=="X" && plays[2]=="1") {
            plays[2]="O"; 
            xturn =true;
            break;
            } else if (plays[1]=="X" && plays[2]=="X" && plays[0]=="1") {
            plays[0]="O"; 
            xturn =true;
            break;
            } else if (plays[0]=="X" && plays[2]=="X" && plays[1]=="1") {
            plays[1]="O"; 
            xturn =true;
            break;
            } else if (plays[0]=="X" && plays[3]=="X" && plays[6]=="1") {
            plays[6]="O"; 
            xturn =true;
            break;
            } else if (plays[4]=="X" && plays[7]=="X" && plays[1]=="1") {
            plays[1]="O"; 
            xturn =true;
            break;
            } else if (plays[1]=="X" && plays[7]=="X" && plays[4]=="1") {
            plays[4]="O"; 
            xturn =true;
            break;
            } else if (plays[1]=="X" && plays[4]=="X" && plays[7]=="1") {
            plays[7]="O"; 
            xturn =true;
            break;
            } else if (plays[2]=="X" && plays[8]=="X" && plays[5]=="1") {
            plays[5]="O"; 
            xturn =true;
            break;
            } else if (plays[2]=="X" && plays[5]=="X" && plays[8]=="1") {
            plays[8]="O"; 
            xturn =true;
            break;
            } else if (plays[0]=="X" && plays[3]=="X" && plays[6]=="1") {
            plays[6]="O"; 
            xturn =true;
            break;
            } else if (plays[5]=="X" && plays[8]=="X" && plays[2]=="1") {
            plays[2]="O"; 
            xturn =true;
            break;
            } else if (plays[3]=="X" && plays[5]=="X" && plays[4]=="1") {
            plays[4]="O"; 
            xturn =true;
            break;
            } else if (plays[3]=="X" && plays[4]=="X" && plays[5]=="1") {
            plays[5]="O"; 
            xturn =true;
            break;
            } else if (plays[4]=="X" && plays[5]=="X" && plays[3]=="1") {
            plays[3]="O"; 
            xturn =true;
            break;
            } else if (plays[7]=="X" && plays[8]=="X" && plays[6]=="1") {
            plays[6]="O"; 
            xturn =true;
            break;
            } else if (plays[6]=="X" && plays[7]=="X" && plays[8]=="1") {
            plays[8]="O"; 
            xturn =true;
            break;
            } else if (plays[6]=="X" && plays[8]=="X" && plays[7]=="1") {
            plays[7]="O"; 
            xturn =true;
            break;
            } else if (plays[0]=="X" && plays[4]=="X" && plays[8]=="1") {
            plays[8]="O"; 
            xturn =true;
            break;
            } else if (plays[4]=="X" && plays[8]=="X" && plays[0]=="1") {
            plays[0]="O"; 
            xturn =true;
            break;
            } else if (plays[0]=="X" && plays[8]=="X" && plays[4]=="1") {
            plays[4]="O"; 
            xturn =true;
            break;
            } else if (plays[2]=="X" && plays[6]=="X" && plays[4]=="1") {
            plays[4]="O"; 
            xturn =true;
            break;
            } else if (plays[4]=="X" && plays[6]=="X" && plays[2]=="1") {
            plays[2]="O"; 
            xturn =true;
            break;
            } else if (plays[2]=="X" && plays[4]=="X" && plays[6]=="1") {
            plays[6]="O"; 
            xturn =true;
            break;
            } else {
            playSimpleMove(plays,xturn);
            break;
         }
      }
    } 
  
} 


