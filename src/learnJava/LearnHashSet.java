package learnJava;

import java.util.HashSet;

public class LearnHashSet {

	public static void main(String[] args) {
		
		//A HashSet is a collection of items where every item is unique
		
		//1. Let's add items to a HashSet
		
		HashSet<String> familyName = new HashSet<String>();
		
		familyName.add("Karangwa");
		familyName.add("Kanamugire");
		familyName.add("Kayonga");
		familyName.add("Kalinganire");
		
		System.out.println(familyName);
		
		//2. Let's check if the item exists in the HashSet
		
		System.out.println(familyName.contains("Karangwa"));
		
		//3. Let's remove an item from the HashSet
		
		familyName.remove("Kalinganire");
		
		System.out.println(familyName);
		
		//4. To remove all items, we can use clear()
		
		//5. To check the size of the HashSet, let's use size()
		
		
		System.out.println(familyName.size());
		
		//6. We can loop through the items of an HashSet with a for-each loop
		
		for(String item: familyName) {
			System.out.println(item);
		}

	}

}
