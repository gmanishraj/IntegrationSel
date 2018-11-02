package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class BAsetest implements Const {
	public WebDriver driver;
	
	@BeforeSuite
	public void setuppath()
	{
		WebDriverManager.iedriver().setup();
		
	}
	
	@BeforeMethod
	public void openBrowser()
	{
		driver=new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.crmpro.com/index.html");
	}
	
//	@AfterMethod
//	public void closebrowser()
//	{
//		driver.close();
//	}

}
