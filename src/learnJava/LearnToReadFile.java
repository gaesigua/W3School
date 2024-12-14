package learnJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LearnToReadFile {
	
	public static void main(String[] args) {
		
//		1. HOW TO READ A FILE USING THE SCANNER CLASS
		
		
//		STEP 1. LET'S FIRST SET UP OUR FILE
		
		
		File myFile = new File("file2.txt");
		
		
//		2. LET'S CREATE AN OBJECT TO READ OUR FILE, AND SAVE IT AS A SCANNER
		
		try {
			Scanner myReader = new Scanner(myFile);
			
//      3. NOW LET'S READ THE CONTECTS USING MY OBJECT, as the content as content
			
			String content = myReader.nextLine();
			
//      4. NOW LET'S PRINT OUT THE CONTENT
			
			System.out.println(content);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
//		5. LET'S GET THE LENGTH, the NAME, and the ABSOLUTE PATH of the file;
		
		if(myFile.exists()) {
			
			System.out.println(myFile.length());
			System.out.println(myFile.getName());
			System.out.println(myFile.getAbsolutePath());
			
			
		}
	}

}
