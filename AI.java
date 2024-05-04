package TTTbroke;

import java.util.Random;

public class AI {
    
    public AI() {
 
}

public static void playSimpleMove(String[] plays, boolean xturn) { 
        Random randgen = new Random();
        int num = (randgen.nextInt(9));
        while (!xturn) {
        if (plays[num].equals("1")) {
        plays[num]="O"; 
        xturn=true;
        break; 
        } else {
        num = (randgen.nextInt(9));
        }
    }
 } 
}
