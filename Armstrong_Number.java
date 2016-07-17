package java1_introduction;

public class Armstrong_Number
{
	static int power(int digit, int count)
	{
		int value = 1;
		
		for(int i=1; i<=count; i++)
		{
			value = value * digit;
		}
		
		return value;
	}
	
	public static void main (String args[])
	{
		int num1 = 153, temp, count = 0, sum = 0;
		
		temp = num1;
		
		while(temp>0)
		{
			temp = temp / 10;
			count++;
		}
		
		temp = num1;
		
		while(temp>0)
		{
			int digit = temp % 10;
			sum  = sum + power(digit , count);
			temp = temp / 10;
		}
		
		if(num1 == sum)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not an Armstrong Number");
		
	}
	
}
