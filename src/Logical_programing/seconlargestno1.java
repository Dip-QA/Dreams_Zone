package Logical_programing;

public class seconlargestno1 
{
	 public static void main(String args[])
	   {
	      int temp, size;
	      int array[] = {10, 20, 25, 63, 96, 57};
	      size = array.length;

	      for(int i = 0; i<size; i++ )
	      {
	         for(int a = i+1;   a<size;   a++)
	         {

	            if(array[i]>array[a]){
	               temp = array[i];
	               array[i] = array[a];
	               array[a] = temp;
	            }
	         }
	      }
	      System.out.println("Third second largest number is:: "+array[size-2]);
	   }

}
