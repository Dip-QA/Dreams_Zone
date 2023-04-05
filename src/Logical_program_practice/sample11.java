package Logical_program_practice;

public class sample11 
{
	public static void main(String[] args) {
		
		int Org=146;     // 1^1 + 4^4 + 6^6=1+64+
		int Sum=0;
		
		for(int i=Org;    i>0;   i=i/10) 
		{
			  int   rem=i %10;
			
			    Sum=Sum+(rem*rem*rem);   
			
		}
		
		if(Org==Sum) 
		{
			System.out.println("Given no. are armstrong");
			
		}
		else 
		{
			System.out.println("Given no are not armstrong");
		}
		
		
		
	}

}
