package j1.pomTestClassExplanation31stDec2021;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import j.pomExplanation31stDec2021.Ex2AmazonHomePage31stDec2021;
import j.pomExplanation31stDec2021.Ex2AmazonHomePageLogoAndSearch31stDec2021;

public class Ex2POMtestClass31stDec2021 {

public static void main (String [] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");   
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		Ex2AmazonHomePage31stDec2021 home = new Ex2AmazonHomePage31stDec2021(driver);
		home.clickOnALLTabOnTheHomePageOfAmazon();
		//Thread.sleep(3000);
		home.clickOnBestSellersTab();
		//Thread.sleep(3000);
		home.clickOnBooksInBestSellers();
		//Thread.sleep(3000);
		
		Ex2AmazonHomePageLogoAndSearch31stDec2021 homeNsearch = new Ex2AmazonHomePageLogoAndSearch31stDec2021(driver);
		homeNsearch.clickOnSearchFieldOnTheHomePageOfAmazon();
		//Thread.sleep(3000);
		homeNsearch.verifyAmazonHomePageLogo();
		//Thread.sleep(3000);
		homeNsearch.submitSearchInTheSearchFieldOfAmazonHomePage();
		//Thread.sleep(3000);
		driver.quit();
		
		
	}
	
}
