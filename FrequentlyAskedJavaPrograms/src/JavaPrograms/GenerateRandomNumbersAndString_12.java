package JavaPrograms;
import java.util.*;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNumbersAndString_12 {

	public static void main(String[] args) 
	{
		/*
		 * Approach 1 -Random Class
		 */
		
		Random rand=new Random();
		
		int rand_int=rand.nextInt(1000);
		
		System.out.println(rand_int);
		
		double rand_dbl=rand.nextDouble(); // range 0.0 to 1.0
		
		System.out.println(rand_dbl);
		
		/*
		 * Approach 2 -Math Class
		 */
		
		System.out.println(Math.random());
		
		/*
		 * Approach 3 -Apache commons-lang API
		 * https://commons.apache.org/proper/commons-lang/download_lang.cgi
		 */
		String randNum=RandomStringUtils.randomNumeric(10);
		System.out.println(randNum);
		
		String randstr=RandomStringUtils.randomAlphabetic(5);
		System.out.println(randstr);
		

	}

}
