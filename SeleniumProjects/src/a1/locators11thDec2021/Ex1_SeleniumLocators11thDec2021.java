package a1.locators11thDec2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_SeleniumLocators11thDec2021 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		//driver.findElement(By.id("/account/login?ret=/")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class = \"_2IX_2- VJZDxU\"]")).sendKeys("8275072002");
		driver.findElement(By.xpath("//input[@class = \"_2IX_2- VJZDxU\"]")).clear();
	}
}
