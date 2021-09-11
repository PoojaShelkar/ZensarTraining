package ComparableaAndComparatorAssign;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListsortUsingCollectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<>();
		al.add("Pooja");
		al.add("Gayatri");
		al.add("Kajal");
		al.add("Soni");
		
		Collections.sort(al);
		for(String ob:al)
		{
			System.out.println(ob);
		}
		
}

	}


