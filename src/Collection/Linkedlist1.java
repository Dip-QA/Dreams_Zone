package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlist1 
{
	public static void main(String[] args) {
		
		LinkedList L1=new LinkedList();
		
		 L1.add("Dipali");
		 L1.add(100);
		 L1.add('A');
		 L1.add(12.23f);
		 L1.add(100);
		 L1.add(null);
		 L1.add(null);
		System.out.println(L1);
		
		System.out.println("-----------for each loop------------");
		    
		for(Object S1:L1) 
		{
			System.out.println(S1);
			
		}
		
		
		System.out.println("---------iterator-----------");
		
		     Iterator  Itr=L1.iterator();	
		
		   while(Itr.hasNext()) 
		   {
			   System.out.println(Itr.next());
			   
		   }
		
		   
		   System.out.println("-----------ListIterator-------------");
		   
		              ListIterator  Ltr=L1.listIterator();
		   
		         while(Ltr.hasNext()) 
		         {
		        	 System.out.println(Ltr.next());
		         }
		   
		  
	}
	
	
	
	
	
	
	
	
	
	

}
