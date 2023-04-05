package Logical_programing;

public class Fibonacci_series1 
{
	// 0 1 2 3 5 8 13 
	
	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		
		int c;
		       //i=1    1<=6      2
		              //2<=6      3
		              //3<=6      4
		              //4<=6      5
		              //5<=6      6
		              //6<=6      7
		              //7<=6
		for(int i=1;    i<=6;    i++) 
		{
			    
			    c=a+b; //5+8=13
			
			System.out.println(c);//13
			
			  a=b;  //a=8
			  b=c;  //b=13
		}
		
		
		
	}

}
