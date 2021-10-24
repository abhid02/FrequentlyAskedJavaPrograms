package JavaPrograms;

public class MissingNumberInArray_17 
{
	
	/*
	 * Array should not have duplicates
	 * Array no need to be sorted order
	 * Values should be in proper range
	 */

	public static void main(String[] args) 
	{
		int a[]= {1,2,4,5};
		
// find sum of 'elements' in array
		
		int sum1=0;
		
		for(int i=0; i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		
		//System.out.println(sum1);
		
// find of sum of 'range' of Array		
		
		int sum2=0;
		
		for(int i=1;i<=5;i++)
		{
			sum2=sum2+i;// not a[i]
		}
		
		//System.out.println(sum2);
		
//find Missing Number In Array
		
		int sum3=sum2-sum1;
		
		System.out.println("Missing Number In Array "+sum3);
		
	}

}
