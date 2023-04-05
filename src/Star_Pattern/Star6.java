package Star_Pattern;

public class Star6 
{
	public static void main(String[] args) {
		
    //  	*
	//    * *
	//  * * *
	//* * * *

		int Star=1;
		int Space=3;
		
		for(int i=1;  i<=4;  i++) 
		{
			
			for(int a=1; a<=Space; a++) 
			{
				System.out.print(" ");
				
			}
			for(int b=1;  b<=Star; b++) 
			{
				System.out.print("*");
				
			}
			System.out.println();
			Star++;
			Space--;
			
			
		}
		
		
		
	}

}
