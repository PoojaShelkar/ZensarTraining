package Day4;
import java.util.Scanner;


public class Printoddno {
	
	private static Scanner sc;



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number, i;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		number = sc.nextInt();	
		
		for(i = 1; i <= number; i++)
		{
			if(i % 2 == 0)
			{
				System.out.print(i +"\t"); 
			}
		}
	}
}

