package j1.pomTestClassExplanation31stDec2021;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import j.pomExplanation31stDec2021.Ex1ActiTimeHomePage31stDec2021;
import j.pomExplanation31stDec2021.Ex1ActiTimeLoginPage31stDec2021;

public class Ex1POMtestClass31stDec2021 {

public static void main (String [] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");   
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://localhost/login.do");
		
		Ex1ActiTimeLoginPage31stDec2021 log = new Ex1ActiTimeLoginPage31stDec2021(driver);
		log.enterActiTimeLoginPageUsername();											// these are navigation steps
		Thread.sleep(3000);
		log.enterActiTimeLoginPagePassword();
		Thread.sleep(3000);
		log.clickOnActiTimeLoginPageLoginButton();
		Thread.sleep(10000);
		
		
		Ex1ActiTimeHomePage31stDec2021 home = new Ex1ActiTimeHomePage31stDec2021(driver);
		home.verifyActiTimeHomePageLogo();
		Thread.sleep(3000);
		home.clickOnLogoutLinkInActiTimeHomePage();
		Thread.sleep(10000);
		
		driver.quit();
		

	}
}
