package Day5;
import java.util.Scanner;

public class NumberPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows to print the pattern ");

        int rows = scanner.nextInt();
        
        System.out.println("** Printing the pattern... **");
        
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print("0 ");
            }
            System.out.print(i + " ");
            for (int k = i; k < rows; k++)
            {
                System.out.print("0 ");
            }
            System.out.println();
        }
    }


	}
