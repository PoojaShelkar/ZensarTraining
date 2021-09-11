package HashMapCW;

import java.util.HashMap;

public class HashMapUsingGenerics3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a map of generic type.	
		  HashMap<Integer, String> map = new HashMap<>();
		 
		// Checking map is empty or not.
		   boolean isEmpty = map.isEmpty();
		   System.out.println(" Is Map is empty? " +isEmpty);
		  
		// Adding entries in the map. Call put() method to add entries in map.
		   map.put(101, "Red");
		   map.put(103, "Green");
		   map.put(102, "Yellow");
		   map.put(104, "Blue");
		  
		   
		System.out.println("Entries in Map: " +map);  
		int size = map.size();
		System.out.println("No. of entries in Map: " +size);

		// Create another map.
		

}
}
