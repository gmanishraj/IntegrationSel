package testScript;

import org.testng.annotations.Test;

import generic.BAsetest;
import generic.Excel;
import pages.Homepage;

public class Testclasslogin extends BAsetest{
	
	
	@Test
	public void runloginpage() 
	{
		 
//		
//	String	un = Excel.getcellvalue(xlpath, "Sheet1", 1, 0);
//		
//	String	pw = Excel.getcellvalue(xlpath, "Sheet1", 1, 1);
		
		
		Homepage h =new Homepage(driver);
		h.setpasword("Raj@123");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		h.setusername("rajmohan");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        h.login(); 		
	}

}
