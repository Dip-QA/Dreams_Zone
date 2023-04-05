package Logical_programing;

public class White_Spaces1 
{
	public static void main(String[] args) {
		
		String Org="ab cd s g ";
		
		 int Count=0;
		
		for(int i=0; i<=Org.length()-1;  i++) 
		{
			         char CharValue=Org.charAt(i);
			         
			     if(CharValue==' ') 
			     {
			    	 Count++;
			    	 
			     }    
			
		}
		System.out.println(Count);
		
		
	}

}
