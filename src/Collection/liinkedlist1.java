package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;


public class liinkedlist1 
{
	
	public static void main(String[] args) {
		
		LinkedHashSet L1=new LinkedHashSet();
		
		 L1.add("Dipali");
		 L1.add(100);
		 L1.add(12.60);
		 L1.add('D');
		 L1.add('D');  //duplicate 
		 L1.add(null);
		 L1.add(null);  //duplicate 
		System.out.println(L1);
		
		System.out.println("---------for each loop----------");
		
		for(Object S1:L1) 
		{
			System.out.println(S1);
		}
		
		System.out.println("---------iterator ------------");
		
		 Iterator Itr=L1.iterator();
		
		  while(Itr.hasNext()) 
		  {
			  System.out.println(Itr.next());
			  
		  }
		  
	 // to find the size 
		  System.out.println(L1.size());//5
		  
		// is empty or not 
		  System.out.println(L1.isEmpty());//false
		  
		// info present or not 
		  System.out.println(L1.contains('D'));//True
		  
		  // to remove info 
		    L1.remove(4);
		 System.out.println(L1);   
		    
		    
	}

}
