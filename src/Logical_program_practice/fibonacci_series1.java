package Logical_program_practice;

public class fibonacci_series1
{
	public static void main(String[] args) {
		
		// 0 1 1 2 3 5 8 13 21
		
		int a=0;
		int b=1;
		int c;
		      //i=1     1<=7    2
		               //2<=7   3
		               //3<=7   4
		               //4<=7   5
		               //5<=7   6
		               //6<=7   7
		               //7<=7   8
		               //8<=7
		for(int i=1;    i<=7;  i++) 
		{
			   c=a+b;//8+13=21
			
			System.out.println(c);//21
			
			a=b;//a=13
			b=c;//b=21
			
		}
		
		
	}
	

}
