package Array2D;

import java.util.Scanner;

public class JaggyArray {

	public static void main(String[] args) {
		
		int[][] a=new int[4][];
		a[0]=new int[4];
		a[1]=new int[2];
		a[2]=new int[3];
		
		Scanner sc = new Scanner(System.in);
		for(int r=0;r<a.length;r++)
		{
			System.out.println("enter"+a[r].length+"element for row"+r);
			
			for(int c=0;c<a[r].length;c++)
			{
				a[r][c]=sc.nextInt();
			}
		}
		for(int [] q : a)
		{
			for(int d : q)
			{
				System.out.print(d+" ");
			}
			System.out.println();
		}
			
	}

}
