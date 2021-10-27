package JavaPrograms;

import java.util.Scanner;

public class PalindromeNumber_4 {
	
	/*
	 * A palindrome number is a number that remains the same when digits are reversed. 
	 * For example, the number 12321 is a palindrome number, 
	 * but 1451 is not a palindrome number. Given a positive integer, 
	 * the task is to check whether the number is palindrome or not.
	 */

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	       System.out.println("Enter a number");
	       int num=sc.nextInt();
	       
	       int org_num=num;
	       sc.close();
	       
	       int rev=0;
	       
	       while (num!=0)
	       {
	    	   rev=rev*10+num%10;
	    	   num=num/10;
	       }
	       System.out.println("Reverse number is "+rev);
	       
	       if(org_num==rev)
	       {
	    	   System.out.println("palindrome number");  
	       }
	       else
	    	   System.out.println("not palindrome number"); 

	}

}
