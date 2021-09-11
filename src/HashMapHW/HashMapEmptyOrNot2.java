package HashMapHW;

import java.util.HashMap;

public class HashMapEmptyOrNot2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Integer, String> hmap = new HashMap<>(); 
		 
		 
		    
		    System.out.println("Is HashMap Empty? "+hmap.isEmpty());
		 
		    // Adding few elements
		    hmap.put(11, "Jack");
		    hmap.put(22, "Rock");
		    hmap.put(33, "Rick");
		    hmap.put(44, "Smith");
		    hmap.put(55, "Will");
		 
		    // Checking again
		    System.out.println("Is HashMap Empty? "+hmap.isEmpty());
		  } 
		

	}


