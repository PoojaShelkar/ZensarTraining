package ComparableaAndComparatorAssign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AgeComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			ArrayList<AgeComparator> al=new ArrayList<>();
			al.add(new AgeComparator(11,"Pooja",99));
			al.add(new AgeComparator(55,"Gayatri",2));
			al.add(new AgeComparator(22,"Kajal",55));
			al.add(new AgeComparator(13,"Soni",21));
			
			

			Collections.sort(al);
			for(AgeComparator ob:al)
			{
				System.out.println(ob);
			}
			
	}
	}

	class myAgeComparatorComparator implements Comparator<AgeComparator>
	{


	public int compare(AgeComparator o1,AgeComparator o2) {
		
		return o1.getName().compareTo(o2.getName());
	}


		




	}


