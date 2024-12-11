package learnJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//We have already learned how to sort lists alphabetically and numerically, 
//Using "Comparator and comparable", both interfaces, help us to sort not just lists but they are useful to sort OBJECTS;
//Let's say you have a list of cars, and you want to sort them by year, and you want let's say to sort them starting from the old ones
//that's when comparator and comparable become handy because they allow us to specify which rule to use to sort those objects
	
	
//1. COMPARATORS
	
//An object that implements a comparator interface is called "comparator", and the comparator interface helps us use a method called 'compare"
	
//Let's create a class and implements the comparator interface, so that we will be able to use the compare method;
//Let's sort my cars by years

	
//Let's define a Car class
class Car {
	  public String brand;
	  public String model;
	  public int year;
	  
	  public Car(String b, String m, int y) {
	    brand = b;
	    model = m;
	    year = y;
	  }
	}

	// Create a comparator

class LearnComparatorAndComparable implements Comparator {
	  public int compare(Object obj1, Object obj2) {
	    // Make sure that the objects are Car objects
	    Car a = (Car) obj1;
	    Car b = (Car) obj2;
	    
	    // Compare the year of both objects
	    if (a.year < b.year) return -1; // The first car has a smaller year
	    if (a.year > b.year) return 1;  // The first car has a larger year
	    return 0; // Both cars have the same year
	  }
	}

class Main { 
	  public static void main(String[] args) { 
	    // Create a list of cars
	    ArrayList<Car> myCars = new ArrayList<Car>();    
	    myCars.add(new Car("BMW", "X5", 1999));
	    myCars.add(new Car("Honda", "Accord", 2006));
	    myCars.add(new Car("Ford", "Mustang", 1970));

	    // Use a comparator to sort the cars
	    Comparator myComparator = new LearnComparatorAndComparable();
	    
	    Collections.sort(myCars, myComparator);

	    // Display the cars
	    for (Car c : myCars) {
	      System.out.println(c.brand + " " + c.model + " " + c.year);
	    }
	  } 
	}
