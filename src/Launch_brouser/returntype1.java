package Launch_brouser;

public class returntype1
{
	public static void main(String[] args)
	{
		int num1=Addition(10,20);//30
		System.out.println(num1);// 30
		
		String Sn=StundentInfo("Dipali");
		System.out.println(Sn);
		
		char Capital=Substraction('D');
		System.out.println(Capital);
		
		 String info=M1("dipa");
		 System.out.println(info);
	}
	
	public static int Addition(int a, int b) 
	{
	         int sum=a+b;//30
	   return sum;
	  
	}

   public static String StundentInfo(String sname)
   {
	   return sname;// Dipali
   }
	
	public static char Substraction(char a) 
	{
		return a; // D
		
	}
	
	public static String M1(String b) 
	{
		
		   return b;
	}
	
	
	
	
	
	

}
