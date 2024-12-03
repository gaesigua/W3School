package learnJava;

import java.util.HashMap;

public class LearnHashMap {
	
	public static void main(String[] args) {
	
		HashMap<String, String> cars = new HashMap<String, String>();
		
		//1. Let's add items to the HashMap
		
		cars.put("Germany", "Audi");
		cars.put("USA", "Tesla");
		cars.put("Japan", "Toyota");
		cars.put("South Korea", "Hyundai");
		cars.put("England", "Rolls Royce");
		
		//2. Let's access an item of the HashMap
		
		System.out.println(cars.get("Germany"));
		
		//3. Let's now remove an item
		
		cars.remove("England");
		
		System.out.println(cars);
		
		//4. To remove all items we would use .clear();
		
		//5. To find out the size of the map, we can use .size()
		
		System.out.println(cars.size());
		
		//6. We can Loop through the HashMap using a for each loop
		     //keySet() retrieves the keys
		
		for(String item: cars.keySet()) {
			System.out.println(item);
		}
		
		//7. We can Loop through the HashMap using a for each loop
		    //values() retrieves the values
		
		for(String item: cars.values()) {
			System.out.println(item);
			
		//8. Let's now print both the keys and the values, using a for each loop
			
		for(String item1: cars.keySet()) {
			System.out.println("Key: " + "" + item1 + " Value: " + cars.get(item1));
		}
			
		}
	}

}
