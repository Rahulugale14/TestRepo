package j.pomExplanation31stDec2021;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ex1ActiTimeLoginPage31stDec2021 {
		
		// Declaration of WebElements
		@FindBy(xpath = "//input[@id = 'username']")
		private WebElement un; 
		
		@FindBy(xpath = "//input[@name = 'pwd']")
		private WebElement pw;
		
		@FindBy(xpath = "//div[text() = 'Login']")
		private WebElement loginButton;
	
		
		// Initialization of WebElements
		public Ex1ActiTimeLoginPage31stDec2021(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		
		// Usage
		public void enterActiTimeLoginPageUsername()
		{
			un.sendKeys("admin");
		}
		
		public void enterActiTimeLoginPagePassword()
		{
			pw.sendKeys("manager");
		}
		
		public void clickOnActiTimeLoginPageLoginButton()
		{
			loginButton.click();
		}
}
