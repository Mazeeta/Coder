package java1_introduction;

public class Prime_Number
{
	public static void main (String args[])
	{
		int check_num = 1, flag = 0;
		int half = check_num /2;
		
		for(int i=2; i<=half; i++)
		{
			if(check_num % i == 0)
			{
				System.out.println("Not a Prime Number");
				flag = 1;
				break;
			}
		}
		
		if(flag==0 && check_num !=1)
		{
			System.out.println("Prime Number");
		}
		else if(check_num == 1)
		{
			System.out.println("Not a Prime Number");
		}
	}
}
