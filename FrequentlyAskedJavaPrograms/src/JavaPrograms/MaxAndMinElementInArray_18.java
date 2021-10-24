package JavaPrograms;

public class MaxAndMinElementInArray_18 
{
	public static void main(String[] args) 
	
	{
		int a[]= {50,70,80,40,10};

//Maximum Number in Array
		
		int max=a[0];
		
		for(int i=1; i<a.length;i++)
		
		{
			if(a[i]>max)
			
			{
				max=a[i];
			}
		}
				System.out.println("Maxiumum Number in Array= "+max);
		
//Minimum Number in Array
		
		int min=a[0];
		
		for(int i=1; i<a.length;i++)
		
		{
			if(a[i]<min)
			
			{
				min=a[i];
			}
		}
				System.out.println("Maxiumum Number in Array= "+min);

	}

}
