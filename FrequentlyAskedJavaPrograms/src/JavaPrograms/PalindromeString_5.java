package JavaPrograms;

import java.util.Scanner;

public class PalindromeString_5 {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string ");
		
		String str=sc.next();
		
		String org_str=str;
		sc.close();
		
		String rev=""; //instead of null make it empty
		
		int len=str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Reverse String "+rev);
		
		if(org_str.equals(rev))// equals method not ==
		{
			System.out.println("Palindrome String");
		}
		else
			System.out.println("Not Palindrome String");

	}

}
