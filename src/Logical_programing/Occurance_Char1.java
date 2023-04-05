package Logical_programing;

import java.util.HashMap;
import java.util.Set;

public class Occurance_Char1 
{
	
	 public static void main(String[] args) {
		
		 String Org="abcbcabd";
		 
		 HashMap<Character, Integer> Hp=new HashMap<Character,Integer>();
		 
		  for(int i=0;  i<=Org.length()-1; i++) 
		  {
			     char   Charvalue=Org.charAt(i);
			     
			     
			     if(Hp.containsKey(Charvalue)) 
			     {
			    	 Hp.put(Charvalue, Hp.get(Charvalue)+1);
			    	 
			     }
			     else 
			     {
			    	 Hp.put(Charvalue, 1);
			    	 
			     }
			  
		  }
		     Set<Character>  Keys=Hp.keySet();
		 
		    for(Character Key:Keys) 
		    {
		    	System.out.println(Key+": "+Hp.get(Key));
		    	
		    }
		 
		 
		 
	}
	
	
	
	
	
	
	
	
	
	
	

}
