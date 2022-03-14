package a1.locators11thDec2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_SeleniumLocators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hotstar.com/in");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Sports")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Cricket")).click();
		Thread.sleep(3000);
		
		driver.quit();
	}

}
