package Testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.ReddifHomePage;
import objectRepository.ReddifLoginPage;

public class LoginApplication {
	WebDriver driver;
	ReddifLoginPage rd;
	ReddifHomePage rh;
	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver","C:/Softwares_Jars/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		rd= new ReddifLoginPage(driver);
		
		rd.Emailid().sendKeys("Hello");
		rd.Password().sendKeys("hello");
		rd.Submit().click();
		rd.Home().click();
		
		rh= new ReddifHomePage(driver);
		rh.Search().sendKeys("123"+Keys.ENTER); 
		
	}
	
	

}
