package JavaPrograms;

import java.util.Scanner;

public class ReverseANumber_2 
{
	public static void main(String[] args) 
	{
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number");
       int num=sc.nextInt();
       sc.close();
       
       //1. Using algorithm
       
       /*int rev=0;
       
       while (num!=0)
       {
    	   rev=rev*10+num%10;
    	   num=num/10;
       }*/
       
       //2. Using StringBuffer class
       
       /*StringBuffer sb=new StringBuffer(String.valueOf(num));
       StringBuffer rev=sb.reverse();*/
       
       
       //3. using StringBuilder class
       
       StringBuilder sbl=new StringBuilder();
       sbl.append(num);
       StringBuilder rev=sbl.reverse();
       System.out.println("Reverse number is "+rev);

	}

}
