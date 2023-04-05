package practice_12;

public class recursin_factorial1 
{
	 public static void main(String args[]) 
	 {
	    int nFactoriral = (int) factorialProgram(9);
	    System.out.println(nFactoriral);
	  }

	  /* Java factorial program with recursion. */
	  public static long factorialProgram(int i)
	   {
	    if (i <= 1)
	    {
	      return 1;
	    } 
	    else
	   {
	      return i * factorialProgram(i - 1);
	    }

	   }
}
