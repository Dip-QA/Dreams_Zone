package parameterization;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample13 
{  
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//To naviagate to Excelsheet
	FileInputStream file=new FileInputStream("C:\\Users\\com\\Downloads\\parametarization\\New Microsoft Excel Worksheet.xlsx");

    Sheet  Sh=WorkbookFactory.create(file).getSheet("Sheet4");
     
       int LastRowIndex= Sh.getLastRowNum();  //6
    
       for(int i=0;      i<=LastRowIndex;     i++) 
       {
    	
    	 //take Inner for loop for cell/Column
    	                            
    	   int LastcellIndex=Sh.getRow(i).getLastCellNum()-1;  
    	
    	       
    	   for(int a=0;      a<=LastcellIndex;          a++) 
    	   {                             
    		        String value=Sh.getRow(i).getCell(a).getStringCellValue();
    		        System.out.print(value+" ");  
    	   }
    	  System.out.println();
    	
    	
    	
    }
    
    
	        
	        
	        
	        
	        
	        
	        
	  
}	
	

}
