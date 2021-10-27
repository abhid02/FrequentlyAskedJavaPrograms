package JavaPrograms;

public class RemoveJunk_24 

{

	public static void main(String[] args) 
	{
		
	String s="~!%^*$$@@ latin string 0123456789";
	
	String s1="@@@@ testing ##### Selenium !@$% &&&& Java";
	
	s=s.replaceAll("[^a-zA-Z0-9]", "");
	
	System.out.println(s);
	
	s1=s1.replaceAll("[^a-zA-Z0-9]", "");
	
	System.out.println(s1);
	}

}
