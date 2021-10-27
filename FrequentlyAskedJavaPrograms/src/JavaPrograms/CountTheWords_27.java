package JavaPrograms;

import java.util.Scanner;

public class CountTheWords_27 {

	public static void main(String[] args) {
		
		System.out.println("Enter string");
		
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine(); //Welcome to Java
		
		int count=1;
		
		for(int i=0; i<s.length()-1;i++)
			
			if((s.charAt(i)==' ')  && (s.charAt(i+1)!=' '))//char--> space--> char-->not space
			{
				count++;
			}
		System.out.println("Number of words in String: "+count);
		
		
	}

}
