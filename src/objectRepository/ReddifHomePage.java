package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReddifHomePage {
	
	WebDriver driver;
	
	public ReddifHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

/*	By search = By.id("srchword");*/
	
	@FindBy(id="srchword")
	WebElement search;
	
	public WebElement Search()
	{
		return search;
		
	}
	
	
	
}
