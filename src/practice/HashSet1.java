package   practice ;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 
{
	public static void main(String[] args) {
		
		HashSet   hs=new HashSet();
		
		 hs.add(100);
		 hs.add("Dipa");
		 hs.add(20.33);
		 hs.add('D');
		 hs.add(null);
		 hs.add(null); // only one null value 
		 hs.add('D');  // duplicate value are not allowed 
		System.out.println(hs);
		
		// find length
		System.out.println(hs.size());
		
		// weather itis empty or not 
		System.out.println(hs.isEmpty());
		
		// ti find info 
		System.out.println(hs.contains('D'));
		
		//to remove info 
		System.out.println(hs.remove(null));
		
		// to featch the data 
		System.out.println("-------for each loop---------");
		 for(Object S1:hs) 
		 {
			 System.out.println(S1);
		 }
		
		System.out.println("---------iterator ------------");
		
		     Iterator    Itr=hs.iterator();
		 while(Itr.hasNext()) 
		 {
			 System.out.println(Itr.next());
		 }
		
		 
		 
		    
		 
		
	}
	
	
	
	
	
	
	

}
