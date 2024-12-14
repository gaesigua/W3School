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
		
		
//		File myFile = new File("text1.txt");
	
//		try {
//			if(myFile.createNewFile()) {
			
//				System.out.println("File is created");
//			}else {
//				System.out.println("File was not created");
		
//		} catch (IOException e) {

//			e.printStackTrace();
//		}
	
//		2. LET'S CREATE A SECOND FILE, but this time we will specify where we want to save it
		
//        File myFile1 = new File("C:\\Users\\gasig\\eclipse-workspace\\W3School\\test2.txt");
	
//		try {
//			if(myFile1.createNewFile()) {
//				
//				System.out.println("File is created");
//			}else {
//				System.out.println("File was not created");
//			}
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
//		3. LET'S CREATE A NEW FILE AND CALL IT file2
//		
		File myFile2 = new File ("C:\\Users\\gasig\\eclipse-workspace\\W3School\\file2.txt");
//		
//		try {
//			if(myFile2.createNewFile()) {
//				
//				System.out.println("The file is created");
//				
//			}else {
//				System.out.println("No, the file was not created");
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
	
		
//		4. LET'S CHECK IF THE FILE IS WRITABLE USING the canWrite() method of the File class
		
		
		if(myFile2.canWrite()){
			
			System.out.println("Yes, the file is writable");
		}else {
			
			System.out.println("Unfortunately, the file is not writable!");
			
		}
		
		
//		5. LET'S CHECK IF THE FILE IS READABLE USING the canRead() method of the File class
		
		if(myFile2.canRead()) {
			
			System.out.println("Yes, the file is readable!");
			
		}else {
			
			System.out.println("No, the file is not readable!");
		}
		
		
//		6. LET'S CHECK IF THE FILE EXISTS using the exists() method of the File class
		
		if(myFile2.exists()) {
			System.out.println("Yes, the file is saved in the directory");
		}else {
			System.out.println("There's no such file in the directory!");
		}	
}
}