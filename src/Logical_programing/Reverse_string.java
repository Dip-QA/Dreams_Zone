package Logical_programing;

public class Reverse_string 
{

	public static void main(String[] args)
	{
		 String Org="Dipali";
		 // reverse string = ilapiD
		 
		 String rev="";// ilapiD
		
		      // i=5                5>=0     4
		                           //4>=0    3
		                           //3>=0    2
		                           //2>=0    1
		                           //1>=0    0
		                           //0>=0
		for(int i=Org.length()-1;   i>=0;   i--) 
		{
			                    //0
			rev = rev+Org.charAt(i);  //i+l+a+p+i+D
			
		}
		
		System.out.println(rev);
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
