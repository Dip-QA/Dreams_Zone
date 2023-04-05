package Logical_program_practice;

public class reverse_sentense1
{
	public static void main(String[] args) {
		
		String org=" my name is dipali";
	 	
	   String	S1=reversentense(org);
		System.out.println(S1);
		
	}

	public static String reversentense(String Sentense) 
	{
		        String[]  text=Sentense.split(" ");
		        String rev="";
		        
		for(int i=text.length-1;   i>=0; i--) 
		{
			rev=rev+text[i]+" ";
			
		}        
		        
		 return rev;       
		
	}
	
	
	
	
	
	
	
}
