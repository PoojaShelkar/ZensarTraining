package ComparableaAndComparatorAssign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Emp1> al=new ArrayList<>();
		al.add(new Emp1(10,"Pooja",9));
		al.add(new Emp1(11,"Gayatri",2));
		al.add(new Emp1(12,"Kajal",55));
		al.add(new Emp1(13,"Soni",21));
		
		

		Collections.sort(al);
		for(Emp1 ob:al)
		{
			System.out.println(ob);
		}
		
}
}

class myEmp1Comparator implements Comparator<Emp1>
{


public int compare(Emp1 o1, Emp1 o2) {
	
	return o1.getName().compareTo(o2.getName());
}


	}


