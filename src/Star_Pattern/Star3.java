package Star_Pattern;

public class Star3
{
	public static void main(String[] args) {
		
		//1 2 3 4
		//1  //* * * *
		//2  //* * * *
		//3  //* * * *
		
		// outer loop for rows
		      //i=1     1<=3
		for(int i=1;    i<=3;   i++) 
		{
			      //a=1        1<=4        2
			                  //2<=4       3
			                  //3<=4       4
			                  //4<=4       5
			                 //5<=4
			for(int a=1;       a<=4;      a++) 
			{
				System.out.print("*"+" ");//* * * *
				                          //
				
				
			}
			System.out.println();
			
			
		}
		
		
		
		
		
		
	}

}
