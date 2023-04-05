package Logical_programing;
public class Reverse_no1
{
   public static void main(String[] args) {
	
	  int Org=1234;        //4321 
	   int rev=0; //4321
	   
              //i=1234	   1234>0       1234/10=123.4
	                     //123>0        123/10=12.3
	                      //12>0         12/10=1.2
	                      //1>0
	   for(int i=Org;      i>0;         i=i/10) 
	   {
		              //1234 %10=4
		              //123  % 10=3
		              //12  % 10=2
		               //1 % 10=1
		      int  rem= i %10;
		   
		            rev=rev*10+rem;//4320+1
		   
	   }
	   System.out.println(rev);
	   
	   
	   
	   
	   
}
		
		
	
	
	
	
	
		
		


}
