package Collection_practice;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vector2 
{ public static void main(String[] args) {
	
	 Vector V1=new Vector();
	
	 V1.add(100);
	 V1.add("Dipa");
	 V1.add(30.56f);
	
	// to get info 
	 System.out.println("------------for each loop-----------");
	
	 for(Object S1:V1) 
	 {
		 System.out.println(S1);
	 }
	
	 
	 System.out.println("----------iterator ----------");
	 
	   Iterator  Itr=V1.iterator();
	 
	  while(Itr.hasNext()) 
	  {
		  System.out.println(Itr.next());
		  
	  }
	 
	  System.out.println("-------------listIterator-----------");
	     ListIterator  Ltr=V1.listIterator();
	  
	  while(Ltr.hasNext()) 
	  {
		  System.out.println(Ltr.next());
	  }
	  
	  System.out.println("-----------Enumeration------------");
	  
	  Enumeration enu=V1.elements();
	  
	  while(enu.hasMoreElements()) 
	  {
		  System.out.println(enu.nextElement());
	  }
	  
	
}

}
