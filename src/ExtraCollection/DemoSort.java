package ExtraCollection;

import java.util.ArrayList;
import java.util.Collections;

public class DemoSort {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList<String> al=new ArrayList<String>();
		
		al.add("Pooja");
		al.add("A");
		al.add("B");
		al.add("c");
		al.add("d");
		al.add("e");
		
		
		System.out.println(al);
		Collections.reverse(al);
		System.out.println();
		int c=Collections.frequency(al,"B");
		System.out.println("Fry : " +c);
		Collections.shuffle(al);
		System.out.println(al);
		
		Collections.swap(al,1,0);
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		
	}

}
