package HashMapHW;

import java.util.HashMap;

public class SpecifiedKey3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  HashMap<Integer, String> hash_map = new HashMap<>();
		  
	        // Mapping string values to int keys
	        hash_map.put(10, "Geeks");
	        hash_map.put(15, "4");
	        hash_map.put(20, "Geeks");
	        hash_map.put(25, "Welcomes");
	        hash_map.put(30, "You");
	  
	        // Displaying the HashMap
	        System.out.println("Initial Mappings are: " + hash_map);
	  
	        // Checking for the key_element '20'
	        System.out.println("Is the key '20' present? " + 
	        hash_map.containsKey(20));
	  
	        // Checking for the key_element '5'
	        System.out.println("Is the key '5' present? " + 
	        hash_map.containsKey(5));
	    }
	

	}


