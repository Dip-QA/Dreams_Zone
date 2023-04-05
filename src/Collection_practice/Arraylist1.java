package Collection_practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist1 
{
	
	public static void main(String[] args) {
		
		ArrayList al1=new ArrayList();
		
		
		   al1.add(30);
		   al1.add("Tau");
		   al1.add('T');
		   al1.add(9021837648L);
		   al1.add(true);
		 System.out.println(al1);
		   // to verify the size of the aaraylist
		    System.out.println(al1.size()); //5 return int 
		   
		   // to verify is it empty or not 
		    System.out.println(al1.isEmpty());// false returntype is boolean
		    
		    // to verify that t is present or not 
		    System.out.println(al1.contains('T'));//true  returntype is boolean
		   
		   // to find info by using index 
		    System.out.println(al1.get(3));// 9021837648   returntype object class
		   
		   // to find the index 
		    System.out.println(al1.indexOf(9021837648L));//3  returntype is int 
		    
		    // to add info in bet arraylist 
		      al1.add(2,26);            //returntype is boolean 
		    System.out.println(al1);
		   
		    // to remove info in bet arraylist 
		    al1.remove(0);               // returntype is object 
		    System.out.println(al1);
		    
		    // to update the info in the arralist 
		    al1.set(4, false);      // return type is object 
		    System.out.println(al1);
		    
		// to featch the info in the whole class 
		    
		    for(Object D1:al1) 
		    {
		    	System.out.println(D1);
		    	
		    }
		System.out.println("_______________________");    
		
		// to featch data from the arraylist 
		        Iterator Itr=al1.iterator();
		    
		 while(Itr.hasNext()) // 0---> true
		 {
			 System.out.println(Itr.next());//tau
		 }   
		  System.out.println("__________________________________");
		  
		  
		// to featch data from the arraylist
		          ListIterator  Ltr=al1.listIterator();
		 
		  while(Ltr.hasNext()) //0
		  {
			  System.out.println(Ltr.next());//tau
		  }
		 
		
		 
		    
	}
	
	
	
	
	
	

}
