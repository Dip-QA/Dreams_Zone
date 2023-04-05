package Logical_programing;

public class palindrome2
{
	// verify the given string is palindromic or not
	public static void main(String[] args) {
		
		String Org="mom";   //2--0
		String rev="";//mom
		       //i=2                2>=0      1
		                           //1>=0     0
		                           //0>=0
		for(int i=Org.length()-1;   i>=0;    i--) 
		{                       //0
			   rev=rev+Org.charAt(i);//mom
		}
		 System.out.println(rev);
		
		if(Org.equals(rev)) 
		{
			System.out.println("The given string is palindromic");
		}
		
		else 
		{
		   System.out.println("Given string is not Palindromic");	
		}
		
		
	}

}
