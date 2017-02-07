/**We are writing to a file using the java.io.* package
The classes needed here are: BufferedWriter, FileWriter and IOException;
*/

//Importing the needed classes
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class WriteToFile {
	//Datafield to store the String path for our file name
	private static final String FILENAME = "BHIM.txt";
	
	public static void main(String[] args){
		BufferedWriter bf = null; //Initialize the bufferedwriter object will null
		FileWriter fw = null; //Initialize the filewriter object will null
		Scanner kb = new Scanner(System.in);
		
		try{
			
			//String file = JOptionPane.input.dialog("Please enter something here: ");
			System.out.println("Please enter something here: ");
			String statement = kb.nextLine();
			
			fw = new FileWriter(FILENAME); // Writing to the File using it's location
			bf = new BufferedWriter(fw); // Passing the filewriter as a parameter to BufferedWriter
			bf.write(statement);
			
		}catch(IOException error){
			error.printStackTrace();
		}finally{
			try {
				
				if(bf !=null){
					bf.close();
				}
				if(fw !=null){
					fw.close();
				}
				
			} catch (IOException e){
				e.printStackTrace();
			}
		}
	}
	
}
