package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReddifLoginPage {
	
	WebDriver driver;
	public ReddifLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	/*By username = By.id("login1");
	By password = By.cssSelector("input[name='passwd']");
	By signin = By.xpath("//input[@type='submit']");
	By home = By.linkText("rediff.com");*/
	
	
	@FindBy(id="login1")
	WebElement username;
	
	@FindBy(css="input[name='passwd']")
	WebElement password;
	
	@FindBy(xpath= "//input[@type='submit']")
	WebElement signin;
	
	@FindBy(linkText = "rediff.com")
	WebElement home;
			
	
	
	
	
	
	
	public WebElement Emailid()
	{
	return username;
	}
	
	public WebElement Password()
	{
	return password;
	}
	
	public WebElement Submit()
	{
	return signin;
	}
	public WebElement Home()
	{
	return home;
	}
	
	
}
