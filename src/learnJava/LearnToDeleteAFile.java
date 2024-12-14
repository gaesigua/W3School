package learnJava;

import java.io.File;
import java.io.IOException;

public class LearnToDeleteAFile {
	
	
	public static void main(String[] args) {
		
//		HOW TO DELETE A FILE
		
//		1. LET'S FIST CREATE A FILE
		
		File myFile = new File ("file3.txt");
		
//		try {
//			if(myFile.createNewFile()) {
//				
//				System.out.println("File is created!");
//				
//			}else {
//				
//				System.out.println("File was not created");
//				
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		2. NOW LET'S DELETE THAT FILE
		
		if(myFile.exists()) {
			
			myFile.delete();
			
		}else {
			
			System.out.println("File is not available!");
			
		}
	}

}
