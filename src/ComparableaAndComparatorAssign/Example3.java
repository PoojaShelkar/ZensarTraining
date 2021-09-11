package ComparableaAndComparatorAssign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Example3 {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ArrayList<Integer> al=new ArrayList<>();
			al.add(10);
			al.add(17);
			al.add(12);
			al.add(1);
			
	
			Collections.sort(al);
			for(Integer ob:al)
			{
				System.out.println(ob);
			}
			
	}

	class myExample3Comparator implements Comparator<Example3>
	{


	public int compare(Example3 o1, Example3 o2) {
		
		return ((Integer) o1.getInteger()).compareTo((Integer) o2.getInteger());
	}


		


	}
	public Object getInteger() {
		// TODO Auto-generated method stub
		return null;
	
	}
}

