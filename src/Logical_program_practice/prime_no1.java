package Logical_program_practice;

public class prime_no1 
{
	public static void main(String[] args) {
		
		int org=20;
		int Count=0;
		
		for(int i=2; i<org; i++) 
		{
			if(org % i==0) 
			{
				Count++;
				break;
				
			}
			
			
		}
		
		if(Count==0) 
		{
			System.out.println("prime no");
			
		}
		else 
		{
			System.out.println("not prime no.");
			
		}
		
		
		
	}
}
