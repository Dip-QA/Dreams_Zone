package Logical_program_practice;

public class sample10 
{
	public static void main(String[] args) {
		
		int Org=90218;  //81209
		int rev=0;
		
		for(int i=Org;      i>0;      i=i/10) 
		{
			       int  rem=i %10;
			
			            rev=rev*10+rem;
		}
		
		System.out.println(rev);
		
		
		
	}

}
