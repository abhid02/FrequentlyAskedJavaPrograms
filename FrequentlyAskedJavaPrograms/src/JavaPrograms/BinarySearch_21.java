package JavaPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch_21 
{
	public static void main(String[] args) 
	{		
		int a[]= {1,2,3,4,5,6,7,8,9,10}; //Elements should be in sorted order
		
		//Approach 1 Using Logic
		
		/*boolean flag=false;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		
		int key=sc.nextInt();
		sc.close();
		
		int l=0;
		int h=a.length-1;
		
		while(l<=h) //repeating loop till
		
		{
			int m=l+h/2;
			
			if(a[m]==key) //Condition 1
			
			{
				System.out.println("Element found");
				flag=true;
				break;
			}
			
			if(a[m]<key) //condition 2
			
			{
				l=m+1;
			}
			
			if(a[m]>key) //condition 3
			
			{
				h=m-1;
			}
		}
		
		if(flag==false)
		
		{
			System.out.println("Element not found");
			
		}*/
		
//Approach 2 Using Arrays.binarySearch()
		
		//a is array name and 5 is searchable element 
		 
		 System.out.println( Arrays.binarySearch(a,20));//return value is index number 
		 //and if element not there it returns -ve value
	}

}
