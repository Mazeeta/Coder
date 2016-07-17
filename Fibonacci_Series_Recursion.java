package java1_introduction;

public class Fibonacci_Series_Recursion
{
	static int num1 = 0, num2 = 1, num3, count = 10;
	
	static void fib(int count)
	{
		if(count > 0)
		{
			num3 = num1 + num2;
			System.out.print(" "+num3);
			num1 = num2;
			num2 = num3;
			fib(count-1);
		}

	}
	public static void main(String args[])
	{
		System.out.print(num1+" "+num2);
		fib(count-2);
	}
	
}
