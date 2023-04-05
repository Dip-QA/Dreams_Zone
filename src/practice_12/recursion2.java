package practice_12;

public class recursion2 
{
	public static void main(String []args)
	{
		M1(19);
	}       
		
    public static void M1(int a) 
    {
    	if(a<0) 
    	{
    		return;
    		
    	}
    	System.out.print(a);
    	a=a-1;
    	M1(a);
    	
    }
}
