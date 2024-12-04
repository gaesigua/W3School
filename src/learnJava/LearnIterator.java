package learnJava;

import java.util.ArrayList;
import java.util.Iterator;

public class LearnIterator {

	public static void main(String[] args) {
		
		// An Iterator is an Object that can be used to loop through collections, like ArrayList and HashSet.
		// It is called an "Iterator" because Iterating is the technical term for looping.
		
		//We create an Iterator for a collection by using the Iterator() method
		
		//1. Let's create our ArrayList first
		
		ArrayList <String> myCarCollection = new ArrayList<String>();
		
		
		//2. Let's add some items to my collection
		
		myCarCollection.add("Tesla");
		myCarCollection.add("Toyota");
		myCarCollection.add("Porsche");
		myCarCollection.add("Audi");
		
		
		//3. Let's now create an Iterator Object for our collection
		
		Iterator<String> myIterator = myCarCollection.iterator();
		
		
		//4. Now Let's first print the first item and see
		
		System.out.println(myIterator.next());
		
		//5. Now Let's loop through the collection using Iterator
		
		while(myIterator.hasNext()) {
			System.out.println(myIterator.next());
		}
		
		//6. Now Let's create another collection of my favorite numbers
		
		ArrayList <Integer> myFavoriteNumbers = new ArrayList<Integer>();
		
		//7. Let's add items to the collection
		
		myFavoriteNumbers.add(2);
		myFavoriteNumbers.add(8);
		myFavoriteNumbers.add(12);
		myFavoriteNumbers.add(20);
		myFavoriteNumbers.add(30);
		
		//8. Let's create an Iterator Object of the collection
		
		Iterator<Integer> myIterator2 = myFavoriteNumbers.iterator();

		//9. Now Let's try to remove all the numbers less than 10, and then print the rest
		
		//we first create a while loop, and ask to loop through the collection
		//as long as the object/my collection has the added items
		
		while(myIterator2.hasNext()) {
		
			//Now it goes through each item available in the loop which produced by the next()
			//After finding that item, we save it in a variable called number
			
			int number = myIterator2.next();

			//Now we have to introduce an if condition, that if the saved variable is less than 10,
			// then we must remove that number on following line
			if(number < 10) {
				
				//when we are done checking all the numbers less than 10,
				//then we remove the remaining numbers (all the numbers greater than 10)
				
				myIterator2.remove();
			}
			
			System.out.println(myFavoriteNumbers);
		}
		
		

	}

}
