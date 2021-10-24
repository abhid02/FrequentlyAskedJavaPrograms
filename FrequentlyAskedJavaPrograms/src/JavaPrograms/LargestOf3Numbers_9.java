package JavaPrograms;
import java.util.*;


public class LargestOf3Numbers_9 
{

	public static void main(String[] args) 
	{
		
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter first number");
      int a=sc.nextInt();
      System.out.println("Enter second number");
      int b=sc.nextInt();
      System.out.println("Enter third number");
      int c=sc.nextInt();
      
 
      /*
       * Approach 1 Using Logic
       * let a=10 b=20 c=30
       * a>b and b>c a largest
       * b>a and b>c b largest
       * c>a and c>b c largest 
       */
      
      if(a>b&&a>c)
      {
    	  System.out.println("a="+a+" is largest number");
      }
      else if(b>a&&b>c)
      {
    	  System.out.println("b="+b+" is largest number");
      }
      else
    	  System.out.println("c="+c+" is largest number");
      
      /* 
       * Approach 2 using Ternary Operator ~ if...else
       * a=10 b=20
       * largest a>b?a:b (a>b is true then a is largest)
       * 				 (a>b is false then b is largest)
       * whichever largest of two numbers a and b 
       * compare that number with number c
       */
    	
      int largest1=a>b?a:b;
      
      int largest2=c>largest1?c:largest1;
      
      /*
       * Combining above two expressions
       * int largest=c>(a>b?a:b)?c:(a>b?a:b);
       */
     
      
      System.out.println("c="+largest2+" is largest number");
      
      
	}

}
