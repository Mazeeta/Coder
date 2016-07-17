package java1_introduction;

public class Factorial_Recursion
{
	static int num = 10;
	
	static int fact(int temp)
	{
		if(temp == 0)
			return 1;
		else
			return (temp * fact(temp-1));
	}
	
	public static void main (String args[])
	{
		System.out.println("Factorial of "+num+" is :: "+ fact(num));
	}
	
}
