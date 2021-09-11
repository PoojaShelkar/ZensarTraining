package HashMapCW;

import java.util.HashMap;

public class IterateKeysAndValue5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<String,String> hm = new HashMap<String,String>();
	     
	        // enter name/url pair
	        hm.put("Pooja", "Shelkar");
	       hm.put("Gayatri", "Shelkar");
	        hm.put("Kajal", "Patil");
	        hm.put("Soni", "Kale");
	         
	        // using keySet() for iteration over keys
	        for (String name : hm.keySet())
	            System.out.println("key: " + name);
	         
	        // using values() for iteration over values
	        for (String url :hm.values())
	            System.out.println("value: " + url);
	    }
	

	}


