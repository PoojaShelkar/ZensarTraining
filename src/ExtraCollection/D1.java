package ExtraCollection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Array2Assign.Student;

public class D1 {


	public static void main(String[] args) {
		
		ArrayList<Student1> al=new ArrayList<>();
		al.add(new Student1(1,"Om",90));
		al.add(new Student1(2,"Pooja",91));
		al.add(new Student1(3,"Gayu",80));
		al.add(new Student1(4,"kajl",97));
		
		Collections.sort(al);
		
		for(Student1 ob:al)
		{
			System.out.println(ob);
		}
	}
}

 class mysort implements Comparator<Student1>{

public int CompareTo(Student1 ol,Student1 o2)
{
	
	return o1.getpercent()-o1-getpercent();
	
}



 }





