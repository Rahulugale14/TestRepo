package j.pomExplanation31stDec2021;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ex2AmazonHomePage31stDec2021 {

	// Declaration of WebElements
	@FindBy(xpath = "//a[@aria-label = 'Open Menu']")
	private WebElement openMenu;
	
	@FindBy(xpath = "(//a[text() = 'Best Sellers'])[2]")		 			
	private WebElement bestSellers;
	
	@FindBy(xpath = "(//a[text() = 'Books'])[2]")
	private WebElement books;
	
	
	// Initialization of WebElements
	public Ex2AmazonHomePage31stDec2021 (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	// Usage of WebElements
	public void clickOnALLTabOnTheHomePageOfAmazon()
	{
		openMenu.click();
	}
	
	public void clickOnBestSellersTab()
	{
		bestSellers.click();
	}
	
	public void clickOnBooksInBestSellers()
	{
		books.click();
	}
	
}
