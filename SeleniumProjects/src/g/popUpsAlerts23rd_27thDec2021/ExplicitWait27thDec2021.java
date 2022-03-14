package g.popUpsAlerts23rd_27thDec2021;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait27thDec2021 {

	public static void main (String [] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// AJX - Asynchronous Javascript XML 
		
		driver.get("https://www.facebook.com/create");
		
		WebElement ele = driver.findElement(By.xpath("(//input[@id = 'email'])[1]"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys("Rahul Ugale");
		
		driver.quit();
		
	}
}
