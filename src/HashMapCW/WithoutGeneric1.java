package HashMapCW;

import java.util.HashMap;

public class WithoutGeneric1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 HashMap<Integer, String> map = new HashMap<>();
		 map.put(101, "Red");
		   map.put(103, "Green");
		   map.put(102, "Yellow");
		   map.put(104, "Blue");
		  
		  System.out.println(map);
		  
		  HashMap<String,Integer> map1 = new HashMap<>();
		  map1.put("Red", 4);
		   map1.put("Green", 1);
		   map1.put( "Yellow", 5);
		   map1.put("Blue", 9);
		   
		   System.out.println(map1);
	}

}
