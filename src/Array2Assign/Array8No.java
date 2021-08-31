package Array2Assign;

import java.util.Scanner;

public class Array8No {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int arr[][] = new int[4][4];
        
        System.out.println("Enter elements of 4x4 array ");
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter Row "+ (i+1) + " :");
            for (int j = 0; j < 4; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        
        System.out.println("Input Array:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        
        //Swap 0th and 3rd rows
        for (int j = 0; j < 4; j++) {
            int t = arr[0][j];
            arr[0][j] = arr[3][j];
            arr[3][j] = t;
        }
        
       
            System.out.println();
        }
    
}
		
	



