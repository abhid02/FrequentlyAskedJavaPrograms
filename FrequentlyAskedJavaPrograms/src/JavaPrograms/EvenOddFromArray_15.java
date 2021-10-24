package JavaPrograms;

public class EvenOddFromArray_15 

{
	public static void main(String[] args) 
	
	{
		int a[]= {1,2,3,4,5,6};
		
// Extracting even numbers
		
// Using for loop
		
		System.out.print("Even numbers in array ");
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			System.out.println("\n"+a[i]);
		}
		
// Using enhanced For Loop
		
				for(int value:a)
				{
					if(value%2==0)
					System.out.println("\n"+value);	
				}
					
// Extracting odd numbers
// Using for loop
		
		System.out.print("Odd numbers in array ");
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2!=0)
			System.out.println("\n"+a[i]);
		}
		
// Using enhanced For Loop
		
				for(int value:a)
				{
					if(value%2!=0)
					System.out.println("\n"+value);	
				}
	}
}
