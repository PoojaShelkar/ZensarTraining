package ExtraCollection;

import java.util.ArrayList;

import Array2Assign.Student;

public class DemoCustomSort {

	public static void main(String[] args) {
		
		ArrayList<Student> al=new ArrayList<>();
		al.add(new Student("om", "BE",8888711071,90));
		al.add(new Student("Raj", "BE",8888711071,90));
		al.add(new Student("Anand", "BE",8888711071,90));
		al.add(new Student("Priya", "BE",8888711071,90));
		al.add(new Student("Ayushi", "BE",8888711071,90));
		al.add(new Student("Abhijit", "BE",8888711071,90));
		
		Collections.sort(al);
		
		for(Student ob:al)
		System.out.println(ob);

	}

}
