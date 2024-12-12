package learnJava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LearnFile {
	public static void main(String[] args) {
		
//How TO CREATE FILES IN JAVA
//Java has a very useful class called File
//The methods of the File class are canWrite(), canRead(), createNewFile(), delete(), length(), exists(), getName(), getAbsolutePath(), length(), mkdir(), list() 
		
//		1. LET'S CREATE A NEW FILE using the createNewFile() method; and then we will the if else statement to print out whether the file was created or not
		
		
//		File myFile = new File("test1.txt");
//		
//		try {
//			if(myFile.createNewFile()) {
//				
//				System.out.println("File is created");
//			}else {
//				System.out.println("File was not created");
//			}
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	
//		2. LET'S CREATE A SECOND FILE, but this time we will specify where we want to save it
		
//        File myFile1 = new File("C:\\Users\\gasig\\eclipse-workspace\\W3School\\test2.txt");
//		
//		try {
//			if(myFile1.createNewFile()) {
//				
//				System.out.println("File is created");
//			}else {
//				System.out.println("File was not created");
//			}
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		3. NOW LET'S WRITE TO OUR NEWLY CREATED FILES USING FileWriter class, and its write() method 
		
		//We are commenting the previous steps because they were meant to create new files, and if we keep running them, they will print out an error because the files with the same names are already created
		
		try {
			FileWriter myWriter = new FileWriter("test2.txt");
			myWriter.write("We wish you a Merry Christmass, We wish you a Merry Christmas!");
			myWriter.close(); //We must remember to close the file after writing into it.
			
			System.out.println("New details were successfully added to the file! ");
		} catch (IOException e) {
			
			System.out.println("Error occurred while trying to write to the file!");
			e.printStackTrace();
		}
	
	}

}
