package HashMapHW;

import java.util.HashMap;

public class RemoveElementUsingKey6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Integer, String> hash_map = new HashMap<>();
		 
		    // Mapping string values to int keys
		    hash_map.put(10, "om");
		    hash_map.put(15, "pooja");
		    hash_map.put(20, "Geeks");
		    hash_map.put(25, "Welcomes");
		    hash_map.put(30, "You");
		 
		    // Displaying the HashMap
		    System.out.println("Initial Mappings are: " + hash_map);
		 
		    // Removing the existing key mapping
		    String returned_value = (String)hash_map.remove(20);
		 
		    // Verifying the returned value
		    System.out.println("Returned value is: "+ returned_value);
		 
		    // Displaying the new map
		    System.out.println("New map is: "+ hash_map);
		}
		

	}


