package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Student {

	public static void main(String[] args) {
		ArrayList<String> numbers = new ArrayList<String>();
	    numbers.add("Pooja");
	    numbers.add("Gayu");
	    numbers.add("Kajal");
	    System.out.println("ArrayList: " + numbers);

	    // Creating an instance of ListIterator
	    ListIterator<String> iterate = numbers.listIterator();
	    System.out.println("Iterating over ArrayList:");
	    while(iterate.hasNext()) {
	      System.out.print(iterate.next() + ", ");
	    }
	  }
	}