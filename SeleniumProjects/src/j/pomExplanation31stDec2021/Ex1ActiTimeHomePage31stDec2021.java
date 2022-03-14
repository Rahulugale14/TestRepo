package j.pomExplanation31stDec2021;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ex1ActiTimeHomePage31stDec2021 {

	// Declaration of WebElements
	@FindBy(xpath = "//img[@src = 'img/default/top_nav/default-logo.png?hash=274618146']")
	private WebElement header;
	
	@FindBy(xpath = "//a[@id = 'logoutLink']")
	private WebElement logOut;
	
	
	
	// Initialization of WebElements
	public Ex1ActiTimeHomePage31stDec2021(WebDriver driver)
	{
		PageFactory.initElements(driver, this);				//for hidden elements
	}
	
	
	
	// Usage
	public void verifyActiTimeHomePageLogo()
	{
		boolean result = header.isDisplayed();
		
		if (result == true)
		{
			System.out.println("Logo is visible");
		}
		
		else
		{
			System.out.println("Logo is not visible");
		}
	}
	
	public void clickOnLogoutLinkInActiTimeHomePage()
	{
		logOut.click();
	}
	
	
}
