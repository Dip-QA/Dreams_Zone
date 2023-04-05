package Star_Pattern;

public class Star4
{
    public static void main(String[] args) {
	
    	        //*
    			//**
    			//***
    			//****
    	
    	int  Star=1; //2
    	
    	// outer loop for loop
    	       //1      1<=4     2
    	               //2<=4
    	for(int i=1;    i<=4;   i++) 
    	{
    		                //1<=2        2
    		                //2<=2
    		for(int a=1;     a<=Star;    a++) 
    		{
    			System.out.print("*"+" "); //*
    			                           //* *
    			
    		}
    		System.out.println();
    		Star++;
    	}
    	
    	
    	
    }
	
	
	
}
