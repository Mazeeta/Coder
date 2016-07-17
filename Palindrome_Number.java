package java1_introduction;

public class Palindrome_Number
{
	public static void main (String args[])
	{
		int check_num = 157 , digit, reverse_num = 0;
		int temp_num = check_num;
		
		while(temp_num > 0)
		{
			digit = temp_num % 10;
			reverse_num = digit + (reverse_num * 10);
			temp_num = temp_num / 10;
		}
		
		if(check_num == reverse_num)
			System.out.println("The Given Number is a Palindrome Number");
		else
			System.out.println("The Given Number is Not a Palindrome Number");
		
	}
}
