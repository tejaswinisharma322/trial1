package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//
public class flipkart_login
{
	@FindBy(xpath=".//span[contains(text(),'Enter Email/Mobile number')]")
	private WebElement usernametb;
	
	@FindBy(xpath=".//span[contains(text(),'Enter Password')]")
	private WebElement passwordtb;
	
	public flipkart_login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

public void username()
{ 
	usernametb.sendKeys("8904778470");
}
///
public void password()
{ 
	passwordtb.sendKeys("Teju@123");
}

}
	