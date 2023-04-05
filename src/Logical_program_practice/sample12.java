package Logical_program_practice;

public class sample12
{
	public static void main (String[]args)
	{
	  int Org=4567;  //7654
	  int rev=0;//7654

	       //i=4567    4567>0    4567/10=456.7
	                  //456      456/10=45.6
	                   //45      45/10=4.5
	                   //4
	 for(int i=Org;     i>0;    i=i/10)
	{          //4567%10=7
	           //456 % 10=6
	            //45 %10=5
	            //4 % 10=4
	       int  rem=i % 10;

	             rev=rev*10+rem;//765+4
	}
	System.out.println(rev);//




	}

}
