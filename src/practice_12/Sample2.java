package practice_12;

import org.testng.annotations.Test;

public class Sample2
{
	@Test
	public void m1() 
	{
		 int Org=371;
		    int rev=0;//367

		       //i=371      371>0    371/10=37.1

		                
		 for(int i=Org;     i>0;     i=i/10)
		{


		        //371 %10 = 1
			    //37 % 10=7
		  int  rem=i % 10;
		               
		          rev=rev+(rem*rem*rem);//363


		}

		if(Org==rev)
		{
		 System.out.println("It is Armstrong no.");

		}
		else
		{
		System.out.println("It is  not Armstrong no.");

		}


		
		
		
	}

}
