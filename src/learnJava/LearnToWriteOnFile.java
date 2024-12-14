package learnJava;

import java.io.FileWriter;
import java.io.IOException;

public class LearnToWriteOnFile {
	public static void main(String[] args) {
		
//		1. NOW LET'S WRITE TO AN EXISTING FILE USING FileWriter class, and its write() method
		
		//The files were created in our previous lesson (class: LearnFile)
		
		
	try {
			FileWriter myWriter = new FileWriter("file2.txt");
			
			myWriter.write("We wish you a Merry Christmass, We wish you a Merry Christmas!");
			
			//Always remember to CLOSE the file after writing to it.
			
			myWriter.close(); 
			
			System.out.println("New details were successfully added to the file! ");
		} catch (IOException e) {
			
			System.out.println("Error occurred while trying to write to the file!");
			e.printStackTrace();
		}
	
	}
	}
