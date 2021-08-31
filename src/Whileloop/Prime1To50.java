package Whileloop;

public class Prime1To50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 int primeCheckNumber;
		  int n = 1;
		  int divisibleCount;

		  while (n <= 50) {
		   divisibleCount = 0;
		   primeCheckNumber = 2;
		   while (primeCheckNumber <= n / 2) {
		    if (n % primeCheckNumber == 0) {
		     divisibleCount++;
		     break;
		    }
		    primeCheckNumber++;
		   }
		   if (divisibleCount == 0 && n != 1) {
		    System.out.print(n + " ");
		   }
		   n++;
		  }

		 }
		}