package Logical_programing;

import org.testng.annotations.Test;

public class reverse_no2 
{
	@Test
	public void M1() 
	{
		int Org=6789;
		 int rev=0;//9876

		       //1=6789    6789>0   6789/10=678.9
		                  //678     678/10=67.8
		                   //67     67/10=6.7
		                   //6
		 for(int i=Org;     i>0;    i=i/10)
		{
		             //6789 % 10=9
		               //678 % 10=8
		               //67 % 10= 7
		               //6 % 10=6 
		       int  rem= i % 10;

		                      //7
		          rev= rev*10 +rem;//987
		}
		 System.out.println(rev);
		
		
	}

}
