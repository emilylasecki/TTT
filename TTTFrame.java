package TTTbroke;  

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
//import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
//import java.util.Arrays;
//import TTTbroke.Users;

public class TTTFrame extends JFrame implements ActionListener {  
JFrame TTTFrame;
JLabel xPlayer = null;
JLabel oPlayer = null;
JTextField xField = null;
JTextField oField = null;
GridBagConstraints layoutConst = null;
JButton createUser;
//JButton viewStatsButton;  //ran out of time to get this working
JButton[] squares = new JButton[9];  
public static String[] plays= {"1","1","1","1","1","1","1","1","1"};
JPanel panel;
JButton refresh;
String[] gameMode = {"Mode: Two Player", "Mode: Easy", "Mode: Hard"};
private boolean xturn=false; 
private String selectedValue= "Mode: Two Player";
public static boolean gameOver = false;
String[] userList;
ArrayList <Users> usersObjs;
int userCount = 0; 
private String playerA="GuestA";
private String playerB="GuestB";


    public TTTFrame() {
        this.userList = new String[10];
        try {
            this.usersObjs = FileManager.serializeDataIn();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch(ClassNotFoundException b){
            b.printStackTrace(); 
        } 
    }

    public static void main(String[] args) {  //main must be static
   TTTFrame TTTFrame = new TTTFrame();
   TTTFrame.Frame();
   TTTFrame.resetagain();

    }

//method to display the contents of Frame
 public void Frame() {
    Board.checkPlayerWin(plays, gameOver);

xPlayer = new JLabel("X:");
oPlayer = new JLabel("O:");

/*xField = new JTextField(15);
xField.setEditable(true);
xField.setText(xText);
xField.addActionListener(this);

oField = new JTextField(15);
oField.setEditable(true);
oField.addActionListener(this); 
oField.setText(oText); */

createUser = new JButton("Create User");
createUser.addActionListener(this);

refresh = new JButton("Reset");
refresh.addActionListener(this);

//viewStatsButton = new JButton("View Stats");
//viewStatsButton.addActionListener(new ActionListener() {

 // Add ActionListener to the button
        //    public void actionPerformed(ActionEvent e) {
                // Display a JOptionPane
         //       JOptionPane.showMessageDialog(viewStatsButton, "Show Stats"); //could update to call on user class to print stats
         //   }
      //  });

  panel = new JPanel();
  panel.setLayout(new GridLayout(3,3));

// create squares/grid on frame
  for (int i=0; i<9; i++) {
    squares[i] = new JButton();
   squares[i].addActionListener(this);
    panel.add(squares[i]);
  }

TTTFrame = new JFrame("TicTacToe");

int y=0;
for (y=0; y<9; y++) {
    squares[y].setText("   ");
}

TTTFrame.setLayout(new GridBagLayout());
int x=0;
int j=4;
int i=0;
 for (i=4; i<7; i++){
    for (j=1; j<4; j++) {
        layoutConst = new GridBagConstraints();
    TTTFrame.add(squares[x], layoutConst);
    layoutConst.gridx =i;
    layoutConst.gridy =j;
    layoutConst.insets = new Insets(5,5,10,10); 
    TTTFrame.add(squares[x], layoutConst);
    x++;
    
 }
}


//lots of layout stuff

//Create GridBagConstraints
layoutConst = new GridBagConstraints();

//specify location
layoutConst.gridx =0;
layoutConst.gridy =1;

//insets
layoutConst.insets = new Insets(10,10,10,10);

//add components
TTTFrame.add(xPlayer, layoutConst);

layoutConst = new GridBagConstraints();
layoutConst.gridx =0;
layoutConst.gridy =2;
layoutConst.insets = new Insets(10,10,10,10);

TTTFrame.add(oPlayer, layoutConst);

 //   layoutConst = new GridBagConstraints();
  //    layoutConst.gridx = 1;
   //   layoutConst.gridy = 1;
   //   layoutConst.insets = new Insets(10, 10, 5, 10);
   //   TTTFrame.add(xField, layoutConst);

   //   layoutConst = new GridBagConstraints();
   //   layoutConst.gridx = 1;
   //   layoutConst.gridy = 2;
    //  layoutConst.insets = new Insets(10, 10, 5, 10);
    //  TTTFrame.add(oField, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(0, 10, 5, 5);
      layoutConst.gridx = 0;
      layoutConst.gridy = 0;
      TTTFrame.add(createUser, layoutConst);


  /*   layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(0, 10, 10, 5);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 1;
      layoutConst.gridy = 3;
      TTTFrame.add(viewStatsButton, layoutConst); */

    layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(0, 10, 10, 5);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 0;
      layoutConst.gridy = 3;
      TTTFrame.add(refresh, layoutConst); 

JComboBox<String> comboBox = new JComboBox<>(gameMode);
comboBox.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        selectedValue = (String) comboBox.getSelectedItem();
       // System.out.println("Selected " + selectedValue);
        
    }
});

layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(0, 10, 5, 5);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 1;
      layoutConst.gridy = 0;
      TTTFrame.add(comboBox, layoutConst); 






      
JComboBox<String> comboBox2 = new JComboBox<>(userList);
comboBox.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        playerA = (String) comboBox2.getSelectedItem();
       // System.out.println("Selected " + playerA);  //could change update this once new user added
    }
});


for(Users name: usersObjs) {
    try{
        comboBox2.addItem(name.getName());
    } catch(NullPointerException e){

    }
}

layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(0, 10, 5, 5);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 1;
      layoutConst.gridy = 1;
      TTTFrame.add(comboBox2, layoutConst); 


     
JComboBox<String> comboBox3 = new JComboBox<>(userList);
comboBox.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        playerB = (String) comboBox3.getSelectedItem();
    }
});

for(Users name: usersObjs) {
   comboBox3.addItem(name.getName()); 
}

//eventhandlers can make new usernames enter immediately

layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(0, 10, 5, 5);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 1;
      layoutConst.gridy = 2;
      TTTFrame.add(comboBox3, layoutConst); 



// Set the frame's height and width
TTTFrame.setSize(500, 250);


// Set the program to exit when the user
// closes the frame
TTTFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

// Make the frame visible to the user
TTTFrame.setVisible(true);
 }

public void updateOplays() {
    for (int i=0; i<9; i++) {
        if (plays[i]=="O") {
            squares[i].setText("O");
        }
    }
}


private String[] addNameToList(String[] userList, String newname){
 
    userList[userCount] = newname;
    Users newUser = new Users(newname);
    boolean x = usersObjs.add(newUser);
    userCount++;
    try {
        FileManager.serializeDataOut(usersObjs);
    } catch (IOException e) {
        // Auto-generated catch block
        e.printStackTrace();
    } 
    try {
        FileManager.serializeDataIn();
    } catch (ClassNotFoundException e) {
        // Auto-generated catch block
        e.printStackTrace();
    } catch (IOException e) {
        // Auto-generated catch block
        e.printStackTrace();
    }
    return userList;
}


public void refresh() {
       for(int p=0; p<9; p++) {
        squares[p].setText("   ");
        plays[p]="1";
    }
}

public void resetagain() {  //means "check if game over"
    if (gameOver==true) {  
    for(int p=0; p<9; p++) {
        squares[p].setText("   ");
        plays[p]="1";
        gameOver=false;
    }
}
}

public void actionPerformed(ActionEvent e) {
    int p=0;

    final Object source = e.getSource();
    if (source.equals(createUser))  {
    String newname =JOptionPane.showInputDialog("username:"); 
    addNameToList(userList, newname);
     } else if (source.equals(refresh)){
       refresh();
    }
    

  if (selectedValue.equals("Mode: Two Player")) { 
    for (p=0; p<9; p++) {
        if (source.equals(squares[p]) && (xturn==true) && (plays[p] =="1")) {
        squares[p].setText("X");
        plays[p]="X";
        Board.checkPlayerWin(plays, gameOver);
        resetagain();
        Board.checkAiWin(plays, gameOver);
        resetagain();
        Board.checkTieGame(plays, gameOver); //must check ties last
        xturn=!xturn;
        resetagain();
        }  
    else if (source.equals(squares[p]) && (xturn== false) && (plays[p] =="1")) { //must have else if
        squares[p].setText("O");
        plays[p]="O";
        Board.checkPlayerWin(plays, gameOver); 
        resetagain();
        Board.checkAiWin(plays, gameOver);
        resetagain();
        Board.checkTieGame(plays, gameOver);
        xturn= !xturn;
        resetagain(); 
    }
        }
    }
if (selectedValue.equals("Mode: Easy") || selectedValue.equals("Mode: Hard")) { 
    //should set comboBox3 to invisible, but I can't get it to work
    xturn=false;
    for (p=0; p<9; p++) {
        if (source.equals(squares[p]) && (plays[p] =="1")) {
        squares[p].setText("X");
        plays[p]="X";
        Board.checkPlayerWin(plays, gameOver);
        resetagain(); 
        Board.checkAiWin(plays, gameOver);
        resetagain(); 
        Board.checkTieGame(plays, gameOver);  //must have this stuff up here
        resetagain(); 
        xturn=!xturn;
        if (selectedValue.equals("Mode: Easy")) {
        xturn =!xturn;
        BadAI.playMove(plays, xturn); 
        updateOplays();
        resetagain(); 
        Board.checkAiWin(plays, gameOver);
        resetagain(); 
        Board.checkTieGame(plays, gameOver);
        resetagain(); 
        }
        if (selectedValue.equals("Mode: Hard")) {
        xturn =!xturn;
        GoodAI.playMove(plays, xturn);
        updateOplays();
        resetagain();
        Board.checkAiWin(plays, gameOver);
        resetagain();
        Board.checkTieGame(plays, gameOver);
        resetagain(); 
        }
        }  
    }
}
}
}
 
