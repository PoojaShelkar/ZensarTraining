package Array2D;

import java.util.Scanner;

public class Diagonal {

	public static void main(String[] args) {
		
		int[]a={1,2,3,4,5};
		int [][] arr = new int[4][6];
		
		
	System.out.println(arr.length);
	System.out.println(arr[0].length);
	Scanner sc=new Scanner(System.in);
	
	for(int r=0;r<arr.length;r++)
	{
		System.out.println("enter all element of row");
		
		for(int c=0;c<arr[r].length;c++)
		{
			arr[r][c]=sc.nextInt();
		}
			
		{
	
	
	
}
System.out.println();


	}
	
	System.out.println("top element of right Diagonal :" + arr[0][3]);
	
	System.out.println("Right Diagonal element:");
	for(int r=0;r<arr.length;r++)
	{
		for(int c=0;c<arr[r].length;c++)
		{
				
				System.out.println(arr[r][c]);
				
		}
	}
	
}


		
		

	}


