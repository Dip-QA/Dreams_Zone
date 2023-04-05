package Logical_programing;

public class Armstrong1
{
	public static void main(String[] args) {
		
		int Org=153;      // 1^1     +   5^5   + 3^3
	                      //1+125+27=153
		int Sum=0;//153
		
		       //i=153      153>0     153/10=15.3
		                   //15>0     15/10=1.5
		                   //1>0
		for(int i=Org;       i>0;      i=i/10) 
		{             //153 %10=3
			          //15 % 10=5
			           //1 % 10=1
			    int Rem=i % 10;
		
			        Sum=Sum + (Rem*Rem*Rem);//152+1
			
			
		}
		
		if(Org==Sum) 
		{
			System.out.println("Given value is Armstrong");
		}
		else 
		{
			System.out.println("Givem no. is not ArmStrong");
		}
		
		
		
		
		
	}

}
