package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BAsepage;

public class Homepage extends BAsepage {
	
	

	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement loginbtn;
	
	
	public Homepage (WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void setusername(String un)
	{
		
		username.sendKeys(un);
	}
	public void setpasword(String pw)
	{
		
		password.sendKeys(pw);
	}
	
	public void login()
	{
		
		loginbtn.click();
	}
	
	
	

}
