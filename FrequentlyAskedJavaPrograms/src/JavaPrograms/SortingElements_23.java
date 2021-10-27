package JavaPrograms;

import java.util.Arrays;
import java.util.Collections;

public class SortingElements_23 

{
	public static void main(String[] args) 
	
	{
		
// Approach 1-> Arrays.parallelSort();
		
		int a[]= {30,50,20,10,60};
		
		System.out.println("Before sorting"+ Arrays.toString(a));//Array elements in the form of ArrayList
		
		Arrays.parallelSort(a);
		
		System.out.println("After sorting"+ Arrays.toString(a));
		
// Approach 2-> Arrays.sort();
		
		int b[]= {30,50,20,10,60};
		
		System.out.println("Before sorting"+ Arrays.toString(b));
		
		Arrays.sort(b);
		
		System.out.println("After sorting"+ Arrays.toString(b));
		
//Reverse Descending Order-> Arrays.sort(array name,Collections.reverseOrder())
		
		Integer c[]= {30,50,20,10,60};
		
		System.out.println("Before sorting"+ Arrays.toString(c));
		
		Arrays.sort(c,Collections.reverseOrder()); //Array should be derived data type
		
		System.out.println("After sorting"+ Arrays.toString(c));	
	}

}
