package Logical_program_practice;

public class sample13
{
	
	
	public static void main (String[]args)
	{
	   int Org=456;
	   int Sum=0;

	for(int i=Org;   i>0;    i=i/10)
	{
	   int  rem=i%10;

	  Sum=Sum*10+(rem*rem*rem);



	}
	if(Org==Sum)
	{
	  System.out.println("Given no. is armstrong");
	}
	else
	{
	  System.out.println("Given no. is not armstrong");
	}



	}

}
