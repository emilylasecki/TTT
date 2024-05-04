package TTTbroke;
import java.util.ArrayList;
import java.io.*;


public class FileManager{
	public static void serializeDataOut(ArrayList<Users> usersToWrite)throws IOException{
		String fileName= "./Test.txt";
		try{
			FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(usersToWrite);
			oos.close();
		}
		catch(IOException eio)
		{
			System.out.println("Did not write to file");
			return ;
		}
	}

	public static ArrayList<Users> serializeDataIn() throws IOException,ClassNotFoundException{
		String fileName= "Test.txt";
		ArrayList<Users> inUsers = new ArrayList<Users>();
		try{
			FileInputStream fin = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fin);
		inUsers= (ArrayList<Users>) ois.readObject();
		ois.close();
		//System.out.println(inUsers); print for each new user added
		} catch (FileNotFoundException e){

		}
		return inUsers;
	}

}
