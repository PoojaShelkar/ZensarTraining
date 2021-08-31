package Day4;
import java.util.Scanner;


public class Sumofevenno1ton {
	
	private static Scanner sc;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number, i, evenSum = 0;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		number = sc.nextInt();	
		
		for(i = 1; i <= number; i++)
		{
			if(i % 2 == 0)
			{
				evenSum = evenSum + i; 
			}
		}
		System.out.println("\n The Sum of Even Numbers upto " + number + "  =  " + evenSum);
	}


	}


