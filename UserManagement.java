package TTTbroke;
import java.util.ArrayList;
//import java.util.List;
//import java.util.*;
import java.io.*;

public class UserManagement{
	private ArrayList<Users> users;
    private FileManager fmanager;

	UserManagement(){

		users = readFile();
	    fmanager = new FileManager();

	}

	public ArrayList<Users> readFile(){
		ArrayList<Users> usersRead = new ArrayList<Users>();
		try{
			usersRead = fmanager.serializeDataIn();
			return usersRead;
		}
		catch(IOException e){
			e.printStackTrace();
		}
		catch(ClassNotFoundException b){
			b.printStackTrace();
			}
		return usersRead;
	}



	public void writeFile(){
		try{
			fmanager.serializeDataOut(users);
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}



}

