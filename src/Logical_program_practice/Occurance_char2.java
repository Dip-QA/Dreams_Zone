package Logical_program_practice;

import java.util.HashMap;
import java.util.Set;

public class Occurance_char2
{
	
	public static void main(String[] args) {
		
		String Org="abcdabdaa";
		
		HashMap<Character,Integer>  Hp=new HashMap<Character,Integer>();
		
		 for(int i=1;  i<=Org.length()-1;  i++) 
		 {
			  char  ChareValue=Org.charAt(i);
			  
			  if(Hp.containsKey(ChareValue)) 
			  {
				  Hp.put (ChareValue, Hp.get(ChareValue)+1);
				  
			  }
			  else 
			  {
				  Hp.put(ChareValue, 1);
			  }
			 			 
		 }
		
		        Set<Character>    Keys=Hp.keySet();
		 
		 for(Character key:Keys) 
		 {
			 System.out.println(key+":"+Hp.get(key));
			 
		 }
		
	}
	

}
