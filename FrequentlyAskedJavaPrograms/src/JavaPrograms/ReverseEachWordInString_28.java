package JavaPrograms;

public class ReverseEachWordInString_28 

{
	public static void main(String[] args) 
	{

//Approach 1
		
		String str="Welcome To Java";
		
		String[] words=str.split(" ");
		
		String reverseString="";
		
		for(String w:words)
		{
			String reverseWord="";
			
			for(int i= w.length()-1; i>=0; i--)
			{
				reverseWord=reverseWord+ w.charAt(i);
			}
			reverseString=reverseString+reverseWord+" ";
		}
		
		System.out.println(reverseString);
		
//Approach 2
		
		String str1="Welcome To Java";
		
		String[] words1=str1.split("\\s");
		
		String reverseword1="";
		
		for(String w1:words1)
		{
			StringBuilder sb=new StringBuilder(w1);
			sb.reverse();
			
			reverseword1=reverseword1+sb.toString()+" ";
			
		}
		
		System.out.println(reverseword1);
	}

}
