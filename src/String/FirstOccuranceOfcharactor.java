package String;

import java.util.Scanner;

public class FirstOccuranceOfcharactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstCharStr;
		char ch;
		
		Scanner sc= new Scanner(System.in);

		System.out.print("\nPlease Enter String to find First Occurrence =  ");
		firstCharStr = sc.nextLine();
		
		System.out.print("\nEnter the Character to Find =  ");
		ch = sc.next().charAt(0);
		
		int x = firstCharStr.indexOf(ch);
		
		System.out.format("\nThe First Character Occurrence of %c at %d position", 
				firstCharStr.charAt(x), x);
	}
}