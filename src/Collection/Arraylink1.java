package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylink1 
{
	public static void main(String[] args)
	{
		ArrayList al1=new ArrayList();  // default size 10
		
		// to add information/data
		
		    al1.add("Dipali"); //0
		    al1.add(100);      //1
		    al1.add('D');      //2
		    al1.add(60.20f);   //3
		    al1.add("Null");    //4
		    al1.add("null");    //5
		System.out.println(al1);
		   // to verify arrelist is empty or not 
		    System.out.println(al1.isEmpty()); //false
		    
		    
		   // to verify the size/capacity of the arraylist
		    System.out.println(al1.size()); //6
		    
		    // // to verify the information present int the arraylist 
		    System.out.println(al1.contains("Dipali"));  // true
		    
		    
		    // to find the index of the information 
		    System.out.println(al1.indexOf(100));  //1
		    
		    
		    // to find the data or information with help of index 
		    System.out.println(al1.get(0));
		    
		    
		    // to add info in bet arraylist
		      al1.add(1,300);
		    System.out.println(al1); // Right shift operation 
		    
		    //to delete info from arraylist
		      al1.remove(1);
		System.out.println(al1);  // left shift operation
		
		
		// to update the arralist
		   al1.set(4, "Dinesh");
		System.out.println(al1);
		
		
		// to get,featch whole data of the arraylist
		
		 for(Object S1:al1)// Dipali 100
		 {
			 System.out.println(S1);//Dipali 100 //one by one info print 
			 
		 }
		
		System.out.println("_________________________________");
		 
		      // to featch the data from arraylist
		      ListIterator  Ltr=al1.listIterator();
		
		while(Ltr.hasNext()) 
		{
			System.out.println(Ltr.next());
		}
		
		System.out.println("___________________________________");
		
		
		   Iterator Itr=al1.iterator();
		
		while(Itr.hasNext()) 
		{
			System.out.println(Itr.next());
		}
		
		
		
		
		
		
		
		 
	}
	
	
	
	
	

}
