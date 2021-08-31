package Collection;

import java.util.ArrayList;

public class Demo {

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
		
		al.add("Pooja");
		System.out.println(al);
		
		al.remove("A");
		System.out.println(al);
		System.out.println(al.contains("A"));
		
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("TQ");
		al2.add("Java");
		al2.add("Trainning");
		
		al2.add("al");
		System.out.println(al);
		System.out.println(al2);
		
		
		

	}

}
