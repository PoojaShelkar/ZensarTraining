
		package Collection;

import java.util.ArrayList;

public class Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Pooja");
		al.add("A");
		al.add("B");
		al.add("c");
		al.add("d");
		al.add("e");
		al.add("f");
		al.add("g");
		al.add("h");
		al.add("i");
		al.add("Gayu");
		
		System.out.println(al);
		System.out.println(al.size());
		//al.clear();
		//System.out.println(al);
		java.util.Iterator<String> i = al.iterator();
		while(i.hasNext());
		{
			String data=i.next();
			System.out.println();
		}
		

	}

}
