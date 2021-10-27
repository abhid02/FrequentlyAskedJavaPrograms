package JavaPrograms;

public class CountCharacterOccurance_26 
{

	public static void main(String[] args) 
	{
		
		String s="Java Programming Java oops";
		
		int totalcount=s.length(); // total length
		
		int totalcount_afterRemove=s.replace("a","").length(); //total length after removing a
		
		int count=totalcount-totalcount_afterRemove;
		
		System.out.println("number of occurances of a "+count);
		

	}

}
