package JavaPrograms;

public class Swapping2Numbers_1 
{

	public static void main(String[] args) 
	
	{
	
		int a=10, b=20;
		
		System.out.println("Before swapping values are:"+a+"  "+b);
		
		//Logic 1 -Third Variable
		
		/*int t=a;
		a=b;
		b=t;*/
		
		//Logic 2 -using + & - Operators
		
		/*a=a+b; //10+20=30
		b=a-b; //30-20=10
		a=a-b; //30-10=20*/
		
		//Logic 3 Using * & / operator Here a & b should Not be zero
		
		/*a=a*b; //10*20=200
		b=a/b; //200/10=20
		a=a/b; //200/20=10*/
		
		//Logic4 Using Bitwise xor operator
		
		/*a=a^b;
		b=a^b;
		a=a^b;*/
		
		//logic single Statement
		
		b=a+b-(a=b); //execution started from right to left
		
		System.out.println("After swapping values are: "+a+"  "+b);

	}

}
