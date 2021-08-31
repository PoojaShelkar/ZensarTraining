package Day4;

public class Palindrome100to500 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int min = 100;
		  int max = 500;

		  printPal(min, max);
		 }

		 
		 
		 private static boolean isPalindrome(int num) {
		 
		  int reverse = 0;
		  for (int i = num; i > 0; i /= 10)
		   reverse = reverse * 10 + i % 10;

		  
		  return num == reverse;
		 }

		
		  
		 static void printPal(int min, int max) {
		  for (int i = min; i <= max; i++)
		   if (isPalindrome(i))
		    System.out.println(i + " ");
		 }
		}
