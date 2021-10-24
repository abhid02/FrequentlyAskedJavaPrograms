package JavaPrograms;

public class PrimeNumber_11 
{
	/*
	 * Prime number
	 * 1. Natural Number>1
	 * 2. Number which have two factors 1 & itself
	 * 19 is Prime number as factors of 19 are 1 & 19
	 * 28 is Not Prime number as factors of 28 are 1,2,4,7,14,28
	 * 
	 * examples of prime numbers : 2,3,5,7,11,13,17...
	 */

	public static void main(String[] args) 
	{
		
		int num=3;
		int count=0;

		if(num>1)
		{
			for(int i=1; i<=num; i++)
			{
				if(num%i==0)
				  count++;
			}
			
			if(count==2)
			{
				System.out.println(num+" is prime number");
			}
			else
			{
				System.out.println(num+" is not prime number");
			}
		}
		else
		{
			System.out.println(num+" is not prime number");
		}

	}

}
