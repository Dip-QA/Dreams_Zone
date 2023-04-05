package Logical_programing;

public class prime_No1 
{
  // prime no = 7---> 1     2 3 4 5 6    7
	public static void main(String[] args) {
		
		int org=7;
		
		int Count=0;
		
		      //i=2       2<7       3
		                //3<7       4
		                //4<7       5
		                //5<7       6
		                //6<7       7
		               //7<7
		for(int i=2;      i<org;   i++) 
		{
			 //1==0
			if(org % i==0) 
			{
				Count++;
				break;
				
			}
			
			
		}
		 //0==1
		if(Count==1) 
		{
			System.out.println("The Given no is not prime no");
			
		}
		else 
		{
			System.out.println("The Given no is  prime no");
			
		}
		
		
		
	}

}
