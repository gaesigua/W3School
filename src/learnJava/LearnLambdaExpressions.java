package learnJava;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LearnLambdaExpressions {
	
	//What are the Lambda expressions?
	
	//Lambda expressions were introduced in java 8, and these are short blocks of codes
	//Syntax with one parameter: parameter -> expression
	//Syntax with more than one parameter: (parameter1, parameter2) -> {block of code}
	
	//1. LET'S CREATE A LAMBDA EXPRESSION
	
	public static void main(String[] args) {
		
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		
		myNumbers.add(8);
		myNumbers.add(11);
		myNumbers.add(22);
		myNumbers.add(25);
	
	
		myNumbers.forEach((n) -> {System.out.println(n);});
		
		//Lambda expressions can be stored in variables, if the variable's type is an interface which has only one method
		
		//2. A LAMBDA EXPRESSION WITH 2 PARAMETERS
		
		ArrayList<Integer> myNumbers2 = new ArrayList<Integer>();
		
		myNumbers2.add(55);
		myNumbers2.add(23);
		myNumbers2.add(1);
		myNumbers2.add(54);
		myNumbers2.add(92);
		
		//Let's just print a long line here just for visuals
		System.out.println("================================================================================");
		
		//Now let's create a lambda expression, and then save it into an interface
		
		Consumer<Integer>myMethod =((n) -> {System.out.println(n);});
		
		//Now since we have already saved what we want to print out, let's call the function using the forEach() class, and the parameter is our saved variable
		
		
		myNumbers.forEach(myMethod);
	
		
		
		
		
	}

}
