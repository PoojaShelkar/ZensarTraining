package Whileloop;

public class CountNoDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int count = 0, num = 00034523;

		    while (num != 0) {
		      // num = num/10
		      num /= 10;
		      ++count;
		    }

		    System.out.println("Number of digits: " + count);
		  }
		

	}


