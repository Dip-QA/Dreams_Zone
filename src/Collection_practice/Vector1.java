package Collection_practice;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector1 
{
	
	public static void main(String[] args) {
		
		Vector V1=new Vector();
		
		    V1.add("Dipali");
		    V1.add(200);
		   V1.add(35.20f);
		   V1.add('D');
		   V1.add(9021837648L);
		
		// 1) to featch the data of the vector 
		   
		   for(Object S1:V1)//0 1
		   {
			   System.out.println(S1);// Dipali 200 // one by one 
			   
		   }
		   
		   System.out.println("-----------------------");
		   
		// 2)    itrator curser 
		     
		           Iterator  Itr=V1.iterator();
		      while(Itr.hasNext()) 
		      {
		    	  System.out.println(Itr.next());
		      }     
		   
		
		// 3) listIterator curser
		      
		        ListIterator  Ltr=V1.listIterator();
		    while(Ltr.hasNext()) 
		    {
		    	System.out.println(Ltr.next());
		    }  
		      
		      
		System.out.println("-----------------------");    
		
		
	     // to get the capacity /size of the arraylist
		 System.out.println(V1.size());//4
		
		// to check weather it is empty or not 
		System.out.println(V1.isEmpty());//false
		
		// to check weather info present or not 
		System.out.println(V1.contains("Dipali")); //true
		
		// to get index of the info
		System.out.println(V1.indexOf("Dipali"));//0
		
		// to get the info by using index 
		System.out.println(V1.get(0));// Dipali
		
		// to ad info bet index 
		  V1.add(2, "Yahu");
		System.out.println(V1);
		
		
		// to remove the data bet the index 
		   V1.remove(2);
		System.out.println(V1);
		
		
		
		
		
		
		
		
		      
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
