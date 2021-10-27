package JavaPrograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile_30 {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("G:\\JavaSelenium\\Practice Java Programmme\\Test123.txt"); 
		
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("Selenium with java");
		bw.write("Selenium with python");
		bw.write("Selenium with C#");
		
		System.out.println("Finished");
		
		bw.close();
		
	}

}
