package JavaPrograms;

public class CountNumberOfDigits_6 
{

	public static void main(String[] args) 
	{
	
		int num=123456;
		int count=0;
		
		while (num>0)//condition
		{
			num=num/10; //repeat till num becomes zero
			count++;// increment count
		}
		
		System.out.println("Number of digits in a number: "+count);
	}

}
