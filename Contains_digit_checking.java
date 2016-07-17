package java1_introduction;

public class Contains_digit_checking 
{
	static int number_to_check1 = 78982548;
	static int number_to_check2 = number_to_check1;
	
	public static void main(String[] args) 
	{
		int digit_to_check = 1, flag = 0;
		
		while (number_to_check1>0)
		{
			int temp_digit = number_to_check1 %10;
			
			if(temp_digit == digit_to_check)
			{
				System.out.println("The number ( "+number_to_check2+" ) contains a digit ( "+digit_to_check+" )");
				flag = 1;
				break;
			}
			
			number_to_check1 = number_to_check1/10;
		}
		
		if(flag == 0)
		{
			System.out.println("The number ( "+number_to_check2+" ) doesn't contains a digit ( "+digit_to_check+" )");
		}
		
	}

}
