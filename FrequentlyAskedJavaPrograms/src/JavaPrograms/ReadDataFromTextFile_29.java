package JavaPrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile_29 
{
	public static void main(String[] args) throws IOException
	{
		
		//Approach 1: Using FileReader BufferReader
		
		FileReader fr=new FileReader("G:\\JavaSelenium\\Practice Java Programmme\\Text.txt");
		
		BufferedReader br=new BufferedReader(fr);
		
		String str;
		
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		
		br.close();
		
		//Approach 2: Using Scanner & File
		
		File file=new File ("C:\\Text.txt");
		
		Scanner sc=new Scanner(file);
		
		/*while(sc.hasNextLine()) //loop statement
		{
			System.out.println(sc.nextLine());
		}*/
		
		//Approach 2: Using userDelimiter() method
		
		sc.useDelimiter("\\Z"); //without loop statement
		System.out.println(sc.next());

	}

}
