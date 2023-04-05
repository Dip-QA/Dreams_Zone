package Logical_programing;

public class reverse_sentence1
{
	public static void main(String[] args) {
		
		  String Org="I am playing";
		
		  String S1=reversesentense(Org);
		
		 System.out.println(S1);
		
	}
	                                                    //0       1      2
	 public static String reversesentense(String Sentence) //I     am    playing
	 {
		                   
		  String[] Text=Sentence.split(" ");
		 
		      String rev="";
		 
		  for(int i=Text.length-1;   i>=0;    i-- ) 
		  {
			  
			  rev=rev+Text[i]+" ";
			  
			  
		  }
		      
		      
		 return rev;     
		      
		      
		 
	 }
	
	
	
	
	
}
