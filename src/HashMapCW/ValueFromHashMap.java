package HashMapCW;

import java.util.HashMap;

public class ValueFromHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  // Creating an empty HashMap
        HashMap<Integer, String> hash_map = new HashMap<>();
  
        // Mapping string values to int keys
        hash_map.put(10, "Pooja");
        hash_map.put(15, "Ram");
        hash_map.put(20, "Abc");
        hash_map.put(25, "Welcomes");
        hash_map.put(30, "You");
  
        // Displaying the HashMap
        System.out.println("Initial Mappings are: " + hash_map);
  
        // Getting the value of 25
        System.out.println("The Value is: " + hash_map.get(25));
  
        // Getting the value of 10
        System.out.println("The Value is: " + hash_map.get(10));
    }


	}


