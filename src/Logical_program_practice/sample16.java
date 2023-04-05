package Logical_program_practice;

public class sample16
{
	public static void main(String[] args) {
		
		String Org="My name is dipali";
		
	  String S1=reversesentense(Org);
		System.out.println(S1);
	}

	public static String  reversesentense(String sentense) 
	{
		   String[] Text=sentense.split(" ");
		 
		   String rev="";
		
		 for(int i=Text.length-1;    i>=0; i--) 
		 {
			 rev=rev+Text[i]+" ";
			 
		 }
		
		return rev;
		
		
	}
	
	
	
	
	
}
