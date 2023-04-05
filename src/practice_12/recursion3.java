package practice_12;

public class recursion3
{

	  public static void main(String[] args) 
	  {
	    int M1 = (int) M1(9);
	    System.out.println(M1);//
	  }

	  // A recursive Java example to sum all natural numbers up to a given long. 

	  public static long M1(int number) {
	  // Stop the recursive Java program at zero 
		   //9 !=0
	    if (number != 0)
	    {
	      return number + M1(number - 1);
	    } 
	    else 
	    {
	      return number;
	    }
	    
	  }
}
