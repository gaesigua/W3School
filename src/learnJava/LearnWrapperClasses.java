package learnJava;

import java.util.ArrayList;

public class LearnWrapperClasses {
	
	public static void main(String[] args) {
	
	//Wrapper classes provide a way to use primitive data types (byte, short, long, float, double, char, int, boolean) as Objects.
	
	//An example of a wrapper class is the use of "Integer" in creating an ArrayList
	
	ArrayList<Integer> myNumber = new ArrayList<Integer>();
	
	//Let's create another Wrapper class
	
	//these are normal primitive data types
	int a = 5;
	double d = 10;
	float f = 5.2f;
	boolean b = true;
	
	//these are Wrapper Classes
	
	Integer myWrappedIntClass = 10;
	Double myWrappedDoubleClass = 22.5;
	Float myWrappedFloatClass = 5.3f;
	
	//Let's print the variables using wrapper classes
	
	System.out.println(myWrappedIntClass);
	System.out.println(myWrappedDoubleClass);
	System.out.println(myWrappedFloatClass);
	
	
	//We can get the value of Wrapper Class using methods: intValue(), floatValue(), shortValue(), longValue(), booleanValue() 
	
	System.out.println(myWrappedIntClass.intValue());
	System.out.println(myWrappedDoubleClass.doubleValue());
	System.out.println(myWrappedFloatClass.floatValue());


	
}
	
}
