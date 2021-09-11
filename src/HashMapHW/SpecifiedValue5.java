package HashMapHW;

import java.util.HashMap;

public class SpecifiedValue5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hash_map = new HashMap<>();
		  
        // Mapping string values to int keys
        hash_map.put(10, "pooja");
        hash_map.put(15, "om");
        hash_map.put(20, "sham");
        hash_map.put(25, "Welcomes");
        hash_map.put(30, "You");
  
        // Displaying the HashMap
        System.out.println("Initial Mappings are: " + hash_map);
  
        // Checking for the Value 'Geeks'
        System.out.println("Is the value 'pooja' present? " + 
        hash_map.containsValue("pooja"));
  
        // Checking for the Value 'World'
        System.out.println("Is the value 'World' present? " + 
        hash_map.containsValue("World"));
    }


	}


