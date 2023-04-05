package Logical_program_practice;

public class sample9
{
	public static void main(String[]args)
	{
	  String Org="nitin";
	  String rev="";

	for(int i=Org.length()-1;   i>=0;   i--)
	{
	    rev=rev+Org.charAt(i);//n


	}
	System.out.println(rev);//nitin

	if(Org.equals(rev))
	{
	 System.out.println("Given string is palindrom");
	}
	else
	{
	  System.out.println("Given string is not  palindrom");

	}
	
	}

}
