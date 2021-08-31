package Assignment3Class;
import java.util.Scanner;
public class CopyOneValueToAnother {

		
		 private String name;
		   private int age;
		   public void Student(String name, int age){
		      this.name = name;
		      this.age = age;
		   }
		   public CopyOneValueToAnother(Student std){
		      this.name = std.name;
		      this.age = std.age;
		   }
		   public CopyOneValueToAnother(String name2, int age2) {
			// TODO Auto-generated constructor stub
		}
		public void displayData(){
		      System.out.println("Name : "+this.name);
		      System.out.println("Age : "+this.age);
		   }
		   public static void main(String[] args) {
		      Scanner sc =new Scanner(System.in);
		      System.out.println("Enter your name ");
		      String name = sc.next();
		      System.out.println("Enter your age ");
		      int age = sc.nextInt();
		      Assignment3Class.Student std = new CopyOneValueToAnother(name, age);
		      System.out.println("Contents of the original object");
		      std.displayData();
		      System.out.println("Contents of the copied object");
		      CopyOneValueToAnother copyOfStd = new CopyOneValueToAnother (std);
		      copyOfStd.displayData();
		   }
		}