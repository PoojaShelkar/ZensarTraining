package String;

import java.lang.reflect.Array;
import java.util.Scanner;


public class AllFunction {

  static int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String s1="Pooja";
		String a=s1.toUpperCase();
		String b=s1.toLowerCase();
		char c=s1.charAt(0);
		String s3="ThinkQuotient";
		String ss=s3.substring(2);
		String str="my name is pooja";
		String[] arr=str.split(" ");
		
		
		for(int i=0;i<s1.length();i++){
			System.out.println(s1.charAt(i));
			
		}
		
		System.out.println(s1);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(s1.charAt(i));
		System.out.println(ss);
		System.out.println(s3.indexOf('k'));
		System.out.println(s3.lastIndexOf('o'));
		System.out.println(arr[0]);
	

}
}
