package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;

public class Excel  {
	
	public static String getcellvalue(String path,String Sheet,int r,int c) 
	{
		
		 String v=" ";
		try {
			Workbook	wb = WorkbookFactory.create(new FileInputStream(path));
				
		
		v=wb.getSheet(Sheet).getRow(r).getCell(c).toString();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return v;
		
	}
		
	
	public static int getrowcount(String path,String Sheet) 
	{
		int rc=0;
		Workbook wb;
		try {
			wb = WorkbookFactory.create(new FileInputStream(path));
		 
		
		rc=wb.getSheet(Sheet).getLastRowNum();
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rc;
	}

}
