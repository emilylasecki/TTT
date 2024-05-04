package TTTbroke;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.*;
import java.io.Serializable;


public class Users implements Serializable{
	private String userName;
	private int wins;
	private int draws;
	private int games;

	Users(String name){
		userName = name;
		wins = 0;
		draws = 0;
		games = 0;
		};

	public String getName(){return userName;}
	public int getWins(){
		return wins;
	}

	public int getDraw(){return draws;}
	public int getGames(){return games;}

	public void won(){
		wins++;
		games++;
		}

	public void lost(){
		games++;
		}

	public void drew(){
		draws++;
		games++;
		}
	
	public String getStats(){
		String stats = userName+ " Won: "+wins+" Draw: "+draws+" Games: "+games+"\n";
		return stats;
		}
}




