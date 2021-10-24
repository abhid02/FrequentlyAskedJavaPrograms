package JavaPrograms;
import java.util.*;

public class DuplicateElementsInArray_19 
{

	public static void main(String[] args) 
	{
		
		String a[]= {"java","C","C++","Python","java"};
		
//Approach 1 Using Logic
		
		/*boolean flag=false;
		
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if (a[i]==a[j])
				{	
				System.out.println("Found Duplicate Element:"+a[i]);
				flag=true;
				}
			}
		}
		
		if(flag==false)
			System.out.println("Not Found Duplicate Element");*/

//Approach 2 Using HashSet(not allow duplicates)
		
		HashSet langs=new HashSet();
		
		/*System.out.println(langs.add("Java"));
		System.out.println(langs.add("Java"));
		System.out.println(langs.add("Python"));
		System.out.println(langs.add("java"));*/
		
		boolean flag=false;
		
		for(String l:a)
		{
			if(langs.add(l)==false)
			{
				System.out.println("Found duplicate element "+l);
				flag=true;
			}
		}
		if(flag=false)
			System.out.println("Not Found duplicate element");
		

	}

}
