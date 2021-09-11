package HashMapHW;

import java.util.HashMap;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Empty7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Integer, String> map = new HashMap<>();

     // Populate the HashMap
     map.put(1, "Geeks");
     map.put(2, "ForGeeks");
     map.put(3, "GeeksForGeeks");

     // Get the key to be removed
     int keyToBeRemoved = 2;

     // Print the initial HashMap
     System.out.println("Original HashMap: "+ map);

     // Get the iterator over the HashMap
     Iterator<Map.Entry<Integer, String> >
         iterator = map.entrySet().iterator();

     // Iterate over the HashMap
     while (iterator.hasNext()) {

         // Get the entry at this iteration
         Map.Entry<Integer, String>
             entry
             = iterator.next();

         // Check if this key is the required key
         if (keyToBeRemoved == entry.getKey()) {

             // Remove this entry from HashMap
             iterator.remove();
         }
     }

     // Print the modified HashMap
     System.out.println("Modified HashMap: "
                        + map);
 }


	}


