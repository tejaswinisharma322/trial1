package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Login
{
	@FindBy(xpath=".//span[contains(text(),'Enter Email/Mobile number')]")
	private WebElement usernametb;
	
	@FindBy(xpath=".//span[contains(text(),'Enter Password')]")
	private WebElement Passwordtb;
	
	@FindBy(xpath="(.//span[contains(text(),'Login')])[2]")
	private WebElement loginbtn;
	
	public Login (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
		
	public void username()
	{
		usernametb.sendKeys("8904778470");
	}
	
	public void password()
	{
		Passwordtb.sendKeys();
	}
	
	public void loginbutton()
	{
		loginbtn.click();
	}
	
}