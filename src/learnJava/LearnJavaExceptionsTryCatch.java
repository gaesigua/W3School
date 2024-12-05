package learnJava;

public class LearnJavaExceptionsTryCatch {
	
	public static void main(String[] args) {
		
		//STEP 2: Let's call the method; and since the method is static, and in the same package, and class, we don't need to use a class or create an object of the method to call it
		
		
		checkAge(15);
	}
		
		//STEP 1: Let's create a method to check if they are of age, if they are NOT above 18, we will NOT grant them access to enter the bar, if they are we will grant them access
		
		public static void checkAge(int age){
			
			if (age < 18) {
				throw new ArithmeticException("Access is Denied - You must be at least 18 years old to enter");}
			else {System.out.println("Access Granted");}
	}

}
        //IT WILL PRINT OUT AN EXCEPTION SINCE OUR USER IS BELOW THE AGE OF 18