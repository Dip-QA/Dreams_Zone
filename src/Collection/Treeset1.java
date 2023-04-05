package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset1 
{
	public static void main(String[] args) {
		
		TreeSet  Tr=new TreeSet();
		
		 Tr.add(500);
		 Tr.add(700);
		 Tr.add(100);
		 Tr.add(300);
		 Tr.add(200);
		
		System.out.println(Tr);
		
		
		System.out.println("--------for each loop--------");
		
		 for(Object S1:Tr) 
		 {
			System.out.println(S1); 
		 }
		
		System.out.println("---------iterator----------");
		
		   Iterator Itr =Tr. iterator();
		   while(Itr.hasNext()) 
		   {
			   System.out.println(Itr.next());
		   }
		   
		   // to get size of the object 
		   System.out.println(Tr.size());//6
		   
		   // is empty or not 
		   System.out.println(Tr.isEmpty());
		   
		   // info contain or not 
		   System.out.println(Tr.contains(500));
		   
		   // remove information 
		     Tr.remove(100);
		   System.out.println(Tr);
		
		   
		   // to remove first info
		      Tr.pollFirst();
		   System.out.println(Tr);
		   
		   // to remove last info
		       Tr.pollLast();
		       System.out.println(Tr);
		   
		       
		  // to get first info
		     System.out.println(Tr.first());
		     
		  // to get last info
		     System.out.println(Tr.last());
		     
		     
	}

}
