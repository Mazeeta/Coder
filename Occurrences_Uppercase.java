package java1_introduction;

public class Occurrences_Uppercase 
{
	public static void main(String[] args) 
	{
		String strg="DEeeeeVED";
		char[] uppercase = new char [strg.length()];
		int count = 0, sum = 0, flag=0;
		
	    for(int i=0; i<strg.length(); i++)
	    {
	        if(Character.isUpperCase(strg.charAt(i)))
	        {
	        	uppercase[count] = strg.charAt(i);
	        	count++;
	        }
	    }
	    
	    System.out.println("Inputed String Length :: "+strg.length());
	    System.out.println("Converted Uppercase Array Length :: "+count);
	    
	    for(char alphabet = 'A'; alphabet <= 'Z';alphabet++) 
	    {
	    	for(int j=0; j<count; j++)
	    	{
	    		if(uppercase[j]==alphabet)
	    		{
	    			sum++;
	    			flag=1;
	    		}
	    	}
	    	if(flag==1)
	    	{
	    		System.out.println("Letter '"+alphabet+"' Occurrences :: "+sum);
	    		flag = sum = 0;
	    	}
	    	
	    }
	    
	}
	
}
