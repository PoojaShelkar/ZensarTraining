package Day5;
import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows needed to print the pattern ");

        int rows = scanner.nextInt();
        
        System.out.println("## Printing the pattern ##");
        
        for (int i=rows; i>=1; i--)
        {
            // Print star in decreasing order
            for (int k=1; k<=(i * 2) -1; k++) 
            { 
                System.out.print("*"); 
            } 
            System.out.println(); 
            // Print space in increasing order 
            for (int j=rows; j>=i; j--)
            {
                System.out.print(" ");
            }
            
        }
        scanner.close();
    }

	}


