package Logical_program_practice;

public class sample15
{
	public static void main(String[]args)
	{
	  String Org="nitin";  
	  String  rev="";

	 for(int i=Org.length()-1;     i>=0;   i--)
	{
	     rev=rev+Org.charAt(i);


	}
	if(Org.equals(rev))
	{
	 System.out.println("Given string is palindrom");
	}
	else
	{
	 System.out.println("Given String is not palindrom");

	}


	}

}
