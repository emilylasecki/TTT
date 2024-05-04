package TTTbroke;


import javax.swing.*;
public class Board {

public Board(String[] plays, boolean gameOver){
System.out.println("Board Class");
}

public static void selectUser() {
    System.out.println("selectUser method");
}
public static void levelSelect() {
System.out.println("levelSelect method"); 
} 
public static void playerMove() {
    System.out.println("playerMove method");
}
public static void markSymbol() {
    System.out.println("markSymbol method");
}

public static void checkTieGame(String[] plays, boolean gameOver) { 
   boolean tie=true;
   for (int p=0; p<9; p++) {
      if (plays[p]=="1") {
      tie=false;
      break;
   }
}
   if (tie==true) {
    JOptionPane.showMessageDialog(null, "Tie game!");  
    TTTFrame.gameOver = true;
   }
}

public static void checkPlayerWin(String[] plays, boolean gameOver) {
    if ((plays[0] == "X") && (plays[1] =="X") && (plays[2]=="X")) {
        printXwin(gameOver);
    }
     if ((plays[3] == "X") && (plays[4] =="X") && (plays[5]=="X")) {
        printXwin(gameOver);
     }
    if ((plays[6] == "X") && (plays[7] =="X") && (plays[8]=="X")) {
        printXwin(gameOver);
    }
     if ((plays[0] == "X") && (plays[3] =="X") && (plays[6]=="X")) {
        printXwin(gameOver);
     }
     if ((plays[1] == "X") && (plays[4] =="X") && (plays[7]=="X")) {
        printXwin(gameOver);
     }
     if ((plays[2] == "X") && (plays[5] =="X") && (plays[8]=="X")) {
        printXwin(gameOver);
     }
     if ((plays[0] == "X") && (plays[4] =="X") && (plays[8]=="X")) {
        printXwin(gameOver);
     }
     if ((plays[6] == "X") && (plays[4] =="X") && (plays[2]=="X")) {
        printXwin(gameOver);
     }
     }
public static void checkAiWin(String[] plays, boolean gameOver) {
     if ((plays[0] == "O") && (plays[1] =="O") && (plays[2]=="O")) {
        print0win(gameOver);
    }
     if ((plays[3] == "O") && (plays[4] =="O") && (plays[5]=="O")) {
        print0win(gameOver);
     }
    if ((plays[6] == "O") && (plays[7] =="O") && (plays[8]=="O")) {
        print0win(gameOver);
    }
     if ((plays[0] == "O") && (plays[3] =="O") && (plays[6]=="O")) {
        print0win(gameOver);
     }
     if ((plays[1] == "O") && (plays[4] =="O") && (plays[7]=="O")) {
        print0win(gameOver);
     }
     if ((plays[2] == "O") && (plays[5] =="O") && (plays[8]=="O")) {
        print0win(gameOver);
     }
     if ((plays[0] == "O") && (plays[4] =="O") && (plays[8]=="O")) {
        print0win(gameOver);
     }
     if ((plays[6] == "O") && (plays[4] =="O") && (plays[2]=="O")) {
        print0win(gameOver);
     }
     }
public static void printXwin(boolean gameOver) {
    JOptionPane.showMessageDialog(null, "X wins!");
    TTTFrame.gameOver = true;
   
}
public static void print0win(boolean gameOver) {
    JOptionPane.showMessageDialog(null, "0 wins!");  
    TTTFrame.gameOver = true;
}




}
