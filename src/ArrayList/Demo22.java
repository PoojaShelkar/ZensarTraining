package ArrayList;

import java.util.ArrayList;
import java.util.Comparator;

public class Demo22 {

	public static void main(String[] args) {
		
		
		ArrayList<Student22> al=new ArrayList<>();
		al.add(new Student22(10,"Pooja",90));
		al.add(new Student22(11,"Gayatri",80));
		al.add(new Student22(12,"Kajal",100));
		al.add(new Student22(13,"Soni",60));
		
		System.out.println(al);
}
}

class myStudent22Comparator implements Comparator<Student22>
{


public int compare(Student22 o1, Student22 o2) {
	
	return o1.getName().compareTo(o2.getName());
}


		

	}


