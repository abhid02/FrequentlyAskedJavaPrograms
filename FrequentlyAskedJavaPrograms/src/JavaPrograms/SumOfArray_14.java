package JavaPrograms;

public class SumOfArray_14 
{
	/*
	 * Array with 5 elements a[5]
	 * sum=a[]+a[]+a[]+a[]+a[]
	 * 	  =5  +2  +7  +9  +6
	 *    =29
	 */

	public static void main(String[] args) 
	
	{
		int a[]= {5,2,7,9,6};
		int sum=0;
		
//Approach 1
		
		/*for (int i=0; i<=a.length-1; i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum Of Array Elements "+sum);*/
		
//Approach 2
		
		for(int num:a)// no need of index number for retrieving element
		{
			sum=sum+num;
		}
		System.out.println("Sum Of Array Elements "+sum);
	}
}
