package Logical_program_practice;

public class WhiteSpaces1
{
	public static void main(String[] args) {
		
		String Org="ab ca d";
		
		 int Count=0; //2
		
		       //i=0    0<=6                 1
		              //1<=6                 2
		              //2<=6                 3
		               //3<=6                4
		               //4<=6                5
		               //5<=6                6
		 for(int i=0;   i<=Org.length()-1;   i++ ) 
		 {
			                       //6
			     char  S1=Org.charAt(i); //d
			 
			       //d
			     if(S1==' ') 
			     {
			    	 Count++; //
			    	 
			     }
			     
			     
			     
		 }
		  System.out.println(Count);
		
		
		
		
		
	}

}
