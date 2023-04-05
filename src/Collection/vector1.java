package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vector1 
{
	
	public static void main(String[] args) {
		
		Vector V1=new Vector();
		
		    V1.add("Dipa");
		    V1.add(100);
		    V1.add('D');
		    V1.add(10.30f);
		    V1.add(100);
		    V1.add(null);
		    V1.add(null);
		    
		    System.out.println(V1);
		
		// to get the data of the vector class
		    System.out.println("-----for each loop-------");
		    
		    for(Object S1:V1) // one by one info copy 
		    {
		    	System.out.println(S1);
		    	
		    }
		    
		    
		    // to get data of the vector class with heplk of iterator curser
		     System.out.println("--------------iterator curser------------");
		    
		             Iterator Itr=V1.iterator();
		    
		          while(Itr.hasNext()) 
		          {
		        	  System.out.println(Itr.next());
		          }
		          
		    // by using listiterator 
		          System.out.println("--------- by using listiterator ---------------");
		          
		          ListIterator  Ltr=V1.listIterator();
		          
		        while(Ltr.hasNext()) // 0-->Dipa-->true
		        {
		        	System.out.println(Ltr.next());// Dipa
		        }  
		          
		          
		     // by using Enumeration curser
		        System.out.println("--------- by using Enumeration curser----------");
		         Enumeration  Enu=V1.elements();
		         
		          while (Enu.hasMoreElements()) //0-->Dipa---->true
		          {
		        	  System.out.println(Enu.nextElement());//Dipa
		          }
		          
		          System.out.println("------------Methods--------------");
		          
		       // to find the size of the data 
		          System.out.println(V1.size()); //7
		          
		        // to find weather it is empty or not 
		          System.out.println(V1.isEmpty()); // false
		          
		        // to find the index of the info 
		      System.out.println(V1.indexOf("Dipa"));//0
		          
		        // to find the info by usoing index
		      System.out.println(V1.get(2));//D
		        
		      
		   // to update the info 
		       V1.set(5, 150);
		     System.out.println(V1); 
		      
		      
		  // To add the info in bet  // right shift operation 
		      V1.add(6,"Pawar");
		      System.out.println(V1);
		      
		  // to remove the   info in bet // left shift operation 
		      V1.remove(6);
		      System.out.println(V1);
		      
		// to verify info present or not 
		      System.out.println(V1.contains(150));// true
		      
		      
		      
		      
		      
		      
	}
	
	
	
	
	
	

}
