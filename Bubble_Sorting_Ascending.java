package java1_introduction;

public class Bubble_Sorting_Ascending 
{
	static int[] array = {10,1,2,9,8,5,4,3,7,6};
	
	static void printArray()
	{
		for(int x=0; x<array.length; x++)
		{
			if(x<array.length-1)
				System.out.print(array[x]+" , ");
			else
				System.out.print(array[x]+" }\n\n");
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.print("The given array is :: { ");
		printArray();
		
		for(int i=0;i<array.length; i++)
		{
			int count = i+1;
			
			for(int j=1;j<array.length;j++)
			{
				if(array[j-1]>array[j])
				{
					int temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}
			
			System.out.print("Traversal "+count+" :: { ");
			printArray();
		}
		
		System.out.print("The bubble sorted array is :: { ");
		printArray();
		
	}

}
