package Logical_programing;

public class Palindrom1
{
	// Verify given String is palindrom or not 
	
	 public static void main(String[] args) {
		
		 String Org="madam";  //4--0
		 String rev="";//mad
		 
		 
		       //i=4                 4>=0       3
		                            //3>=0      2
		                            //2>=0      1
		                            //1>=0      0
		                            //0>=0      -1
		                            //-1>=0
		 for(int i=Org.length()-1;    i>=0;     i--) 
		 {
			                   //0
			   rev=rev+Org.charAt(i);//madam
			 
		 }
		    System.out.println(rev);//madam
		 
		if(Org.equals(rev)) 
		{
			System.out.println("Given string is palindrome");
		}    
		else 
		{
			System.out.println("Given string is not palindrome");
		}    
		    
		    
		 
		 
		 
	}
	
	
	
	

}
