package Collection;

import java.util.ArrayList;

public class Demo1 {

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
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}

	}

}
