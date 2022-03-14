package a1.locators11thDec2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex2_SeleniumLocators {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/r.php?r=101");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@class = 'inputtext _58mg _5dba _2ph-'][1]")).sendKeys("Rahul");
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//select[@aria-label = 'Day']"));
		Select s1 = new Select(ele);
		s1.selectByVisibleText("14");
		Thread.sleep(2000);

		WebElement ele1 = driver.findElement(By.xpath("//select[@aria-label = 'Month']"));
		Select s2 = new Select(ele1);
		s2.selectByVisibleText("May");
		Thread.sleep(2000);
		
		/*driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("8275072002");
		Thread.sleep(2000);
		
		driver.findElement(By.name("pass")).sendKeys("gfuysdgfusdgfd");
		Thread.sleep(2000);
		*/
		
		/* driver.findElement((By.xpath("//button[contains(@value, '1')]"))).click();		
		//driver.findElement(By.name("login")).click();
		//driver.quit();
		 * 
		 * */
		 
	}

}
