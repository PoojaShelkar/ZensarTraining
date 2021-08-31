package Array2Assign;

import java.util.Scanner;

public class Student {
	int sid;
	String name;
	String hobbies h;
	public Student(int sid, String sname, String[] hobbies) { 
		
		this.sid = sid;
		this.name = name;
		this.hobbies = hobbies;
		}
		}
class Hobbies
{
	String hobbiesname;
	}
public class StudentTest{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		Student studarray[]=new Student[3];
		for(int i=0;i<studarray.length;i++)
		{
			System.out.println("enter student id annd name");
			int x=sc.nextInt();
			String y=sc.nextInt();
			
			System.out.println("how many hobbies you want to enter");
			int temp=sc.nextInt();
			hobbies h[]=new hobbies[temp];
			for(int j=0;j<h.length;j++)
			{
			System.out.println("enter hobbies ");
			int hobbies=sc.nextInt();
			h[j]=neew hobbies(playing , reading);
			}
			studyarray[i]=new student(x,y,h);
		}
	
		
}	


				
		
			
	

