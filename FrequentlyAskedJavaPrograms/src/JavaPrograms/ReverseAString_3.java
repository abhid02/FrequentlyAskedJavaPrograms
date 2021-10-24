package JavaPrograms;

import java.util.Scanner;

public class ReverseAString_3 
{

	public static void main(String[] args) 
	{
		
		//1. Using String concatenation operator
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string ");
		
		String str=sc.next();
		
		sc.close();
		
		String rev=""; //instead of null make it empty
		
		/*int len=str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("reverse string"+rev);*/
		
		//2. Using character Array
		
		/*char a[]=str.toCharArray();
		
		int len=a.length;
		
		for(int i=len-1; i>=0; i--)
		{
			rev=rev+a[i];
		}
		System.out.println("reverse string "+rev);*/
		
		//3.Using StringBuffer class
		
		StringBuffer sb=new StringBuffer(str);
		
		System.out.println("reverse string "+sb.reverse());
		

	}

}
