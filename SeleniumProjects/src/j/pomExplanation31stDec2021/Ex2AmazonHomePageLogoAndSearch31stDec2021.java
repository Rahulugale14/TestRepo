package j.pomExplanation31stDec2021;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ex2AmazonHomePageLogoAndSearch31stDec2021 {

	//Declaration of WebElements
	@FindBy(xpath = "//a[@aria-label = 'Amazon']")
	private WebElement amazonLogo;
	
	@FindBy(xpath = "//input[@id = 'twotabsearchtextbox']")
	private WebElement searchField;
	
	@FindBy(xpath = "//input[@id = 'nav-search-submit-button']")
	private WebElement submitSearch;
	
	//Initialization of WebElements
	public Ex2AmazonHomePageLogoAndSearch31stDec2021(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Usage of WebElements
	public void verifyAmazonHomePageLogo()
	{
		boolean result = amazonLogo.isDisplayed();
		
		if (result == true)
		{
			System.out.println("Logo is visible");
		}
		else
		{
			System.out.println("Logo is not visible");
		}
	}
	
	public void clickOnSearchFieldOnTheHomePageOfAmazon()
	{
		searchField.sendKeys("The Secret");
	}
	
	public void submitSearchInTheSearchFieldOfAmazonHomePage()
	{
		submitSearch.click();
	}
	
}
