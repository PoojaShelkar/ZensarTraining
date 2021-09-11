package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Pooja");
		al.add("A");
		al.add("B");
		al.add("c");
		al.add("d");
		
		ArrayList<String> al2=new ArrayList<String>();
		
		al2.add("e");
		al2.add("f");
		al2.add("g");
		al2.add("h");
		
		al2.add("Gayu");
		

       al2.addAll(al);
	   al2.removeAll(al);
	   System.out.println(al.size());
	   
	   System.out.println(al.indexOf("B"));

		System.out.println(al2);
		System.out.println(al);
		System.out.println(al.size());
		
		System.out.println(al2.containsAll(al));
		
		System.out.println(al.isEmpty());
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
			
		}

	}

}
