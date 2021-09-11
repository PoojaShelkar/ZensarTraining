package TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class Demo11 {

	public static void main(String[] args) {
		

			
			
			TreeMap<Emp,Integer> tm=new TreeMap<>(new myEmpComparator());
			tm.put(new Emp(10,"Pooja",90000),9);
			tm.put(new Emp(11,"Gayatri",80000),9);
			tm.put(new Emp(12,"Kajal",100000), 9);
			tm.put(new Emp(13,"Soni",60000), 9);
			
			System.out.println(tm);
	}
}

class myEmpComparator implements Comparator<Emp>
{

	
	public int compare(Emp o1, Emp o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
	
}
			
			
			
	
