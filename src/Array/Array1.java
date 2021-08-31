package Array;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		int[] arr = new int[5];
		System.out.println("Enter 5 elements");
		
		for(int i=0;i<=4;i++)
			
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<=4;i++)
			System.out.println(arr[i]);

	}

}
