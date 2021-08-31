package Day4;
import java.util.Scanner;

public class Studentinfo {
	
	String name;
	String qualification;
	long mobileno;
	String city;
	String age;

	public static void main (String[] args)
		
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter name ,qualification ,mobileno ,city ,age.");
			Studentinfo s1 = new Studentinfo();
			
			s1.name=sc.next();
			s1.qualification=sc.next();
			s1.mobileno=sc.nextLong();
			s1.city=sc.next();
			s1.age=sc.next();
			System.out.println("your name="+s1.name);
			System.out.println("your qualification="+s1.qualification);
			System.out.println("your mobileno="+s1.mobileno);
			System.out.println("your city="+s1.city);
			System.out.println("your age="+s1.age);
			
			
			
		}
			
			
		
		
		}
		
		
		

		
		

	


