package Collection_practice;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1
{
    public static void main(String[] args) {
		
    	LinkedList L1=new LinkedList();
    	
    	// to add the info 
    	   L1.add("Dipali");
    	   L1.add(100);
    	   L1.add(30.80f);
    	   L1.add('D');
    	   L1.add(null);
    	   L1.add(null);
    	   L1.add(100);
    	
    	System.out.println(L1);
    	
    	System.out.println("---------for each loop-----------------");
    	// to get entired info 
    	for(Object S1:L1) 
    	{
    		System.out.println(S1);
    		
    	}
    	
    	
    	System.out.println("---------------iterator curser----------------------");
    	
    	 Iterator Itr=L1.iterator();
    	
    	  while(Itr.hasNext()) 
    	  {
    		  System.out.println(Itr.next());
    	  }
    	
    	// to get size 
    	  System.out.println(L1.size());//7
    	  
    	  
    	// is empty or not 
    	  System.out.println(L1.isEmpty());//false 
    	  
    	// info present or not 
    	  System.out.println(L1.contains('D'));
    	  
    	  
    	// to get index of the info 
    	  System.out.println(L1.indexOf("Dipali"));
    	  
    	// to get info by providing index 
    	  System.out.println(L1.get(0));// Dipali
    	
    	// to add info in bet 
    	    L1.add(4,50);                // Right shift operation 
    	  System.out.println(L1);
    	  
    	// to remove info in bet 
    	 L1.remove(4);
    	  System.out.println(L1);
    	  
    	// to update the info 
    	   L1.set(4, "Pawar");
    	   System.out.println(L1);
	}
	
	
	
	
	
	
	
	
	
	

}
